package com.d.four.f.healthapp

import android.app.Application
import com.d.four.f.healthapp.di.modulesArr
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            androidLogger()
            modules(modulesArr)
        }
    }
}