package com.example.testcompose

sealed class Routes(val route: String) {
    object HelloPage1 : Routes("page1")

    object HelloPage2 : Routes("page2")
    object HelloPage3 : Routes("page3")
    object HelloPage4 : Routes("page4")
    object HelloPage5 : Routes("page5")
    object HelloPage6 : Routes("page6")
    object HelloPage7 : Routes("page7")
    object EnterPage : Routes("EnterPage")
    object Register : Routes("Register")
    object Avtorize : Routes("Avtorize")
    object RecoveryPassword : Routes("RecoveryPassword")
    object ConnectToManager : Routes("ConnectToManager")
    object UncorrectText : Routes("UncorrectText")
    object CannotFindUser : Routes("CannotFindUser")
    object TryAgain : Routes("TryAgain")
    object Catalog : Routes("Catalog")
    object InterfaceScreens : Routes("InterfaceScreens")

}