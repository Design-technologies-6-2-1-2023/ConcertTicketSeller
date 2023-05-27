package com.example.ticketease.MVVM.Person.Buyer.Personal

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Person.Buyer
import com.example.ticketease.DataClasses.Person.BuyerResponse
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.DataClasses.Person.Cities
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.token
import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult
import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterRepository
import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterStateTextFields
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel

class ViewModelPersonal @Inject constructor(
    private val repository : PersonalRepository,
    private val prefs : SharedPreferences
) : ViewModel() {
    var flag : Boolean = false
    var state by mutableStateOf(BuyerResponse())
    private val resultChannel = Channel<PersonalResult<Unit>>()
    val personalResults = resultChannel.receiveAsFlow()


     fun personal(personal : PersonalStateTextFields): BuyerWithoutPswd {
        when(personal){
            is PersonalStateTextFields.PersonalBuyer ->{
                state = state.copy(token =prefs.getString("token",token)!!)
               return pers()
            }
        }
    }

     fun pers(): BuyerWithoutPswd {
         var result= BuyerWithoutPswd("всвы", "высвы", "высвы", "", "")
         viewModelScope.launch {

             flag = true
              result = repository.getByToken(state)
             //resultChannel.send(result)
         }
         return result

     }
    }


