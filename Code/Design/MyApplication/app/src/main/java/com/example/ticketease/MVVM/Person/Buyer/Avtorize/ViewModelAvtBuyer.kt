package com.example.ticketease.MVVM.Person.Buyer.Avtorize

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Person.*
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
    var state by mutableStateOf(BuyerRequest())
    private val resultChannel = Channel<AvtResult<Unit>>()
    var avtorizeResults = resultChannel.receiveAsFlow()


      fun avtorize(regist : AvtStateTextFields) {
        when(regist){
            is AvtStateTextFields.Login -> state = state.copy(login = regist.value)
            is AvtStateTextFields.Password -> state = state.copy(password = regist.value)
            is AvtStateTextFields.AvtBuyer ->{
                Avt()
            }
        }

    }

    private fun Avt(){
        viewModelScope.launch {
            val result = repository.Avtorize(state)
            flag = true
            resultChannel.send(result)
        }
    }

}