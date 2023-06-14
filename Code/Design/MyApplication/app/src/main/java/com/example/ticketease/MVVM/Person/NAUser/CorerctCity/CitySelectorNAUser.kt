package com.example.ticketease.MVVM.Person.NAUser.CorerctCity

import com.example.ticketease.DataClasses.Person.Cities
import com.example.ticketease.MVVM.Person.Buyer.CitySelector.CitySelector

sealed class CitySelectorNAUser {
    data class City(val value : Cities) : CitySelectorNAUser()
    object SaveCity : CitySelectorNAUser()
}