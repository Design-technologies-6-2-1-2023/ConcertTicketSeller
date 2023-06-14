package com.example.ticketease.MVVM.Person.NAUser.CorerctCity

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Person.BuyerUpdateCity
import com.example.ticketease.DataClasses.Person.Cities
import com.example.ticketease.MVVM.Person.Buyer.CitySelector.CitySelector
import com.example.ticketease.MVVM.Person.Buyer.CitySelector.CitySelectorRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModelCitySelectorNAUser@Inject constructor(
    private val prefs : SharedPreferences,
) : ViewModel(){
    var cityState = mutableStateOf("")

    fun city(city : CitySelectorNAUser){
        when(city){
            is CitySelectorNAUser.City -> cityState.value = city.value.toString()
            is CitySelectorNAUser.SaveCity -> putCity()

        }
    }

    private fun putCity() {
        prefs.edit().putString("city", cityState.value)!!.apply()
    }

}