package com.example.testcompose.SomeItems

import com.example.testcompose.R

sealed class NavigationItem(var route: String) {
    object Catalog : NavigationItem("Catalog")
    object Favorite : NavigationItem("Favorite")
    object Prefarence : NavigationItem("Prefarence")
    object Cart : NavigationItem("Cart")
    object Personal : NavigationItem("Personal")

    object HelloPage1 : NavigationItem("page1")

    object HelloPage2 : NavigationItem("page2")
    object HelloPage3 : NavigationItem("page3" )
    object HelloPage4 : NavigationItem("page4" )
    object HelloPage5 : NavigationItem("page5" )
    object HelloPage6 : NavigationItem("page6" )
    object HelloPage7 : NavigationItem("page7" )
    object RegisterOrg : NavigationItem("RegisterOrg")
    object RegisterByer : NavigationItem("RegisterByer")
    object RecoveryPasswordByer : NavigationItem("RecoveryPasswordByer" )
    object AvtorizeByer : NavigationItem("AvtorizeByer")

    object AvtorizeOrg : NavigationItem("AvtorizeOrg")
    object RecoveryPasswordOrg : NavigationItem("RecoveryPasswordOrg" )
    object ConnectToManager : NavigationItem("ConnectToManager" )
    object UncorrectText : NavigationItem("UncorrectText" )
    object CannotFindUser : NavigationItem("CannotFindUser" )
    object TryAgain : NavigationItem("TryAgain" )
    object EnterPageOrg : NavigationItem("EnterPageOrg")
    object EnterPageByer : NavigationItem("EnterPageByer" )

    object PersonalCorrectInformation : NavigationItem("PersonalCorrectInformation" )
    object PersonalTickets : NavigationItem("PersonalTickets" )

    object CatalogNAUser : NavigationItem("CatalogNAUser")
    object FavoriteNAUser : NavigationItem("FavoriteNAUser")
    object PrefarenceNAUser : NavigationItem("PrefarenceNAUser")
    object CartNAUser : NavigationItem("CartNAUser")
    object PersonalNAUser : NavigationItem("PersonalNAUser")



}