package com.example.ticketease.MVVM.Event.EnterParam

import com.example.ticketease.MVVM.Person.Buyer.Register.RegisterStateTextFields

sealed  class EnterParamStateTextFields {
    data class Name(val value : String) : EnterParamStateTextFields()
    data class Cost(val value : String) : EnterParamStateTextFields()
    data class Date(val value : String) : EnterParamStateTextFields()
    data class Genre(val value : String) : EnterParamStateTextFields()
    data class Type(val value : String) : EnterParamStateTextFields()
    data class NameGroup(val value : String) : EnterParamStateTextFields()
    data class Description(val value: String) : EnterParamStateTextFields()


    object Enter: EnterParamStateTextFields()
}