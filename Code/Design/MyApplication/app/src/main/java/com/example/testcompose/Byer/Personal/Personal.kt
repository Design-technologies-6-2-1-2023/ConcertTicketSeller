package com.example.testcompose

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.testcompose.SomeItems.NavigationItem
import com.example.testcompose.SomeItems.PersonItem

@Composable
fun Personal(navController: NavHostController) {
    Column() {
        var p = PersonItem("Nickolay", "Ivanov", "88005553535", "Voronezh")
        Box(

            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp),
            contentAlignment = Alignment.Center) {
            Column(  modifier = Modifier.padding(50.dp)) {
                Text("Личный кабинет", fontSize = 35.sp, color = Color.White)

            }
        }
        Box( modifier = Modifier
            .background(color = colorResource(R.color.white))
            .fillMaxSize()) {
            Column() {


                Button(
                    onClick = {navController.navigate(NavigationItem.PersonalCorrectInformation.route)},
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .height(100.dp)
                        .width(450.dp),
                    border = BorderStroke(3.dp, colorResource(R.color.find)),
                    shape = RoundedCornerShape(40),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.find)),

                    )
                {
                    Row() {

                        Column {
                            Row() {
                                Text(p.name+" ", fontSize = 25.sp, color = Color.Black)
                                Text(p.surname, fontSize = 25.sp, color = Color.Black)

                            }
                            Text(p.phone, fontSize = 25.sp, color = Color.Black)


                        }
                    }
                }

                Button(
                    onClick = {navController.navigate(NavigationItem.PersonalTickets.route)},
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .height(100.dp)
                        .width(450.dp),
                    border = BorderStroke(3.dp, colorResource(R.color.greenMy)),
                    shape = RoundedCornerShape(40),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.greenMy)),

                    )
                {

                    Column(modifier = Modifier.padding(25.dp)) {
                        Text("Мои билеты", fontSize = 25.sp, color = Color.Black)

                    }
                }
                Box(modifier = Modifier.padding(20.dp)) {
                    Column() {
                        Text(
                            "Ваш город",
                            fontSize = 35.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Row() {
                            Text(
                                p.city,
                                fontSize = 25.sp,
                                color = Color.Black
                            )
                            Box(modifier =Modifier.width(25.dp) ){

                            }
                                Image(
                                    painterResource(id = R.drawable.oeemhqaf_transformed),
                                    contentDescription = "image",
                                    modifier = Modifier
                                        .size(25.dp, 25.dp)
                                        .clickable() {

                                        },
                                    contentScale = ContentScale.Crop,

                                )

                        }

                        Text(
                            "Задать вопрос",
                            fontSize = 35.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                        Box(){
                            Row() {
                                Image(
                                    painterResource(id = R.drawable.whatsapp),
                                    contentDescription = "image",
                                    modifier = Modifier
                                        .size(50.dp, 50.dp)
                                        .clickable() {

                                        },
                                    contentScale = ContentScale.Crop,

                                    )
                                Box(modifier =Modifier.width(40.dp) ){

                                }
                                Image(
                                    painterResource(id = R.drawable.whatsapp),
                                    contentDescription = "image",
                                    modifier = Modifier
                                        .size(50.dp, 50.dp)
                                        .clickable() {

                                        },
                                    contentScale = ContentScale.Crop,

                                    )
                                Box(modifier =Modifier.width(40.dp) ){

                                }
                                Image(
                                    painterResource(id = R.drawable.whatsapp),
                                    contentDescription = "image",
                                    modifier = Modifier
                                        .size(50.dp, 50.dp)
                                        .clickable() {

                                        },
                                    contentScale = ContentScale.Crop,

                                    )
                                Box(modifier =Modifier.width(40.dp) ){

                                }
                                Image(
                                    painterResource(id = R.drawable.whatsapp),
                                    contentDescription = "image",
                                    modifier = Modifier
                                        .size(50.dp, 50.dp)
                                        .clickable() {

                                        },
                                    contentScale = ContentScale.Crop,

                                    )

                            }
                        }
                        Box(contentAlignment = Alignment.Center,
                            modifier = Modifier.padding(50.dp)) {

                            Button(
                                onClick = {navController.navigate(NavigationItem.EnterPageByer.route)},
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(350.dp),
                                border = BorderStroke(3.dp,colorResource(R.color.backgroud)),
                                shape = RoundedCornerShape(50),
                                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                                )
                            {

                                Column {
                                    Text("Выйти", fontSize = 25.sp, color = Color.White)

                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
@Composable
fun PersonalScreenPreview(navController: NavHostController) {
    Personal(navController)
}