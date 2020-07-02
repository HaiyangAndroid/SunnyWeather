package com.johnny.sunnyweather.ui.place

import androidx.arch.core.util.Function
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.johnny.sunnyweather.logic.Repository
import com.johnny.sunnyweather.logic.model.Place
import java.util.ArrayList

/**
 * @author  johnny
 * @date 2020-07-02
 * @desc
 */
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

    val placeLiveData = Transformations.switchMap(searchLiveData) {
        Repository.searchPlaces(it)
    }

    val placeList = ArrayList<Place>()
}