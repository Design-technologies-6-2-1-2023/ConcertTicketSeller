package com.example.testcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.testcompose.SomeItems.NavigationItem


@Composable
fun AvtorizeOrg(navController: NavHostController) {

    Box(modifier = Modifier
        .background(color = colorResource(R.color.white))
        .fillMaxSize()
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .background(color = colorResource(R.color.backgroud))
                    .fillMaxWidth()
                    .height(150.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(  modifier = Modifier.padding(50.dp)) {
                    Text("Авторизация", fontSize = 35.sp, color = Color.White)

                }
            }
            Column(modifier = Modifier.size(500.dp, 600.dp),horizontalAlignment = Alignment.CenterHorizontally)
            {


                TextField(value = "Логин", onValueChange = {}, Modifier.padding(10.dp) )

                TextField(value = "Пароль", onValueChange = {}, Modifier.padding(10.dp) )
                Button(
                    onClick = {navController.navigate(NavigationItem.RecoveryPasswordOrg.route)},
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .height(50.dp)
                        .width(150.dp),

                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.white)),
                    )
                {
                    Column {
                        Text("Забыли пароль", fontSize = 10.sp, color = Color.Black)

                    }
                }
                Button(
                    onClick = {  navController.navigate(NavigationItem.InterfaceScreens.route)},
                    modifier = Modifier
                        .padding(top = 300.dp)
                        .height(50.dp)
                        .width(300.dp),
                    border = BorderStroke(3.dp, colorResource(R.color.backgroud)),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                    )
                {

                    Column {
                        Text("Войти", fontSize = 15.sp, color = Color.White)

                    }
                }
            }

        }
    }
}