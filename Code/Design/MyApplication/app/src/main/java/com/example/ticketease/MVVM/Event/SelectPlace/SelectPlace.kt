package com.example.ticketease.MVVM.Event.SelectPlace

import com.example.ticketease.DataClasses.Person.Cities
import com.example.ticketease.MVVM.HelloPages.HelloPage7ChooseCity

sealed class SelectPlace {
    data class Place(val value : String) : SelectPlace()
    //data class Capacity(val value : String) : SelectPlace()

    object selectPlace : SelectPlace()
}