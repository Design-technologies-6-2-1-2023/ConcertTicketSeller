package com.example.testcompose.MVVM
import kotlinx.serialization.Serializable


@Serializable
class RegisterUserItem {
    var name = ""
    var surname = ""
    var login = ""
    var email= ""
    var phone = ""
    var password = ""

    constructor(
        name: String,
        surname: String,
        login: String,
        email: String,
        phone: String,
        password: String

    ) {

        this.name = name
        this.surname = surname
        this.login = login
        this.email = email
        this.phone = phone
        this.password = password
    }

    constructor(name: String, surname: String, login: String, email: String) {

        this.name = name
        this.surname = surname
        this.login = login
        this.email = email
    }

    constructor(login: String, phone: String) {

        this.login = login
        this.phone = phone
    }

}