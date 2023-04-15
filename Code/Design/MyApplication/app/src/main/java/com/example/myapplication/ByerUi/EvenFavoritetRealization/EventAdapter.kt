package com.example.myapplication.ByerUi.EvenFavoritetRealization

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ByerUi.EventModal
import com.example.myapplication.R

class EventAdapter internal constructor(context: Context?, private val states: List<EventModal>) :
    RecyclerView.Adapter<EventAdapter.ViewHolder>() {
    private val inflater: LayoutInflater

    init {
        inflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.event_rv_item_favorite, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val state = states[position]
        holder.nameView.text = state.EventDate
        holder.capitalView.text = state.EventLocation
        holder.costView.text= state.cost.toString()
        holder.EventTitleView.text=state.EventTitle
        holder.ImageViewMy.setImageResource(state.image)
    }

    override fun getItemCount(): Int {
        return states.size
    }

    class ViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {
        var EventTitleView: TextView
        val costView: TextView
        val nameView: TextView
        val capitalView: TextView
        val ImageViewMy:ImageView

        init {
            nameView = view.findViewById(R.id.idDate)
            capitalView = view.findViewById(R.id.idEventLoc)
            EventTitleView=view.findViewById(R.id.idEventTitle)
            costView=view.findViewById(R.id.idCost)
            ImageViewMy=view.findViewById(R.id.imageViewMy)
        }
    }
}