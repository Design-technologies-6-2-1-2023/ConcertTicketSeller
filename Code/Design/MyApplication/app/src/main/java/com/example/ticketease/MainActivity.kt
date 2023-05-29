package com.example.ticketease

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testcompose.ui.theme.TestComposeTheme
import com.example.ticketease.Screens.EnterAppByer.*
import com.example.ticketease.Screens.Errors.ErrorNoLogin
import com.example.ticketease.Screens.HelloPages.*
import com.example.ticketease.Screens.NAUser.CartNAUser
import com.example.ticketease.Screens.NAUser.CatalogNAUser
import com.example.ticketease.Screens.NAUser.PersonalNAUSer
import com.example.ticketease.Screens.NAUser.PrefarenceNAUSer
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeTheme {
                Surface() {
                    ScreenView()
                }
            }
        }
    }
}

@Composable
fun ScreenView(){
   val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "AvtorizeByer"){
        composable("RegisterBuyer"){ RegisterBuyer(navController) }
        composable("Catalog"){ Catalog(navController) }
        composable("AvtorizeByer"){
            AvtorizeByer(navController)
        }
        composable("Personal"){ Personal(navController) }
        composable("ErrorNoLogin"){ ErrorNoLogin(navController) }
        composable("HelloPage1"){ HelloPage1(navController) }
        composable("HelloPage3"){ HelloPage3(navController) }
        composable("HelloPage2"){ HelloPage2(navController) }
        composable("HelloPage4"){ HelloPage4(navController) }
        composable("HelloPage5"){ HelloPage5(navController) }
        composable("HelloPage6"){ HelloPage6(navController) }
        composable("HelloPage7"){ HelloPage7(navController) }
        composable("LogoPage"){ LogoPage(navController) }
        composable("EnterPageByer"){ EnterPageByer(navController) }
        composable("CartNAUser"){ CartNAUser(navController) }
        composable("CatalogNAUser"){ CatalogNAUser(navController) }
        composable("PersonalNAUSer"){ PersonalNAUSer(navController) }
        composable("PrefarenceNAUSer"){ PrefarenceNAUSer(navController) }
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestComposeTheme {
        Greeting("Android")
    }
}