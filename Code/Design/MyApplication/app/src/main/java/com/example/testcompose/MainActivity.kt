package com.example.testcompose

import android.os.Bundle
import android.text.style.LineHeightSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.*
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testcompose.ui.theme.TestComposeTheme



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

        NavHost(navController = navController, startDestination = Routes.HelloPage1.route) {

            composable(Routes.HelloPage2.route) {

                HelloPage2(navController = navController)
            }

            composable(Routes.HelloPage1.route) {

                HelloPage1(navController = navController)
            }

            composable(Routes.HelloPage3.route) {

                HelloPage3(navController = navController)
            }
            composable(Routes.HelloPage4.route) {

                HelloPage4(navController = navController)
            }

            composable(Routes.HelloPage5.route) {

                HelloPage5(navController = navController)
            }
            composable(Routes.HelloPage6.route) {

                HelloPage6(navController = navController)
            }
            composable(Routes.HelloPage7.route) {

                HelloPage7(navController = navController)
            }
            composable(Routes.EnterPage.route) {

                EnterPage(navController = navController)
            }
            composable(Routes.Register.route) {

                Register(navController = navController)
            }
            composable(Routes.Avtorize.route) {

                Avtorize(navController = navController)
            }
            composable(Routes.RecoveryPassword.route) {

                RecoveryPassword(navController = navController)
            }
            composable(Routes.ConnectToManager.route) {

                ConnectToManager(navController = navController)
            }
            composable(Routes.UncorrectText.route) {

                UncorrectText(navController = navController)
            }
            composable(Routes.CannotFindUser.route) {

                CannotFindUser(navController = navController)
            }
            composable(Routes.TryAgain.route) {

                TryAgain(navController = navController)
            }
            composable(Routes.InterfaceScreens.route) {

                InterfaceScreens(navController = navController)
            }
        }
    }

}

