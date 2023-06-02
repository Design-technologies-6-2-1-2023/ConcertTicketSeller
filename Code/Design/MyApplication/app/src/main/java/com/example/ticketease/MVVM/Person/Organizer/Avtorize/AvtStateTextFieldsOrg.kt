package com.example.ticketease.MVVM.Person.Organizer.Avtorize

sealed class AvtStateTextFieldsOrg {
    data class Login(val value : String) : AvtStateTextFieldsOrg()
    data class Password(val value : String) : AvtStateTextFieldsOrg()
    object AvtOrg: AvtStateTextFieldsOrg()
}