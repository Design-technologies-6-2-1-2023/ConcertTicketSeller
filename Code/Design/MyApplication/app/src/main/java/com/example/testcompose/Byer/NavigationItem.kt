package com.example.testcompose.Byer

import com.example.testcompose.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Catalog : NavigationItem("Catalog", R.drawable.ticketease__6__transformed, "Каталог")
    object Favorite : NavigationItem("Favorite", R.drawable.like_3ekrj_vojgm, "Избранное")
    object Prefarence : NavigationItem("Prefarence", R.drawable.vnvzi228_transformed, "Предпочтения")
    object Cart : NavigationItem("Cart",
        R.drawable.free_icon_shopping_cart_481384_bhbaq__1__0phyx, "Корзина")
    object Personal : NavigationItem("Personal", R.drawable.ticketease__8__transformed, "Личный кабинет")
}