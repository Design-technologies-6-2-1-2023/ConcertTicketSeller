package com.example.ticketease.Screens.Organizer

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.ticketease.MVVM.Person.Buyer.Personal.ViewModelPersonal
import com.example.ticketease.MVVM.Person.Organizer.Personal.ViewModelPersonalOrg
import com.example.ticketease.R


@Composable
fun PersonalCorrectInformationOrg(navController: NavHostController){
    Column() {
        //var p = PersonItem("Nickolay", "Ivanov", "88005553535", "Voronezh")
        Button(
            onClick = { navController.navigate("PersonalOrg") },
            modifier = Modifier
                .height(120.dp)
                .width(450.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.white)),

            ) {
            Image(
                painterResource(id = R.drawable.arrow2),
                contentDescription = "image",
                modifier = Modifier
                    .size(29.dp, 29.dp)
                    .offset(-30.dp, 0.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(5.dp).offset(0.dp, 0.dp)) {
                Text("Личный кабинет", fontSize = 25.sp, color = Color.Black)

            }
        }
        Box(
            modifier = Modifier
                .background(color = colorResource(R.color.white))
                .fillMaxSize()
        ) {
            Column() {


                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .height(100.dp)
                        .width(450.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.find)),

                    )
                {
                    Row() {

                        Column {
                            Row() {
                                Text("p.name" + " ", fontSize = 20.sp, color = Color.Black)
                                Text("p.surname", fontSize = 20.sp, color = Color.Black)
                            }
                            Text("p.phone", fontSize = 20.sp, color = Color.Black)
                        }
                    }
                }
                Column(modifier = Modifier.size(700.dp, 500.dp),horizontalAlignment = Alignment.CenterHorizontally)
                {
                    TextField(value = "Фамилия", onValueChange = {}, Modifier.padding(10.dp))
                    TextField(value = "Имя", onValueChange = {}, Modifier.padding(10.dp))

                    TextField(value = "Номер телефона", onValueChange = {}, Modifier.padding(10.dp))
                    TextField(value = "Email", onValueChange = {}, Modifier.padding(10.dp))
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .padding(top = 50.dp)
                            .height(50.dp)
                            .width(300.dp),
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                        )
                    {

                        Column {
                            Text("Применить изменения", fontSize = 20.sp, color = Color.White)

                        }
                    }
                }
            }
        }
    }
}