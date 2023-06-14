package com.example.ticketease.MVVM.Person.NAUser.NAUerPersonal

import android.content.SharedPreferences
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelNAUserPersonal @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel() {
    var city  = prefs.getString("city",null)!!


}
