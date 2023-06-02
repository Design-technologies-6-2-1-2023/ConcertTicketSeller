package com.example.ticketease.MVVM.Person.Buyer.Register

sealed class RegisterStateTextFields {
    data class Name(val value : String) : RegisterStateTextFields()
    data class Surname(val value : String) : RegisterStateTextFields()
    data class Email(val value : String) : RegisterStateTextFields()
    data class Login(val value : String) : RegisterStateTextFields()
    data class Mobile(val value : String) : RegisterStateTextFields()
    data class Password(val value : String) : RegisterStateTextFields()
    data class RepeatPassword(val value: String) : RegisterStateTextFields()


    object RegisterBuyer:RegisterStateTextFields()

}