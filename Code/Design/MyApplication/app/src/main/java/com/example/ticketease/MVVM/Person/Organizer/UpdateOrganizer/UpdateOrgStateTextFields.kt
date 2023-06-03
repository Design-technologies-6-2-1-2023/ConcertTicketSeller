package com.example.ticketease.MVVM.Person.Organizer.UpdateOrganizer

import com.example.ticketease.MVVM.Person.Buyer.UpdateBuyer.UpdateBuyerStateTextFields

sealed class UpdateOrgStateTextFields {
    data class Name(val value : String) : UpdateOrgStateTextFields()
    data class Surname(val value : String) : UpdateOrgStateTextFields()
    data class Email(val value : String) : UpdateOrgStateTextFields()
    data class Mobile(val value : String) : UpdateOrgStateTextFields()
    object Update: UpdateOrgStateTextFields()
}