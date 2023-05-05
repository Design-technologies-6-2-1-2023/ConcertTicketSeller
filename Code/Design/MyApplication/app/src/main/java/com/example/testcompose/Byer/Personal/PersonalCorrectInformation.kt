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
import com.example.testcompose.SomeItems.PersonItem

@Composable
fun PersonalCorrectInformation(navController: NavHostController) {
    Column() {
        var p = PersonItem("Nickolay", "Ivanov", "88005553535", "Voronezh")
        Box(

            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(modifier = Modifier.padding(50.dp)) {
                Text("Личный кабинет", fontSize = 35.sp, color = Color.White)

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
                    border = BorderStroke(3.dp, colorResource(R.color.find)),
                    shape = RoundedCornerShape(40),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.find)),

                    )
                {
                    Row() {

                        Column {
                            Row() {
                                Text(p.name + " ", fontSize = 25.sp, color = Color.Black)
                                Text(p.surname, fontSize = 25.sp, color = Color.Black)

                            }
                            Text(p.phone, fontSize = 25.sp, color = Color.Black)


                        }
                    }
                }
                Column(modifier = Modifier.size(700.dp, 500.dp),horizontalAlignment = Alignment.CenterHorizontally)
                {
                    TextField(value = "Фамилия", onValueChange = {}, Modifier.padding(10.dp))
                    TextField(value = "имя", onValueChange = {}, Modifier.padding(10.dp))

                    TextField(value = "Номер телефона", onValueChange = {}, Modifier.padding(10.dp))
                    TextField(value = "email", onValueChange = {}, Modifier.padding(10.dp))
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .padding(top = 50.dp)
                            .height(50.dp)
                            .width(300.dp),
                        border = BorderStroke(3.dp, colorResource(R.color.backgroud)),
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                        )
                    {

                        Column {
                            Text("Применить изменения", fontSize = 25.sp, color = Color.White)

                        }
                    }
                }
            }
        }
    }
}