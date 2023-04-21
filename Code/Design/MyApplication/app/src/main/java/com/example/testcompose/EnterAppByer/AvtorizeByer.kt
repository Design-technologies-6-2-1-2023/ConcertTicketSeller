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
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.testcompose.SomeItems.NavigationItem


@Composable
fun AvtorizeByer(navController: NavHostController) {

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
            Column(modifier = Modifier.size(500.dp, 1200.dp),horizontalAlignment = Alignment.CenterHorizontally)
            {


                TextField(value = "Логин", onValueChange = {}, Modifier.padding(10.dp))

                TextField(value = "Пароль", onValueChange = {}, Modifier.padding(10.dp))
                Button(
                    onClick = { navController.navigate(NavigationItem.RecoveryPasswordByer.route) },
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

                Box(modifier = Modifier.padding(top=200.dp)) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {


                        Image(
                            painterResource(id = R.drawable._jltfum4_sx1na_transformed),
                            contentDescription = "image",
                            modifier = Modifier.size(100.dp, 100.dp),
                            contentScale = ContentScale.Crop
                        )
                        Button(
                            onClick = { navController.navigate(NavigationItem.InterfaceScreens.route) },
                            modifier = Modifier
                                .padding(top = 10.dp)
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
    }
}