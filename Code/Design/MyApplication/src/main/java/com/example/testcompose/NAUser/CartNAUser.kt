package com.example.testcompose

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
import com.example.testcompose.SomeItems.Item
import com.example.testcompose.SomeItems.NavigationItem
import com.example.testcompose.SomeItems.TicketItem

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

                    val i =
                        Item("cdc", "dcdcdsc", 5, "dcdc", R.drawable.vkz, StatusEvent.Planned)
                    val j = TicketItem(
                        i.EventDate,
                        i.EventLocation,
                        i.cost,
                        i.EventTitle,
                        i.image,
                        5,
                        8,
                        i.status
                    )
                    val list = listOf<Item>(i, i, i)
                    var TicketList = listOf<TicketItem>(j, j, j, j)
                    for (l in list)
                        ListItemCart(l.image)
                    for (l in TicketList)
                        ListItem2Cart(l.image, l.Row.toString(), l.Place.toString())
                    Box(modifier = Modifier
                        .padding(top = 20.dp)
                        .background(colorResource(R.color.find)). height(100.dp).width(400.dp), contentAlignment = Alignment.Center){
                        Text(text = " Для оплаты билетов нужно авторизоваться \n" +
                                "или зарегистрироваться",fontSize = 25.sp )

                    }
                    Box(){
                        Row(){
                            Button(
                                onClick = { },
                                modifier = Modifier
                                    .height(40.dp)
                                    .width(200.dp),
                                border = BorderStroke(3.dp, Color.White),
                                shape = RoundedCornerShape(50),
                                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                                )
                            {

                                Column {
                                    Text("Войти", fontSize = 15.sp, color = Color.White)

                                }
                            }
                            Button(
                                onClick = { },
                                modifier = Modifier
                                    .height(40.dp)
                                    .width(200.dp),
                                border = BorderStroke(3.dp, Color.White),
                                shape = RoundedCornerShape(50),
                                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                                )
                            {

                                Column {
                                    Text("Регистрация", fontSize = 15.sp, color = Color.White)

                                }
                            }
                        }
                    }
                    Box(contentAlignment = Alignment.Center) {
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .height(50.dp)
                                .width(200.dp),
                            border = BorderStroke(3.dp, colorResource(R.color.backgroud)),
                            shape = RoundedCornerShape(50),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = colorResource(
                                    R.color.backgroud
                                )
                            ),

                            )
                        {

                            Column {
                                Text("Продолжить", fontSize = 25.sp, color = Color.White)

                            }
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
                                modifier = Modifier
                                    .size(30.dp, 30.dp)
                                    .clickable() {
                                        navController.navigate(NavigationItem.CatalogNAUser.route)
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
                                modifier = Modifier
                                    .size(30.dp, 30.dp)
                                    .clickable() {
                                        navController.navigate(NavigationItem.FavoriteNAUser.route)
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
                                modifier = Modifier
                                    .size(30.dp, 30.dp)
                                    .clickable() {
                                        navController.navigate(NavigationItem.PrefarenceNAUser.route)
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
                                modifier = Modifier
                                    .size(30.dp, 30.dp)
                                    .clickable() {
                                        navController.navigate(NavigationItem.CartNAUser.route)
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
                                modifier = Modifier
                                    .size(30.dp, 30.dp)
                                    .clickable() {
                                        navController.navigate(NavigationItem.PersonalNAUser.route)
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

@Composable
fun CartNAUSerScreenPreview(navController: NavHostController) {
    CartNAUser(navController)
}

