package com.example.ticketease.Screens.HelloPages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ticketease.R


@Composable
fun HelloPage6(navController: NavHostController) {
    Box(

        modifier = Modifier
            .background(color = colorResource(R.color.backgroud))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier= Modifier.size(320.dp, 900.dp))
        {
            Box(contentAlignment = Alignment.TopStart) {
                Column() {
                    Box(modifier = Modifier.size(10.dp, 10.dp)) {

                    }
                    Row() {
                        Box(modifier = Modifier.size(270.dp, 10.dp)) {

                        }
                        Image(
                            painterResource(id = R.drawable.krest),
                            contentDescription = "image",
                            modifier = Modifier.size(70.dp, 70.dp).clickable(){
                                role=Role.NAUSER

                                navController .navigate("HelloPage7")
                            }

                        )
                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {

                Image(
                    painterResource(id = R.drawable.ticketease__4__transformed),
                    contentDescription = "image",
                    modifier = Modifier
                        .width(280.dp)
                        .align(alignment = Alignment.TopEnd)
                        .offset(y = 25.dp, x = -105.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Box(contentAlignment = Alignment.Center) {
                Column(modifier = Modifier.size(300.dp, 250.dp).offset(y = -55.dp, x = -20.dp)) {
                    Text(
                        text = "Осталось только выбрать город",
                        fontSize = 32.sp,
                        lineHeight = 50.sp,
                        color = Color.White
                    )
                }
            }
            Box(contentAlignment = Alignment.Center) {

                Button(
                    onClick = {navController.navigate("HelloPage7")},
                    modifier = Modifier
                        .height(50.dp)
                        .offset(y = 72.dp, x = 65.dp)
                        .width(170.dp),
                    border = BorderStroke(3.dp, Color.White),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                    )
                {

                    Column {
                        Text("Далее", fontSize = 25.sp, color = Color.White)

                    }
                }
            }

        }
    }
}