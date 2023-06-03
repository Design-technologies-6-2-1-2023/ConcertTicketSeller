package com.example.ticketease.MVVM.Person.Organizer.Register

import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterStateTextFields

sealed class RegisterStateTextFieldsOrg {
    data class Name(val value : String) : RegisterStateTextFieldsOrg()
    data class Surname(val value : String) : RegisterStateTextFieldsOrg()
    data class Email(val value : String) : RegisterStateTextFieldsOrg()
    data class Login(val value : String) : RegisterStateTextFieldsOrg()
    data class Mobile(val value : String) : RegisterStateTextFieldsOrg()
    data class Password(val value : String) : RegisterStateTextFieldsOrg()
    data class RepeatPassword(val value: String) : RegisterStateTextFieldsOrg()


    object RegisterOrganizer: RegisterStateTextFieldsOrg()
}