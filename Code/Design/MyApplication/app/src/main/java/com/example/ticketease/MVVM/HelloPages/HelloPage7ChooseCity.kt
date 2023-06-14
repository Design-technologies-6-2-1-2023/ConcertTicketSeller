package com.example.ticketease.MVVM.HelloPages

import com.example.ticketease.DataClasses.Person.Cities

sealed class HelloPage7ChooseCity {
     data class City(val value : Cities) : HelloPage7ChooseCity()
     object SaveCity : HelloPage7ChooseCity()
}
