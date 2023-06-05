package com.example.ticketease.MVVM.Event.SelectPlace

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceId
import com.example.ticketease.DataClasses.PlaceTime.PlaceType
import com.example.ticketease.MVVM.Event.getTime.getTimeRepository
import com.example.ticketease.MVVM.Person.Organizer.Personal.PersonalRepositoryOrg
import com.google.gson.Gson
import com.ticketEase.backend.DataClasses.Place.TypeOfPlace
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel

class SelectPlaceViewModel @Inject constructor(
    private val prefs : SharedPreferences,
    private val repository: getTimeRepository

) : ViewModel(){
    var placeState by  mutableStateOf(PlaceDTO())
    fun place(place : SelectPlace){
        when(place){
            is SelectPlace.Place -> placeState = placeState.copy(name = place.value)
            is SelectPlace.Id-> placeState=placeState.copy(id=place.value)
            //is   SelectPlace.Capacity->placeState = placeState.copy(capacity = place.value)
            is SelectPlace.selectPlace -> putCity()
        }
    }

    private fun putCity() {
        //var state by mutableStateOf(Gson().fromJson(prefs.getString("event",null)!!, EventDTO::class.java))
        //prefs.edit().putString("place", placeState.value)!!.apply()
        prefs.edit().putString("place", Gson().toJson(placeState.name)).apply()

        prefs.edit().putString("id", Gson().toJson(placeState.id)).apply()

    }
    fun getTime(){
        viewModelScope.launch {
            val city  = prefs.getString("place",null)!!
            val id=prefs.getString("id", null)!!.toLong()

            val result = repository.get(PlaceId(id))
            prefs.edit().putString("placeTimeDTO",Gson().toJson(result)).apply()

        }
    }

}