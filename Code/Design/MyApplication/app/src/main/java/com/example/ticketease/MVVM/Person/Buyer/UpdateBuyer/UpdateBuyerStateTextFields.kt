package com.example.ticketease.MVVM.Person.Buyer.UpdateBuyer

import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterStateTextFields

sealed class UpdateBuyerStateTextFields {
    data class Name(val value : String) : UpdateBuyerStateTextFields()
    data class Surname(val value : String) : UpdateBuyerStateTextFields()
    data class Email(val value : String) : UpdateBuyerStateTextFields()
    data class Mobile(val value : String) : UpdateBuyerStateTextFields()
    object UpdateBuyer: UpdateBuyerStateTextFields()
}