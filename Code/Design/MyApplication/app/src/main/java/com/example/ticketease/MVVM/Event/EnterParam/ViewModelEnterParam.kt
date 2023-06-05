package com.example.ticketease.MVVM.Event.EnterParam

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.ticketease.DataClasses.Event.EventDTO
import com.example.ticketease.DataClasses.Person.BuyerWithoutPswd
import com.example.ticketease.DataClasses.PlaceTime.PlaceTimeDTO
import com.example.ticketease.DataClasses.Ticket.TicketDTO
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class ViewModelEnterParam  @Inject constructor(
    private val prefs : SharedPreferences
) : ViewModel() {
    var state by mutableStateOf(EventDTO())
    var statePlace = mutableStateOf("")
    var stateDate = mutableStateOf("")

    //var stateTicket by mutableStateOf(TicketDTO())

    fun enter(enter : EnterParamStateTextFields){
        when(enter){
            is EnterParamStateTextFields.Name -> state = state.copy(name = enter.value)
            is EnterParamStateTextFields.Cost -> statePlace.value = enter.value
            is EnterParamStateTextFields.Date -> stateDate.value = enter.value
            is EnterParamStateTextFields.Description -> state = state.copy(description = enter.value)
            is EnterParamStateTextFields.Genre -> state = state.copy(genre = enter.value)
            is EnterParamStateTextFields.NameGroup -> state = state.copy(nameGroup = enter.value)
            is EnterParamStateTextFields.Type -> state = state.copy(type = enter.value)
            is EnterParamStateTextFields.Enter ->{
                prefs.edit().putString("price", statePlace.value).apply()
                prefs.edit().putString("date", stateDate.value).apply()
                prefs.edit().putString("event", Gson().toJson(state)).apply()


            }
        }
    }

}
