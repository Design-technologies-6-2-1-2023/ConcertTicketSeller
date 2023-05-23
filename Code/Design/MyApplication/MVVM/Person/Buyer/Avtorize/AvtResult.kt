package com.example.ticketease.MVVM.Person.Buyer.Avtorize


sealed class AvtResult <T>(val data: T? = null) {
    class Registered<T>(data : T? = null): AvtResult<T>(data)
    class Unregistered<T> : AvtResult<T>()
    class UnknownError<T>: AvtResult<T>()
}