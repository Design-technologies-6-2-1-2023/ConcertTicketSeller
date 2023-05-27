package com.example.ticketease.MVVM.Person.Buyer.Personal

import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult

sealed class PersonalResult <T>(val data: T? = null) {
    class Correct<T>(data : T? = null): PersonalResult<T>(data)
    class Uncorrect<T> : PersonalResult<T>()
}