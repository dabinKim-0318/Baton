package com.depromeet.baton.map.data.repositoryImpl

import android.location.Location
import com.depromeet.baton.map.base.BaseApiResponse
import com.depromeet.baton.map.data.KakaoGeoService
import com.depromeet.baton.map.data.dataSource.GPSDataSource
import com.depromeet.baton.map.data.model.KakaoGeoModel
import com.depromeet.baton.map.data.model.KakaoGeoResponse
import com.depromeet.baton.map.domain.entity.AddressEntity
import com.depromeet.baton.map.domain.repository.AddressRepository
import com.depromeet.baton.map.util.NetworkResult
import com.naver.maps.geometry.LatLng
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class AddressRepositoryImpl  @Inject constructor(private val gpsDataSource:GPSDataSource) :
    AddressRepository, BaseApiResponse() {
    private val kakaoGeoService =KakaoGeoService()

    override suspend fun getLocation() :Flow<NetworkResult<AddressEntity>> =flow<NetworkResult<AddressEntity>>{
        gpsDataSource.getLocation().collect{
                it-> emit(NetworkResult.Success(it.mapToDomain()))
        }
    }.catch { e ->
        emit(NetworkResult.Error(e.toString()))
    }

    override suspend  fun getMyAddress() :Flow<NetworkResult<AddressEntity>> = flow {
         gpsDataSource.getLocation().collect{
            getKakaoApiResult( it.location.latitude,it.location.longitude).collect{
                result-> emit(checkApiResult( it.location.latitude,it.location.longitude,result))
            }
        }
    }.catch { e -> NetworkResult.Error<AddressEntity>(e.toString()) }.flowOn(Dispatchers.IO)


    //Kakao Api 호출
    private  suspend fun getKakaoApiResult ( latitude : Double ,longitude : Double)
        = flow{
             emit(safeApiCall {  kakaoGeoService.getAddressFromLocation(longitude, latitude)!! })
        }.catch { e -> emit(NetworkResult.Error(e.toString())) }.flowOn(Dispatchers.IO)


    private fun checkApiResult(_latitude : Double,  _longitude :Double,request :NetworkResult<KakaoGeoResponse>) :  NetworkResult<AddressEntity > {
        return if(request.data?.meta!!.total_count ==0 ) NetworkResult.Error("위치정보를 찾을 수 없습니다")
        else {
            val result= KakaoGeoModel(_latitude,_longitude,request)
            NetworkResult.Success<AddressEntity>(result.mapToDomain(result.roadAddress))
        }
    }

    override fun stopAddressRequest() : Unit{
        gpsDataSource.stopLocationUpdates()
    }

    override suspend fun GPStoAddress(location : LatLng)  =
        flow<NetworkResult<AddressEntity>>{
            getKakaoApiResult (location.latitude,location.longitude)
                .collect{
                    emit(checkApiResult( location.latitude,location.longitude,it))
                }
        }.catch { e -> NetworkResult.Error<AddressEntity>(e.toString()) }.flowOn(Dispatchers.IO)


   /* override fun AddresstoGPS(address: String){
        TODO : gps -> address
    }*/
}