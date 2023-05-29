package com.example.ticketease.MVVM.Person.Buyer.Avtorize

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Person.*
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class ViewModelAvtBuyer @Inject constructor(
    private val repository : AvtRepository,
    private val prefs : SharedPreferences
) : ViewModel() {
    val city: SharedPreferences.Editor = prefs.edit().putString("city","Voronezh") // TODO delete this
    var flag : Boolean = false
    var state by mutableStateOf(BuyerRequest())
    private val resultChannel = Channel<AvtResult<Unit>>()
    var avtorizeResults = resultChannel.receiveAsFlow()


      fun avtorize(regist : AvtStateTextFields) {
        when(regist){
            is AvtStateTextFields.Login -> state = state.copy(login = regist.value)
            is AvtStateTextFields.Password -> state = state.copy(password = regist.value)
            is AvtStateTextFields.AvtBuyer ->{
                avt()
            }
        }

    }

    private fun avt(){
        viewModelScope.launch {
            val result = repository.avtorize(state)
            flag = true
            resultChannel.send(result)
        }
    }

}