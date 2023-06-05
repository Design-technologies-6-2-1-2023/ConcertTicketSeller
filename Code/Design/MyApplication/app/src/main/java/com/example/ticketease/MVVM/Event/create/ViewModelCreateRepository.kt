package com.example.ticketease.MVVM.Event.create

import android.content.SharedPreferences
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Event.EventId
import com.example.ticketease.DataClasses.Event.EventIdCount
import com.example.ticketease.DataClasses.Ticket.TicketCountWithPrice
import com.example.ticketease.MVVM.Event.getEvents.getEventsRepository
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel

class ViewModelCreateRepository @Inject constructor(
    private val repository : CreateRepository,

    private val prefs : SharedPreferences
) : ViewModel() {
    fun putID(eventId : Long){
        prefs.edit().putString("eventId", eventId.toString()).apply()
    }
    fun putCapacity(eventId: String){
        prefs.edit().putString("capacity", eventId).apply()
    }
    fun putRow(row : Int){
        prefs.edit().putString("row", row.toString()).apply()
    }
    fun putColumn(column : Int){
        prefs.edit().putString("column", column.toString()).apply()
    }

    fun putPrice(price: String){
        prefs.edit().putString("price", price).apply()
    }
    fun craete(){
        viewModelScope.launch {
            var id = prefs.getString("eventId","10")!!.toLong()
            var capacity = prefs.getString("capacity","10")!!.toLong()
            var row = prefs.getString("row","10")!!.toInt()
            var column = prefs.getString("column","10")!!.toInt()
            var price = prefs.getString("price","10")!!.toDouble()
            var place=TicketCountWithPrice(id, capacity, row, column, price)
            repository.create(place)

        }
    }
}