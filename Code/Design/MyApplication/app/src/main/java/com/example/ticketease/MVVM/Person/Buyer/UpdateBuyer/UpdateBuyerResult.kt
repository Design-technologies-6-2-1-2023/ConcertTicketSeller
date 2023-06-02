package com.example.ticketease.MVVM.Person.Buyer.UpdateBuyer

import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtResult

sealed  class UpdateBuyerResult <T>(val data: T? = null) {
    class Correct<T>(data : T? = null): UpdateBuyerResult<T>(data)
    class Uncorrect<T> : UpdateBuyerResult<T>()
}