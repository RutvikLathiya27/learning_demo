package com.example.learningdemo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication : Application() {



    override fun onCreate() {
        super.onCreate()
    }
}