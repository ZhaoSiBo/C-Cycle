package com.lorizhao.ccycle.application

import android.app.Application
import timber.log.Timber

class CCycleApplication : Application() {
    companion object {
        private lateinit var application: Application
        fun getInstance(): Application {
            return application
        }
    }
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

    }
}