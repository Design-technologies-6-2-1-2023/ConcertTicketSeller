package com.example.ticketease.Screens.NAUser

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
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
fun CartNAUser(navController: NavHostController) {

    Column() {

        Box(

            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Column(  modifier = Modifier.padding(50.dp)) {
                Text("Корзина", fontSize = 35.sp, color = Color.White)

            }
        }
        Column() {

            Box(
                modifier = Modifier
                    .background(color = colorResource(R.color.white))
                    .fillMaxHeight()
                ,
                contentAlignment = Alignment.BottomCenter
            ) {

                    Box(modifier = Modifier.fillMaxHeight()) {
                        Column() {


                            Box(
                                modifier = Modifier
                                    .padding(top = 20.dp)
                                    .background(colorResource(R.color.find))
                                    .height(100.dp)
                                    .width(400.dp), contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = " Чтобы добавлять товары в корзину войдите или зарегистрируйтесь!",
                                    fontSize = 25.sp
                                )

                            }


                            Box() {
                                Row() {
                                    Button(
                                        onClick = { navController.navigate("EnterPageByer") },
                                        modifier = Modifier
                                            .height(40.dp)
                                            .width(200.dp),
                                        border = BorderStroke(3.dp, Color.White),
                                        shape = RoundedCornerShape(50),
                                        colors = ButtonDefaults.buttonColors(
                                            backgroundColor = colorResource(
                                                R.color.backgroud
                                            )
                                        ),

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

                Box(
                    modifier = Modifier
                        .background(color = colorResource(R.color.white))
                        .fillMaxWidth()
                        .height(70.dp), contentAlignment = Alignment.BottomCenter
                ) {
                    Row {
                        Column {
                            Image(
                                painterResource(id = R.drawable.barbl),
                                contentDescription = "image",
                                modifier = Modifier
                                    .size(29.dp, 29.dp)
                                    .offset(25.dp, (-5).dp)
                                    .clickable {
                                        navController.navigate("CatalogNAUser")
                                    }
                                ,
                                contentScale = ContentScale.Crop
                            )
                            Text(text = "Каталог", fontSize = 10.sp, modifier = Modifier.padding(23.dp, 5.dp))
                        }
                        Box(modifier = Modifier.size(50.dp, 30.dp)){

                        }

                        Column {
                            Image(
                                painterResource(id = R.drawable.dscds),
                                contentDescription = "image",
                                modifier = Modifier
                                    .size(35.dp, 35.dp)
                                    .offset((-7).dp, (-7).dp)
                                    .clickable {
                                        navController.navigate("PreferenceNAUser")
                                    }
                                ,
                                contentScale = ContentScale.Crop
                            )
                            Text(text = "Предпочтения", fontSize = 10.sp, modifier = Modifier.offset((-25).dp, 0.dp))
                        }
                        Box(modifier = Modifier.size(50.dp, 30.dp)){

                        }
                        Column {
                            Image(
                                painterResource(id = R.drawable.fyncbd0vu9k),
                                contentDescription = "image",
                                modifier = Modifier
                                    .size(30.dp, 30.dp)
                                    .offset((-25).dp, (-5).dp)
                                    .clickable {
                                        navController.navigate("CartNAUser")
                                    }
                                ,
                                contentScale = ContentScale.Crop
                            )
                            Text(text = "Корзина", fontSize = 10.sp, modifier = Modifier.offset((-28).dp, 5.dp))
                        }
                        Box(modifier = Modifier.size(50.dp, 30.dp)){

                        }
                        Column {
                            Image(
                                painterResource(id = R.drawable.avatar),
                                contentDescription = "image",
                                modifier = Modifier
                                    .size(31.dp, 31.dp)
                                    .offset((-15).dp, (-5).dp)
                                    .clickable {
                                        navController.navigate("PersonalNAUser")
                                    }
                                ,
                                contentScale = ContentScale.Crop
                            )
                            Text(text = "Личный кабинет", fontSize = 10.sp, modifier = Modifier.offset((-20).dp, (-3).dp))
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun CartNAUSerScreenPreview(navController: NavHostController) {
    CartNAUser(navController)
}