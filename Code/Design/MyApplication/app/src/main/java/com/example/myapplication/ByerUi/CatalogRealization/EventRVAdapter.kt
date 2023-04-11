package com.example.myapplication.ByerUi.CatalogRealization
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


class EventRVAdapter
    (
    private val eventModalArrayList: ArrayList<EventModal>, private val context: Context
) :
    RecyclerView.Adapter<EventRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.event_rv_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modal = eventModalArrayList[position]
        holder.EventLocation.text = modal.EventLocation
        holder.EventDate.text = modal.EventDate
        holder.costTV.text= modal.cost.toString()
        holder.EventTitle.text=modal.EventTitle
    }

    override fun getItemCount(): Int {
        return eventModalArrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val EventDate: TextView
        val EventLocation: TextView
        val costTV:TextView
        val EventTitle:TextView

        init {
            EventDate = itemView.findViewById(R.id.idDate)
            EventLocation = itemView.findViewById(R.id.idEventLoc)
            costTV=itemView.findViewById(R.id.idCost)
            EventTitle=itemView.findViewById(R.id.idEventTitle)
        }
    }
}