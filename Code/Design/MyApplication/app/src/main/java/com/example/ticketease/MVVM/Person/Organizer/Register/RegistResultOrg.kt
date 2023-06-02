package com.example.ticketease.MVVM.Person.Organizer.Register

sealed class RegistResultOrg<T>(val data: T? = null) {
    class Registered<T>(data : T? = null): RegistResultOrg<T>(data)
    class Unregistered<T> : RegistResultOrg<T>()
    class UnknownError<T>: RegistResultOrg<T>()
}