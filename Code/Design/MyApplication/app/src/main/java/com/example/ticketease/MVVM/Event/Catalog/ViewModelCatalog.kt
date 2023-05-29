package com.example.ticketease.MVVM.Event.Catalog

import android.content.SharedPreferences
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Event.EventDTO
import com.example.ticketease.DataClasses.Person.Buyer
import com.example.ticketease.DataClasses.Person.Cities
import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult
import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterRepository
import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterStateTextFields
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModelCatalog @Inject constructor(
    private val repository : CatalogRepository,
    private val prefs : SharedPreferences
) : ViewModel() {
    var flag : Boolean = false


    private val catalogChannel = Channel<CatalogResult<Unit>>()
    val catalogResults = catalogChannel.receiveAsFlow()


    fun catalog() {
           get()
        }


    private fun get() {
        viewModelScope.launch {
            flag = true
            val result = repository.getAllEvents()
            catalogChannel.send(result)

        }
    }

}
