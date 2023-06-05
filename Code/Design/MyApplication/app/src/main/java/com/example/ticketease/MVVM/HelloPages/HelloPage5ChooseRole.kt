package com.example.ticketease.MVVM.HelloPages

import com.example.ticketease.DataClasses.Person.Role

sealed class HelloPage5ChooseRole {
    data class TypeRole(val value : Role) : HelloPage5ChooseRole()
    object SaveRole : HelloPage5ChooseRole()
}