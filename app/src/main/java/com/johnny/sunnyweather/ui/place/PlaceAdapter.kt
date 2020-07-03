package com.johnny.sunnyweather.ui.place

import android.system.Os
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.johnny.sunnyweather.R
import com.johnny.sunnyweather.logic.model.Place
import kotlinx.android.synthetic.main.place_item.view.*

/**
 * @author  johnny
 * @date 2020-07-03
 * @desc
 */
class PlaceAdapter(private val placeList: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvPlaceName = itemView.findViewById<TextView>(R.id.placeName)
        val tvPlaceAddress = itemView.findViewById<TextView>(R.id.placeAddress)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.place_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return placeList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = placeList[position]
        holder.tvPlaceName.text = place.name
        holder.tvPlaceAddress.text = place.address
    }
}