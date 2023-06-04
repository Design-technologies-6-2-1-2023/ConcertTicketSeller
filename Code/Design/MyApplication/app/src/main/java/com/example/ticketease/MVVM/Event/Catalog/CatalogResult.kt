package com.example.ticketease.MVVM.Event.Catalog

import com.example.ticketease.MVVM.Person.Buyer.Register.RegistResult

sealed class CatalogResult <T>(val data: T? = null) {
    class Correct<T>(data : T? = null): CatalogResult<T>(data)
    class UnknownError<T>: CatalogResult<T>()
}