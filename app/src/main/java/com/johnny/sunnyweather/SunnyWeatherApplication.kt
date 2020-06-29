package com.johnny.sunnyweather

import android.app.Application
import android.content.Context

/**
 * @author  johnny
 * @date 2020-06-29
 * @desc
 */
class SunnyWeatherApplication: Application() {

    companion object{
        lateinit var context: Context
        const val TOKEN = "MzKrIaHhhNi0cDLi"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}