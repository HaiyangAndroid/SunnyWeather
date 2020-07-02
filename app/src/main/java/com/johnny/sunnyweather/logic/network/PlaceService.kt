package com.johnny.sunnyweather.logic.network

import com.johnny.sunnyweather.SunnyWeatherApplication
import com.johnny.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author  johnny
 * @date 2020-06-29
 * @desc
 */
interface PlaceService {
    @GET("v2/place?toke=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}