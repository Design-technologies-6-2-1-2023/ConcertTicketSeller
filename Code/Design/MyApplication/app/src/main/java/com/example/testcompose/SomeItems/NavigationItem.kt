package com.example.testcompose.SomeItems

import com.example.testcompose.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Catalog : NavigationItem("Catalog",
        R.drawable.free_icon_shopping_cart_481384_bhbaq__1__0phyx, "Каталог")
    object Favorite : NavigationItem("Favorite",
        R.drawable.free_icon_shopping_cart_481384_bhbaq__1__0phyx, "Избранное")
    object Prefarence : NavigationItem("Prefarence",
        R.drawable.free_icon_shopping_cart_481384_bhbaq__1__0phyx, "Предпочтения")
    object Cart : NavigationItem("Cart",
        R.drawable.free_icon_shopping_cart_481384_bhbaq__1__0phyx, "Корзина")
    object Personal : NavigationItem("Personal",
        R.drawable.free_icon_shopping_cart_481384_bhbaq__1__0phyx, "Личный кабинет")

    object HelloPage1 : NavigationItem("page1", 0, "null")

    object HelloPage2 : NavigationItem("page2",  0, "null" )
    object HelloPage3 : NavigationItem("page3",  0, "null" )
    object HelloPage4 : NavigationItem("page4",  0, "null" )
    object HelloPage5 : NavigationItem("page5",  0, "null" )
    object HelloPage6 : NavigationItem("page6",  0, "null" )
    object HelloPage7 : NavigationItem("page7",  0, "null" )
    object RegisterOrg : NavigationItem("RegisterOrg",  0, "null" )
    object RegisterByer : NavigationItem("RegisterByer",  0, "null" )
    object RecoveryPasswordByer : NavigationItem("RecoveryPasswordByer",  0, "null" )
    object AvtorizeByer : NavigationItem("AvtorizeByer",  0, "null" )

    object AvtorizeOrg : NavigationItem("AvtorizeOrg",  0, "null" )
    object RecoveryPasswordOrg : NavigationItem("RecoveryPasswordOrg",  0, "null" )
    object ConnectToManager : NavigationItem("ConnectToManager",  0, "null" )
    object UncorrectText : NavigationItem("UncorrectText",  0, "null" )
    object CannotFindUser : NavigationItem("CannotFindUser",  0, "null" )
    object TryAgain : NavigationItem("TryAgain",  0, "null" )
    object InterfaceScreens : NavigationItem("InterfaceScreens",  0, "null" )
    object EnterPageOrg : NavigationItem("EnterPageOrg",  0, "null" )
    object EnterPageByer : NavigationItem("EnterPageByer",  0, "null" )

    object PersonalCorrectInformation : NavigationItem("PersonalCorrectInformation",  0, "null" )
    object PersonalTickets : NavigationItem("PersonalTickets",  0, "null" )


}