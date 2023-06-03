package com.example.ticketease.MVVM.Person.Organizer.CitySelectorOrg

import android.content.SharedPreferences
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelCitySelectorOrg@Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel(){
    var cityState = mutableStateOf("")

    fun city(city : CitySelectorOrg){
        when(city){
            is CitySelectorOrg.City -> cityState.value = city.value.toString()
            is CitySelectorOrg.SaveCity -> putCity()
        }
    }

    private fun putCity() {
        prefs.edit().putString("city", cityState.value)!!.apply()
    }

}