package com.example.ticketease.MVVM.Person.Organizer.Avtorize

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Person.BuyerRequest
import com.example.ticketease.DataClasses.Person.OrganizerRequest
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtRepository
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtResult
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtStateTextFields
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModelAvtOrg @Inject constructor(
    private val repository : AvtRepositoryOrg,
    private val prefs : SharedPreferences
) : ViewModel() {
    var flag : Boolean = false
    var state by mutableStateOf(OrganizerRequest())
    private val resultChannel = Channel<AvtResultOrg<Unit>>()
    var avtorizeResults = resultChannel.receiveAsFlow()


    fun avtorize(regist : AvtStateTextFieldsOrg) {
        when(regist){
            is AvtStateTextFieldsOrg.Login -> state = state.copy(login = regist.value)
            is AvtStateTextFieldsOrg.Password -> state = state.copy(password = regist.value)
            is AvtStateTextFieldsOrg.AvtOrg ->{
                avt()
            }
        }

    }

    private fun avt(){
        viewModelScope.launch {
            val result = repository.avtorizeOrg(state)
            flag = true
            resultChannel.send(result)
        }
    }

}