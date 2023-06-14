package com.example.ticketease.Screens.NAUser

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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.ticketease.MVVM.Person.NAUser.NAUerPersonal.ViewModelNAUserPersonal
import com.example.ticketease.R


@Composable
fun PersonalNAUSer(navController: NavHostController, viewModel: ViewModelNAUserPersonal = hiltViewModel()) {
    val city = viewModel.city

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color.White)
    ) {
        Column() {
            Box(

                modifier = Modifier
                    .background(color = colorResource(R.color.backgroud))
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Column(modifier = Modifier.padding(50.dp)) {
                    Text("Личный кабинет", fontSize = 35.sp, color = Color.White)

                }
            }
            Column(  ) {

                    Box(modifier = Modifier.fillMaxHeight(),contentAlignment = Alignment.BottomCenter
                    ) {
                        Column() {

                            Box(modifier = Modifier.fillMaxHeight()) {
                                Column() {
                                    Text(
                                        "Ваш город",
                                        fontSize = 25.sp,
                                        color = Color.Black,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Row() {
                                        Text(
                                            city,
                                            fontSize = 25.sp,
                                            color = Color.Black
                                        )
                                        Box(modifier = Modifier.width(25.dp)) {

                                        }
                                        Image(
                                            painterResource(id = R.drawable.oeemhqaf_transformed),
                                            contentDescription = "image",
                                            modifier = Modifier
                                                .size(25.dp, 25.dp)
                                                .clickable() {
                                                    navController.navigate("CitySelectorNAUser")
                                                },
                                            contentScale = ContentScale.Crop,

                                            )

                                    }
                                    Box(modifier = Modifier.size(100.dp, 100.dp)) {

                                    }


                                    Button(
                                        onClick = { navController.navigate("EnterPageByer") },
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(350.dp),
                                        border = BorderStroke(
                                            3.dp,
                                            colorResource(R.color.backgroud)
                                        ),
                                        shape = RoundedCornerShape(50),
                                        colors = ButtonDefaults.buttonColors(
                                            backgroundColor = colorResource(
                                                R.color.backgroud
                                            )
                                        ),

                                        )
                                    {

                                        Column {
                                            Text("Вoйти", fontSize = 25.sp, color = Color.White)

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
                                            },
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(
                                        text = "Каталог",
                                        fontSize = 10.sp,
                                        modifier = Modifier.padding(23.dp, 5.dp)
                                    )
                                }
                                Box(modifier = Modifier.size(50.dp, 30.dp)) {

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
                                            },
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(
                                        text = "Предпочтения",
                                        fontSize = 10.sp,
                                        modifier = Modifier.offset((-25).dp, 0.dp)
                                    )
                                }
                                Box(modifier = Modifier.size(50.dp, 30.dp)) {

                                }
                                Column {
                                    Image(
                                        painterResource(id = R.drawable.shopcart),
                                        contentDescription = "image",
                                        modifier = Modifier
                                            .size(30.dp, 30.dp)
                                            .offset((-25).dp, (-5).dp)
                                            .clickable {
                                                navController.navigate("CartNAUser")
                                            },
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(
                                        text = "Корзина",
                                        fontSize = 10.sp,
                                        modifier = Modifier.offset((-28).dp, 5.dp)
                                    )
                                }
                                Box(modifier = Modifier.size(50.dp, 30.dp)) {

                                }
                                Column {
                                    Image(
                                        painterResource(id = R.drawable.avatarbl),
                                        contentDescription = "image",
                                        modifier = Modifier
                                            .size(31.dp, 31.dp)
                                            .offset((-15).dp, (-5).dp)
                                            .clickable {
                                                navController.navigate("PersonalNAUser")
                                            },
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(
                                        text = "Личный кабинет",
                                        fontSize = 10.sp,
                                        modifier = Modifier.offset((-20).dp, (-3).dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
            }
        }



