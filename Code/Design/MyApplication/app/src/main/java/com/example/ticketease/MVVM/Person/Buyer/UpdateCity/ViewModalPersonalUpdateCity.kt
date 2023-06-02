package com.example.ticketease.MVVM.Person.Buyer.UpdateCity

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.ticketease.DataClasses.Person.BuyerUpdateCity
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel

class ViewModalPersonalUpdateCity @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel() {
    var city  = prefs.getString("city","Moscow")
    var state by mutableStateOf(Gson().fromJson(prefs.getString("buyer",null)!!, BuyerUpdateCity::class.java))
}

