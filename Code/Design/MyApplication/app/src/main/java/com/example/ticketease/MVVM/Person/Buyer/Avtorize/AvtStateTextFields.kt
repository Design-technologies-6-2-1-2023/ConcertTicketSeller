package com.example.ticketease.MVVM.Person.Buyer.Avtorize


sealed class AvtStateTextFields {
    data class Login(val value : String) : AvtStateTextFields()
    data class Password(val value : String) : AvtStateTextFields()
    object AvtBuyer: AvtStateTextFields()
}