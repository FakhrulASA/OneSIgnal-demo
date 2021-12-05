package com.fakhrulasa.onesignal

import android.app.Application
import com.onesignal.OneSignal

class MyApp : Application() {
    private val ONESIGNAL_APP_ID = "42f678cb-7f83-45e0-bfd6-e35c5f6885e4"
    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}