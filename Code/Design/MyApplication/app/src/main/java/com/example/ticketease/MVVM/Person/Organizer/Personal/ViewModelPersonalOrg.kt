package com.example.ticketease.MVVM.Person.Organizer.Personal

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Person.OrganizerWithoutPswd
import com.example.ticketease.DataClasses.PlaceTime.PlaceType
import com.example.ticketease.MVVM.Person.Buyer.Personal.PersonalRepository
import com.google.gson.Gson
import com.ticketEase.backend.DataClasses.Place.TypeOfPlace
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModelPersonalOrg @Inject constructor(
    private val prefs : SharedPreferences,
    private val repository: PersonalRepositoryOrg

    ) : ViewModel() {
    var city  = prefs.getString("city","Moscow")
    var state by mutableStateOf(Gson().fromJson(prefs.getString("organizer",null)!!, OrganizerWithoutPswd::class.java))


    fun createPlace() {
        viewModelScope.launch {
            val city  = prefs.getString("city",null)!!
            val placetype= PlaceType(TypeOfPlace.WITHOUT, city)

            val result = repository.get(placetype)
            prefs.edit().putString("PlaceDTO",Gson().toJson(result)).apply()

        }
    }
}