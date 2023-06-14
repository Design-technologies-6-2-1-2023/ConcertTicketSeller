package com.example.ticketease.MVVM.Person.Buyer.Avtorize


sealed class AvtResult <T>(val data: T? = null) {
    class Avtorized<T>(data : T? = null): AvtResult<T>(data)
    class IncorrectPassword<T> : AvtResult<T>()
    class UnknownLogin<T>: AvtResult<T>()
}