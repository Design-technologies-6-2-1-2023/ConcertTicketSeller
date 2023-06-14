package com.example.ticketease.MVVM.Person.Organizer.Avtorize

sealed class AvtResultOrg <T>(val data: T? = null) {
    class Avtorized<T>(data : T? = null): AvtResultOrg<T>(data)
    class IncorrectPassword<T> : AvtResultOrg<T>()
    class UnknownLogin<T>: AvtResultOrg<T>()
}