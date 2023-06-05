package com.example.ticketease.MVVM.HelloPages

import android.content.SharedPreferences
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.ticketease.DataClasses.Person.Role
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HelloPage7ViewModel @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel(){
    var cityState = mutableStateOf("")
    var roleState = Role.valueOf(prefs.getString("role", null)!!).toString()

    fun city(city : HelloPage7ChooseCity){
        when(city){
            is HelloPage7ChooseCity.City -> cityState.value = city.value.toString()
            is HelloPage7ChooseCity.SaveCity -> putCity()
        }
    }

    private fun putCity() {
        prefs.edit().putString("city", cityState.value)!!.apply()
    }

}