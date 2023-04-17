package com.example.testcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HelloPage1(navController: NavHostController) {
    Box(

        modifier = Modifier
            .background(color = colorResource(R.color.backgroud))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier= Modifier.size(300.dp, 600.dp))
        {
            Box(contentAlignment = Alignment.Center) {
                Image(
                    painterResource(id = R.drawable.ticketease_sjr_0b_k8_transformed),
                    contentDescription = "image",
                    modifier = Modifier.size(200.dp, 100.dp),
                    contentScale = ContentScale.Crop
                )

            }
            Box(contentAlignment = Alignment.Center) {
                Column(modifier= Modifier.size(300.dp, 300.dp)) {


                    Text(
                        text = "Мероприятия на любой вкус",
                        fontSize = 32.sp,
                        lineHeight = 50.sp,
                        color = Color.White
                    )
                    Text(
                        text = "Спектакли, концерты, мюзиклы, выставки, экскурсии, балет и многое другое",
                        fontSize = 20.sp,
                        lineHeight = 30.sp, color = Color.White
                    )
                }
            }



            Box(contentAlignment = Alignment.Center) {

                Button(
                    onClick = { navController.navigate(Routes.InterfaceScreens.route)},
                    modifier = Modifier
                        .padding(top = 100.dp)
                        .height(50.dp)
                        .width(200.dp),
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