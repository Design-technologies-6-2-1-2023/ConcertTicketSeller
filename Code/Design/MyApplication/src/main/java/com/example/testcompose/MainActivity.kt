package com.example.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable

import androidx.compose.material.*

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testcompose.SomeItems.NavigationItem


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface() {
                ScreenMain()
            }
        }
    }

    @Composable
    fun ScreenMain() {

        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = NavigationItem.HelloPage1.route) {

            composable(NavigationItem.HelloPage2.route) {

                HelloPage2(navController = navController)
            }

            composable(NavigationItem.HelloPage1.route) {

                HelloPage1(navController = navController)
            }

            composable(NavigationItem.HelloPage3.route) {

                HelloPage3(navController = navController)
            }
            composable(NavigationItem.HelloPage4.route) {

                HelloPage4(navController = navController)
            }

            composable(NavigationItem.HelloPage5.route) {

                HelloPage5(navController = navController)
            }
            composable(NavigationItem.HelloPage6.route) {

                HelloPage6(navController = navController)
            }
            composable(NavigationItem.HelloPage7.route) {

                HelloPage7(navController = navController)
            }

            composable(NavigationItem.RegisterOrg.route) {

                RegisterOrg(navController = navController)
            }
            composable(NavigationItem.RegisterByer.route) {

                RegisterByer(navController = navController)
            }
            composable(NavigationItem.AvtorizeOrg.route) {

                AvtorizeOrg(navController = navController)
            }
            composable(NavigationItem.RecoveryPasswordOrg.route) {

                RecoveryPasswordOrg(navController = navController)
            }
            composable(NavigationItem.AvtorizeByer.route) {

                AvtorizeByer(navController = navController)
            }
            composable(NavigationItem.RecoveryPasswordByer.route) {

                RecoveryPasswordByer(navController = navController)
            }
            composable(NavigationItem.ConnectToManager.route) {

                ConnectToManager(navController = navController)
            }
            composable(NavigationItem.UncorrectText.route) {

                UncorrectText(navController = navController)
            }
            composable(NavigationItem.CannotFindUser.route) {

                CannotFindUser(navController = navController)
            }
            composable(NavigationItem.TryAgain.route) {

                TryAgain(navController = navController)
            }


            composable(NavigationItem.PersonalCorrectInformation.route) {

                PersonalCorrectInformation(navController = navController)
            }

            composable(NavigationItem.EnterPageOrg.route) {

                EnterPageOrg( navController)
            }
            composable(NavigationItem.Catalog.route) {
                CatalogScreenPreview(navController)
            }
            composable(NavigationItem.Favorite.route) {
                FavoriteScreenPreview(navController)
            }
            composable(NavigationItem.Prefarence.route) {
                PrefarenceScreenPreview(navController)
            }
            composable(NavigationItem.Cart.route) {
                CartScreenPreview(navController)
            }
            composable(NavigationItem.Personal.route) {
                PersonalScreenPreview(navController)
            }
            composable(NavigationItem.EnterPageByer.route) {

                EnterPageByer( navController)
            }
            composable(NavigationItem.PersonalTickets.route) {

                PersonalTickets( navController)
            }
            composable(NavigationItem.PersonalCorrectInformation.route) {

                PersonalCorrectInformation(navController)
            }

            composable(NavigationItem.CatalogNAUser.route) {
                CatalogNAUserScreenPreview(navController =navController )
            }
            composable(NavigationItem.FavoriteNAUser.route) {
                FavoriteNAUserScreenPreview(navController)
            }
            composable(NavigationItem.PrefarenceNAUser.route) {
                PrefarenceNAUserScreenPreview(navController)
            }
            composable(NavigationItem.CartNAUser.route) {
                CartNAUSerScreenPreview(navController)
            }
            composable(NavigationItem.PersonalNAUser.route) {
                PersonalNAUSerScreenPreview(navController)
            }


        }
    }

}

