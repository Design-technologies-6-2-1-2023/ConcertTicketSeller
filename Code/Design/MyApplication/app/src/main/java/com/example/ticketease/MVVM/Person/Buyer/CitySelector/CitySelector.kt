package com.example.ticketease.MVVM.Person.Buyer.CitySelector

import com.example.ticketease.DataClasses.Person.Cities
import com.example.ticketease.MVVM.HelloPages.HelloPage7ChooseCity
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtStateTextFields

sealed class CitySelector {
    data class City(val value : Cities) : CitySelector()
    object SaveCity : CitySelector()
    object citySelector: CitySelector()

}