package com.nonamer777.madlevel2task1.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nonamer777.madlevel2task1.R
import com.nonamer777.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter(private val places: List<Place>):

    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val binding = ItemPlaceBinding.bind(itemView)

        fun dataBind(place: Place) {
            binding.tvPlaceText.text = place.name
            binding.ivPlaceImage.setImageResource(place.imageResId)
        }
    }

    /**
     * Creates and returns a ViewHolder object,
     * inflating a standard layout called ``
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
    )

    /** Returns the size of the list. */
    override fun getItemCount(): Int = places.size

    /** Called by RecyclerView to display the data at the specified position. */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.dataBind(places[position])
}