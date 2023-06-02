package com.example.ticketease.MVVM.Person.Buyer.Register

sealed class RegistResult<T>(val data: T? = null) {
    class Registered<T>(data : T? = null): RegistResult<T>(data)
    class Unregistered<T> : RegistResult<T>()
    class UnknownError<T>: RegistResult<T>()
}