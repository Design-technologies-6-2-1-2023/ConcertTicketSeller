package com.example.ticketease.Screens.HelloPages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
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
fun HelloPage1(navController: NavHostController) {
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
                            modifier = Modifier.size(70.dp, 70.dp).clickable{
                                navController .navigate("HelloPage5")
                            }

                        )
                    }
                }
            }
            Box(contentAlignment = Alignment.TopStart) {
                Image(
                    painterResource(id = R.drawable.ticketease_sjr_0b_k8_transformed),
                    contentDescription = "image",
                    alignment = Alignment.TopEnd,
                    modifier = Modifier
                        .width(275.dp)
                        .align(alignment = Alignment.TopEnd)
                        .offset(y = -20.dp, x = -20.dp),
                    contentScale = ContentScale.Crop
                )

            }
            Box(contentAlignment = Alignment.TopStart) {
                Column(modifier = Modifier
                    .size(300.dp, 250.dp)
                    .offset(y = -125.dp, x = -20.dp)) {
                    Text(
                        text = "Мероприятия на любой вкус",

                        fontSize = 32.sp,
                        lineHeight = 50.sp,
                        color = Color.White,style = MaterialTheme.typography.body2,
                    )
                    Text(
                        style = MaterialTheme.typography.body2,
                        text = "Спектакли, концерты, мюзиклы, выставки, экскурсии, балет и многое другое",
                        fontSize = 20.sp,
                        lineHeight = 30.sp, color = Color.White,
                    )
                }
            }



            Box(contentAlignment = Alignment.Center) {

                Button(
                    onClick = { navController.navigate("HelloPage2")},
                    modifier = Modifier
                        .height(50.dp)
                        .offset(y = 0.dp, x = 65.dp)
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

            Box(contentAlignment = Alignment.TopStart) {
                Image(
                    painterResource(id = R.drawable.points1),
                    contentDescription = "image",
                    alignment = Alignment.TopEnd,
                    modifier = Modifier
                        .height(235.dp)
                        .align(alignment = Alignment.TopEnd)
                        .offset(y = -30.dp, x = 100.dp),
                    contentScale = ContentScale.Crop
                )

            }

        }
    }
}