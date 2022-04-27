package com.depromeet.baton.map.presentation

import androidx.lifecycle.*
import com.depromeet.baton.map.domain.usecase.GetAddressUseCase
import com.depromeet.baton.map.util.NetworkResult
import com.depromeet.baton.map.util.UiState
import com.naver.maps.geometry.LatLng
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MapViewModel  @Inject constructor(
    private val addressUseCase: GetAddressUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel(){

    private val _uiState = MutableStateFlow<UiState>(UiState.Loading)
    val uiState: StateFlow<UiState>
        get() = _uiState

    private val _address : MutableLiveData<NetworkResult<String>> = MutableLiveData()
    val address: LiveData<NetworkResult<String>> = _address

    //현재 내 위치 정보 받아오기
    fun getMyAddress()= viewModelScope.launch {
        _address.value =NetworkResult.Loading()
        addressUseCase.getMyAddress().collect{
             values ->
            when(values){
                is NetworkResult.Success ->{
                    Timber.e(values.data)
                    _address.value =values
                    _uiState.value = UiState.Success(values)
                    addressUseCase.stopLocationUpdate()
                }
                is NetworkResult.Error ->{
                    Timber.e(values.message)
                }
                is NetworkResult.Loading->{
                    _uiState.value = UiState.Loading
                }
            }
        }
    }

    fun gpsToAddress (location : LatLng) = viewModelScope.launch {
        _address.value =NetworkResult.Loading()
        addressUseCase.gpsConverter(location).collect{
                values ->
            when(values){
                is NetworkResult.Success ->{
                    Timber.e(values.data)
                    _address.value =values
                    _uiState.value = UiState.Success(values)
                    addressUseCase.stopLocationUpdate()
                }
                is NetworkResult.Error ->{
                    Timber.e(values.message)
                }
                is NetworkResult.Loading->{
                    _uiState.value = UiState.Loading
                }
            }
        }
    }


}
