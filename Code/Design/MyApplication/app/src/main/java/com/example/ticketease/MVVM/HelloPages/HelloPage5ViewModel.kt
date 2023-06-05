package com.example.ticketease.MVVM.HelloPages

import android.content.SharedPreferences
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HelloPage5ViewModel @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel(){
    var state = mutableStateOf("")

    fun role(role : HelloPage5ChooseRole){
        when(role){
            is HelloPage5ChooseRole.TypeRole -> state.value = role.value.toString()
            is HelloPage5ChooseRole.SaveRole ->{
                putRole()
            }
        }
    }


    private fun putRole() {
        prefs.edit().putString("role",state.value)!!.apply()
    }
}