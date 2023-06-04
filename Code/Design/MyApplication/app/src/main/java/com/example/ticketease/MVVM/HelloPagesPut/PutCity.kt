package com.example.ticketease.MVVM.HelloPagesPut

import android.annotation.SuppressLint
import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import com.example.ticketease.DataClasses.Person.Cities
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class putCity @Inject constructor(
    private val prefs : SharedPreferences
): ViewModel() {
    @SuppressLint("CommitPrefEdits")
    fun put(city:Cities) {
        prefs.edit().putString("city", city.toString())
    }


}