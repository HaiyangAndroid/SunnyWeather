package com.johnny.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @author  johnny
 * @date 2020-06-29
 * @desc
 */

data class Location(val lng: String, val lat: String)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class PlaceResponse(val status: String, val places: List<Place>)