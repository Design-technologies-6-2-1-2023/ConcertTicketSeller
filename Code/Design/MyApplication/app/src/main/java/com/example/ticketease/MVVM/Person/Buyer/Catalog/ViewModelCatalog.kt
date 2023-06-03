package com.example.ticketease.MVVM.Person.Buyer.Catalog

import android.content.SharedPreferences
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ticketease.DataClasses.Catalog
import com.example.ticketease.DataClasses.Person.Cities
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel

class ViewModelCatalog @Inject constructor(
    private val repository : CatalogRepository,

    private val prefs : SharedPreferences
) : ViewModel() {
    var city  = prefs.getString("city",null)!!


    fun getCatalog(): Flow<List<Catalog>> {
        return flow {
            val data = repository.catalog(city)
            emit(data)
        }.flowOn(Dispatchers.IO)
    }

    //val catalog= runBlocking { repository.catalog(city) }

}

private fun cityByString(cityString:String): Cities{

    return when (cityString) {
        "Moscow" -> {
            Cities.Moscow
        }
        "Voronezh" -> {
            Cities.Voronezh
        }
        "SaintPetersburg" -> {
            Cities.SaintPetersburg

        }
        else -> Cities.Moscow
    }
}