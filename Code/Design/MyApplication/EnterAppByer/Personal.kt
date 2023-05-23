package com.example.ticketease.EnterAppByer

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
import com.example.ticketease.MVVM.Person.Buyer.Avtorize.ViewModelAvtBuyer
import com.example.ticketease.MVVM.Person.Buyer.Register.ViewModelRegistBuyer
import com.example.ticketease.R

@Composable
fun Personal(navController: NavHostController) {

    Column() {

        Box(

            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Column(  modifier = Modifier.padding(50.dp)) {
                Text("Личный кабинет", fontSize = 35.sp, color = Color.White)

            }
        }
        Column() {
            Box( modifier = Modifier
                .background(color = colorResource(R.color.white))
                ,
                contentAlignment = Alignment.BottomCenter) {

                    Column() {


                        Button(
                            onClick = {  },
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
                                    Text(p.mobile, fontSize = 25.sp, color = Color.Black)


                                }
                            }
                        }

                        Button(
                            onClick = {  },
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
                                        p.city.toString(),
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
                                Box() {
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
                                        Box(modifier = Modifier.width(40.dp)) {

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
                                        Box(modifier = Modifier.width(40.dp)) {

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
                                        Box(modifier = Modifier.width(40.dp)) {

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
                            }
                        }

                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier.padding(50.dp)
                                ) {

                                    Button(
                                        onClick = { },
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
                                            Text("Выйти", fontSize = 25.sp, color = Color.White)

                                        }
                                    }
                                }

                        Box(
                            modifier = Modifier
                                .background(color = colorResource(R.color.white))
                                .fillMaxWidth()
                                .height(60.dp), contentAlignment = Alignment.BottomCenter
                        ) {
                            Row() {
                                Column() {
                                    Image(
                                        painterResource(id = R.drawable.xkqmspc),
                                        contentDescription = "image",
                                        modifier = Modifier.size(30.dp, 30.dp).clickable() {
                                        },
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(text = "Каталог ", fontSize = 10.sp)
                                }
                                Box(modifier = Modifier.size(30.dp, 30.dp)) {

                                }
                                Column() {
                                    Image(
                                        painterResource(id = R.drawable.like_3ekrj),
                                        contentDescription = "image",
                                        modifier = Modifier.size(30.dp, 30.dp).clickable() {
                                        },
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(text = "Избранное ", fontSize = 10.sp)
                                }
                                Box(modifier = Modifier.size(30.dp, 30.dp)) {

                                }
                                Column() {
                                    Image(
                                        painterResource(id = R.drawable.dscds),
                                        contentDescription = "image",
                                        modifier = Modifier.size(30.dp, 30.dp).clickable() {
                                        },
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(text = "Предпочтения ", fontSize = 10.sp)
                                }
                                Box(modifier = Modifier.size(30.dp, 30.dp)) {

                                }
                                Column() {
                                    Image(
                                        painterResource(id = R.drawable.free_icon_shopping_cart_481384_bhbaq__1__0phyx),
                                        contentDescription = "image",
                                        modifier = Modifier.size(30.dp, 30.dp).clickable() {
                                        },
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(text = "Корзина ", fontSize = 10.sp)
                                }
                                Box(modifier = Modifier.size(30.dp, 30.dp)) {

                                }
                                Column() {
                                    Image(
                                        painterResource(id = R.drawable._dnq1pfj_transformed_oo6wt),
                                        contentDescription = "image",
                                        modifier = Modifier.size(30.dp, 30.dp).clickable() {
                                        },
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(text = "Личный кабинет ", fontSize = 10.sp)
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