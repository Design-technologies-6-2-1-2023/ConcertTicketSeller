package com.example.ticketease.MVVM.Person.Buyer.Personal

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Person.BuyerResponse
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterRepository
import com.google.gson.Gson
import com.google.gson.JsonParser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModelPersonal @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel() {
    var city  = prefs.getString("city","Voronezh")
    var state by mutableStateOf(Gson().fromJson(prefs.getString("buyer",null)!!,BuyerWithoutPswd::class.java))
    }


