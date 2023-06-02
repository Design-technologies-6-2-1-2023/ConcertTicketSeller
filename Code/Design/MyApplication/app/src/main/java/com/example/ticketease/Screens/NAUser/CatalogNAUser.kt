package com.example.ticketease.Screens.NAUser
import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

import com.example.ticketease.MVVM.Person.Buyer.Avtorize.AvtResult
import com.example.ticketease.MVVM.Person.Buyer.Personal.ViewModelPersonal
import com.example.ticketease.R

@Composable
 fun CatalogNAUser(navController: NavHostController ) {


    Column() {
        Box(

            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp)
                .fillMaxWidth(), contentAlignment = Alignment.Center
        ) {
            Column() {

                Box(modifier = Modifier.height(30.dp)) {

                }
                Row() {

                    Button(
                        onClick = { navController.navigate("EnterPageByer") },
                        modifier = Modifier
                            .height(40.dp)
                            .width(100.dp),
                        border = BorderStroke(3.dp, Color.White),
                        shape = RoundedCornerShape(50),
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                        )
                    {

                        Column {
                            Text("Войти", fontSize = 15.sp, color = Color.White)

                        }
                    }
                }
            }


        }
        Column() {



            Box(
                modifier = Modifier
                    .background(color = colorResource(R.color.white))
                ,
                contentAlignment = Alignment.BottomCenter
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(colorResource(id = R.color.white))
                        .wrapContentSize(Alignment.Center)
                        .verticalScroll(rememberScrollState())
                ) {
                    /*
                    val list = viewModel.catalog
                    var i:Int=0
                    for (l in list){
                        viewModelTicket.id= l.id!!
                        val ticket=viewModelTicket.tickets
                        com.example.ticketease.Screens.EnterAppByer.ListItem(
                            cost = ticket[i].price.toString(),
                            location = l.nameGroup.toString(),
                            date = l.placeTimeId.toString(),
                            name = l.name,
                            R.drawable.vkz
                        )
                        i++
                    }

                     */
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
                                        // navController.navigate(NavigationItem.CatalogNAUser.route)
                                    },
                                    contentScale = ContentScale.Crop
                                )
                                Text(text = "Каталог ", fontSize = 10.sp)
                            }
                            Box(modifier = Modifier.size(30.dp, 30.dp)) {

                            }

                            Box(modifier = Modifier.size(30.dp, 30.dp)) {

                            }
                            Column() {
                                Image(
                                    painterResource(id = R.drawable.dscds),
                                    contentDescription = "image",
                                    modifier = Modifier.size(30.dp, 30.dp).clickable() {
                                        // navController.navigate(NavigationItem.PrefarenceNAUser.route)
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
                                        //  navController.navigate(NavigationItem.CartNAUser.route)
                                    },
                                    contentScale = ContentScale.Crop
                                )
                                Text(text = "Корзина ", fontSize = 10.sp)
                            }
                            Box(modifier = Modifier.size(30.dp, 30.dp)) {

                            }
                            Column() {
                                Image(
                                    painterResource(id = R.drawable.avatar),
                                    contentDescription = "image",
                                    modifier = Modifier.size(30.dp, 30.dp).clickable() {
                                        navController.navigate("PersonalNAUser")
                                    },
                                    contentScale = ContentScale.Crop
                                )
                                Text(text = "Личный кабинет ", fontSize = 10.sp)
                            }
                        }
                    }
                }
            }


            @Composable
            fun CatalogNAUserScreenPreview(navController: NavHostController) {
                CatalogNAUser(navController)
            }

            @Composable
            fun ListItem(cost: String, location: String, date: String, name: String, ID: Int) {
                var isLiked by remember { mutableStateOf(false) }

                Card(
                    modifier = Modifier
                        .width(400.dp)
                        .height(380.dp)
                        .padding(10.dp)
                ) {
                    Box(modifier = Modifier.background(color = colorResource(R.color.vgrey))) {
                        Column() {

                            Row() {
                                Box(
                                    modifier = Modifier.fillMaxWidth(),
                                    contentAlignment = Alignment.TopCenter
                                ) {
                                    Text(
                                        text = name, fontSize = 25.sp
                                    )
                                }

                            }

                            Row() {
                                Image(
                                    painterResource(id = ID),
                                    contentDescription = "image",
                                    modifier = Modifier.size(250.dp, 230.dp).offset(65.dp, 10.dp),
                                    contentScale = ContentScale.Crop,
                                )
                                Column() {

                                    Box(modifier = Modifier.height(120.dp)) {}
                                    Button(
                                        onClick = { },
                                        modifier = Modifier
                                            .height(40.dp)
                                            .offset(15.dp, 140.dp)
                                            .width(120.dp),

                                        colors = ButtonDefaults.buttonColors(
                                            backgroundColor = colorResource(
                                                R.color.find
                                            )
                                        )
                                    )
                                    {
                                        Text("Купить", fontSize = 15.sp, color = Color.White)

                                    }

                                }
                            }
                            Row() {
                                Image(
                                    painterResource(id = R.drawable.free_icon_ruble_1868089),
                                    contentDescription = "image",
                                    modifier = Modifier.size(17.dp, 17.dp).offset(15.dp, 22.dp),
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = "Стоимость",
                                    modifier = Modifier.offset(20.dp, 20.dp),
                                    fontSize = 15.sp
                                )
                                Box(modifier = Modifier.width(20.dp)) {

                                }
                            }
                            Row() {
                                Image(
                                    painterResource(id = R.drawable.free_icon_place_711170),
                                    contentDescription = "image",
                                    modifier = Modifier.size(17.dp, 17.dp).offset(15.dp, 22.dp),
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = "Местоположение",
                                    modifier = Modifier.offset(20.dp, 20.dp),
                                    fontSize = 15.sp
                                )
                            }
                            Row() {
                                Image(
                                    painterResource(id = R.drawable.free_icon_dates_4253987),
                                    contentDescription = "image",
                                    modifier = Modifier.size(17.dp, 17.dp).offset(15.dp, 22.dp),
                                    contentScale = ContentScale.Crop
                                )
                                Text(
                                    text = "Дата проведения",
                                    modifier = Modifier.offset(20.dp, 20.dp),
                                    fontSize = 15.sp
                                )
                            }

                        }
                    }
                }
            }

    }
}