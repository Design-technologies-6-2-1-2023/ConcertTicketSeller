package com.example.ticketease.MVVM.Event.SelectPlace

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class SelectPlaceViewModel @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel(){
    var placeState by  mutableStateOf(PlaceDTO())
    fun place(place : SelectPlace){
        when(place){
            is SelectPlace.Place -> placeState = placeState.copy(name = place.value)
            //is   SelectPlace.Capacity->placeState = placeState.copy(capacity = place.value)
            is SelectPlace.selectPlace -> putCity()
        }
    }

    private fun putCity() {
        //var state by mutableStateOf(Gson().fromJson(prefs.getString("event",null)!!, EventDTO::class.java))
        //prefs.edit().putString("place", placeState.value)!!.apply()
        prefs.edit().putString("placeDTO", Gson().toJson(placeState.name)).apply()

    }

}