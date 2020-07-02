package com.johnny.sunnyweather.logic

import androidx.lifecycle.liveData
import com.johnny.sunnyweather.logic.model.Place
import com.johnny.sunnyweather.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

/**
 * @author  johnny
 * @date 2020-07-02
 * @desc
 */
object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val response = SunnyWeatherNetwork.searchPlaces(query)
        val result = if (response.status == "ok") {
            Result.success(response.places)
        } else {
            Result.failure<List<Place>>(RuntimeException("response status is ${response.status}"))
        }
        emit(result)
    }
}