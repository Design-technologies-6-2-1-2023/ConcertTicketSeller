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
import com.example.ticketease.Screens.EnterAppByer.AvtorizeByer
import com.example.ticketease.Screens.EnterAppByer.Catalog
import com.example.ticketease.Screens.EnterAppByer.Personal
import com.example.ticketease.Screens.EnterAppByer.RegisterBuyer
import com.example.ticketease.Screens.Errors.ErrorNoLogin
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