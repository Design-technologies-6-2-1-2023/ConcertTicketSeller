package com.example.ticketease.MVVM.Event.getTime

import android.content.SharedPreferences
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.ticketease.DataClasses.PlaceTime.PlaceDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceTimeDTO
import com.example.ticketease.DataClasses.PlaceTime.PlaceType
import com.example.ticketease.MVVM.Event.getEvents.getEventsRepository
import com.google.gson.Gson
import com.ticketEase.backend.DataClasses.Place.TypeOfPlace
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel

class ViewModelgetTimeRepository @Inject constructor(

    private val prefs : SharedPreferences
) : ViewModel() {

    var state = mutableStateOf(Gson().fromJson(prefs.getString("placeTimeDTO",null)!!, Array<PlaceTimeDTO>::class.java).toList())
}