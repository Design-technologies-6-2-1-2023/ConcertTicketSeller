package com.example.ticketease.MVVM.Person.Buyer.Avtorize

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Person.Buyer
import com.example.ticketease.DataClasses.Person.Cities
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class ViewModelAvtBuyer @Inject constructor(
    private val repository : AvtRepository,
) : ViewModel() {
    var flag : Boolean = false
    var state by mutableStateOf(Buyer())

    private val resultChannel = Channel<AvtResult<Unit>>()


    fun register(regist : AvtStateTextFields){
        when(regist){
            is AvtStateTextFields.Login -> state = state.copy(login = regist.value)
            is AvtStateTextFields.Password -> state = state.copy(password = regist.value)
            is AvtStateTextFields.AvtBuyer ->{
                signIn()
            }

        }

    }

    private fun signIn(){
        viewModelScope.launch {
            flag = true
            val result = repository.Avtorize(state)
            resultChannel.send(result)
        }
    }

}