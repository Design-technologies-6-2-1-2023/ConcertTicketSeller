package com.example.ticketease.MVVM.Person.NAUser

import android.content.SharedPreferences
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelNAUserPersonal @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel() {
    var cityState = mutableStateOf("")

    fun city(city : NAUserPersonal){
        when(city){
            is NAUserPersonal.GetCity -> getCity()
        }
    }

    private fun getCity() {
        cityState.value = prefs.getString("city", null)!!
    }
}
