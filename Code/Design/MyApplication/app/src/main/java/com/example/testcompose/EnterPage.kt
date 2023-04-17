package com.example.testcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun EnterPage(navController: NavHostController) {

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
                        Text("Войти", fontSize = 35.sp, color = Color.White)

                    }
                }
                Column(modifier = Modifier.size(300.dp, 600.dp),horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Box() {

                        Button(
                            onClick = { navController.navigate(Routes.Avtorize.route) },
                            modifier = Modifier
                                .padding(top = 100.dp)
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
                    Box() {
                        Button(
                            onClick = {  },
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
                                Text("Зарегистрироваться", fontSize = 15.sp, color = Color.White)

                            }
                        }
                    }
                }

            }
    }
}