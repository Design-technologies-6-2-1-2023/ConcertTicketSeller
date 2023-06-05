package com.example.ticketease.MVVM.Person.Organizer.UpdateOrganizer



sealed  class UpdateOrgResult <T>(val data: T? = null) {
    class Correct<T>(data : T? = null): UpdateOrgResult<T>(data)
    class Uncorrect<T> : UpdateOrgResult<T>()
}