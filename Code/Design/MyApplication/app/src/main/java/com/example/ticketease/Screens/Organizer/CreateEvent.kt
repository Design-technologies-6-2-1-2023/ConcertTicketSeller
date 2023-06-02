package com.example.ticketease.Screens.Organizer

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ticketease.R

@Composable
fun CreateEvent(navController: NavHostController) {

    Box(modifier = Modifier
        .background(color = colorResource(R.color.white))
        .fillMaxSize()
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .background(color = colorResource(R.color.white))
                    .fillMaxWidth()
                    .height(150.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(  modifier = Modifier.padding(30.dp)) {
                    Text("Создать мероприятие", fontSize = 28.sp, color = Color.Black)

                }
            }
            Column(modifier = Modifier.size(800.dp, 1200.dp).offset(0.dp, -50.dp),horizontalAlignment = Alignment.CenterHorizontally)
            {
                TextField(value = "Название мероприятия", onValueChange = {}, Modifier.padding(5.dp) )
                TextField(value = "Стоимость мерпориятия", onValueChange = {}, Modifier.padding(5.dp) )

                TextField(value = "Дата дд.мм.гг", onValueChange = {}, Modifier.padding(5.dp) )
                TextField(value = "Тип мероприятия", onValueChange = {} , Modifier.padding(5.dp))

                TextField(value = "Жанр мероприятия", onValueChange = {}, Modifier.padding(5.dp) )

                TextField(value = "Название коллектива", onValueChange = {}, Modifier.padding(5.dp) )
                TextField(value = "Описание", onValueChange = {} , Modifier.padding(5.dp).height(130.dp))
                Box() {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Button(
                            onClick = { navController.navigate("PlaceSelector") },
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .height(50.dp)
                                .width(300.dp),
                            shape = RoundedCornerShape(50),
                            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                            )
                        {

                            Column {
                                Text("Создать", fontSize = 25.sp, color = Color.White)

                            }
                        }
                    }
                }
                Box(
                        modifier = Modifier
                            .background(color = colorResource(R.color.white))
                            .fillMaxWidth()
                            .offset(0.dp, 50.dp)
                            .height(70.dp), contentAlignment = Alignment.BottomCenter
                ) {
                Row() {
                    Column() {
                        Image(
                            painterResource(id = R.drawable.eventblack),
                            contentDescription = "image",
                            modifier = Modifier
                                .size(40.dp, 40.dp)
                                .offset(125.dp, -5.dp)
                                .clickable() {
                                    navController.navigate("CreateEvent")
                                },
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Создать мероприятие ",
                            fontSize = 10.sp,
                            modifier = Modifier.padding(85.dp, 5.dp)
                        )
                    }
                    Box(modifier = Modifier.size(30.dp, 30.dp)) {

                    }
                    Column() {
                        Image(
                            painterResource(id = R.drawable.avatar),
                            contentDescription = "image",
                            modifier = Modifier
                                .size(35.dp, 35.dp)
                                .offset(-20.dp, -4.dp)
                                .clickable() {
                                    navController.navigate("PersonalOrg")
                                },
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Личный кабинет",
                            fontSize = 10.sp,
                            modifier = Modifier.offset(-40.dp, 10.dp)
                        )
                    }
                    Box(modifier = Modifier.size(30.dp, 30.dp)) {

                    }
                    Box(modifier = Modifier.size(30.dp, 30.dp)) {

                    }

                }
            }
            }


        }
    }
}