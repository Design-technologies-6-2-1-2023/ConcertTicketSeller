package com.example.myapplication.ByerUi.CatalogRealization

import android.content.Context
import android.view.LayoutInflater
import android.view.*
import android.view.ViewGroup
import android.widget.*
import androidx.cardview.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


class CategoriesRVAdapter
    (
    private val categoriesModalArrayList: ArrayList<CategoriesModal>, private val context: Context
) :
    RecyclerView.Adapter<CategoriesRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.event_categories_rv_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val modal = categoriesModalArrayList[position]
        holder.categoryTV.text = modal.EventCategory
        val adapter = EventRVAdapter(modal.eventModalArrayList, context)
        holder.newsRV.layoutManager = LinearLayoutManager(context)
        holder.newsRV.adapter = adapter

        val expanded = modal.isExpanded
        if (expanded) {
            holder.newsCV.visibility = View.VISIBLE
        } else {

            holder.newsCV.visibility = View.GONE
        }

        holder.categoryTV.setOnClickListener {
            modal.isExpanded = !modal.isExpanded

            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return categoriesModalArrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val newsRV: RecyclerView
        val categoryTV: TextView
        val newsCV: CardView

        init {
            newsCV = itemView.findViewById(R.id.idCVCategory)
            categoryTV = itemView.findViewById(R.id.idTVCategory)
            newsRV = itemView.findViewById(R.id.idRVNews)
        }
    }
}