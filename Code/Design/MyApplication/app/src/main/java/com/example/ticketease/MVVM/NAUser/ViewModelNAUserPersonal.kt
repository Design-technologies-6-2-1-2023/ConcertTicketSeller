package com.example.ticketease.MVVM.NAUser

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelNAUserPersonal @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel() {
    var city  = prefs.getString("city","Moscow")
}
