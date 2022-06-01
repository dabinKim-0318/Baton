package com.depromeet.baton

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.naver.maps.map.NaverMapSdk
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BatonApp : Application() {
    companion object{
        const val TAG: String = "BATON-APP"
    }
    override fun onCreate() {
        super.onCreate()
        initLogger()
        NaverMapSdk.getInstance(this).client =
            NaverMapSdk.NaverCloudPlatformClient(BuildConfig.NAVER_SDK_CLIENT_KEY)
    }

    private fun initLogger() {
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}
