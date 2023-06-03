package com.example.ticketease.MVVM.Event.SelectTime

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.ticketease.DataClasses.PlaceTime.PlaceTimeDTO
import com.example.ticketease.MVVM.Event.SelectPlace.SelectPlace
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class SelectTimeViewModel  @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel(){
    var placeTime by  mutableStateOf(PlaceTimeDTO())

    fun place(place : SelectPlace){
        when(place){
            is SelectPlace.Place -> placeTime.date = place.value
            is SelectPlace.selectPlace -> putCity()
        }
    }

    private fun putCity() {
        //var state by mutableStateOf(Gson().fromJson(prefs.getString("event",null)!!, EventDTO::class.java))
        //prefs.edit().putString("place", placeState.value)!!.apply()
        prefs.edit().putString("placeTimeDTO", Gson().toJson(placeTime.date)).apply()

    }

}