package com.example.ticketease.MVVM.Person.Organizer.CitySelectorOrg

import com.example.ticketease.DataClasses.Person.Cities

sealed class CitySelectorOrg {
    data class City(val value : Cities) : CitySelectorOrg()
    object SaveCity : CitySelectorOrg()
}