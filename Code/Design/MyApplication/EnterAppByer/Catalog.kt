package com.example.ticketease.EnterAppByer

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
fun Catalog(navController: NavHostController) {
    Column() {
        Box(
            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp)
                .fillMaxWidth(), contentAlignment = Alignment.Center
        ) {
            Column() {
                Box(
                    modifier = Modifier
                        .background(color = colorResource(R.color.find))
                        .height(50.dp)
                ) {
                    Row() {
                        Image(
                            painterResource(id = R.drawable.search_interface_symbol),
                            contentDescription = "image",
                            modifier = Modifier.size(50.dp, 50.dp),
                            contentScale = ContentScale.Crop
                        )
                        TextField(value = "Поиск событий", onValueChange = {}, Modifier.padding(10.dp))
                    }

                }
                Box(modifier = Modifier.height(30.dp)) {

                }
                Row() {
                    Image(
                        painterResource(id = R.drawable.filter_v7wlx),
                        contentDescription = "image",
                        modifier = Modifier
                            .size(30.dp, 30.dp)
                            .clickable() {},
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Уточнение и сортировка", fontSize = 20.sp)

                }
            }


        }
        Column() {


            Box(
                modifier = Modifier
                    .background(color = colorResource(R.color.white)),
                contentAlignment = Alignment.BottomCenter
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(colorResource(id = R.color.white))
                        .wrapContentSize(Alignment.Center)
                        .verticalScroll(rememberScrollState())
                ) {

                    /*      val i = Event("cdc", "dcdcdsc", 5, "dcdc", R.drawable.vkz, StatusEvent.Planned)
                    val list = listOf<Item>(i, i, i)
                    for (l in list)
                        ListItem(
                            cost = l.cost.toString(),
                            location = l.EventLocation,
                            date = l.EventDate,
                            name = l.EventTitle,
                            l.image
                        )

                }*/



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
                                        //navController.navigate(NavigationItem.Catalog.route)
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
                                        // navController.navigate(NavigationItem.Favorite.route)
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
                                        //  navController.navigate(NavigationItem.Prefarence.route)
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
                                        // navController.navigate(NavigationItem.Cart.route)
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
                                        navController.navigate("Personal")
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
    fun CatalogScreenPreview(navController: NavHostController) {
        Catalog(navController)
        //Catalog()
    }

    @Composable
    fun ListItem(cost: String, location: String, date: String, name: String, ID: Int) {
        Card(
            modifier = Modifier
                .width(400.dp)
                .height(350.dp)
                .padding(10.dp)
        ) {
            Box(modifier = Modifier.background(color = colorResource(R.color.grey)))
            {
                Column() {
                    Row() {

                        Image(
                            painterResource(id = ID),
                            contentDescription = "image",
                            modifier = Modifier.size(250.dp, 200.dp),
                            contentScale = ContentScale.Crop,
                        )
                        Column() {

                            Image(
                                painterResource(id = R.drawable.like_3ekrj_vojgm),
                                contentDescription = "image2",
                                modifier = Modifier
                                    .size(30.dp, 30.dp)
                                    .clickable() {
                                        /*TODO*/
                                    },
                                contentScale = ContentScale.Crop

                            )
                            Box(modifier = Modifier.height(120.dp)) {}
                            Button(
                                onClick = { },
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(180.dp),
                                border = BorderStroke(3.dp, colorResource(R.color.backgroud)),
                                shape = RoundedCornerShape(50),
                                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud))
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
                            modifier = Modifier.size(25.dp, 25.dp),
                            contentScale = ContentScale.Crop
                        )
                        Box(modifier = Modifier.width(10.dp)) {

                        }
                        Text(
                            text = "Стоимость",
                            fontSize = 15.sp
                        )
                        Box(modifier = Modifier.width(20.dp)) {

                        }

                        Text(
                            text = cost,
                            fontSize = 15.sp

                        )
                    }
                    Row() {
                        Image(
                            painterResource(id = R.drawable.free_icon_place_711170),
                            contentDescription = "image",
                            modifier = Modifier.size(25.dp, 25.dp),
                            contentScale = ContentScale.Crop
                        )
                        Box(modifier = Modifier.width(10.dp)) {

                        }
                        Text(
                            text = "Местоположение",
                            fontSize = 15.sp
                        )
                        Box(modifier = Modifier.width(20.dp)) {

                        }

                        Text(
                            text = location,
                            fontSize = 15.sp

                        )
                    }
                    Row() {
                        Image(
                            painterResource(id = R.drawable.free_icon_dates_4253987),
                            contentDescription = "image",
                            modifier = Modifier.size(25.dp, 25.dp),
                            contentScale = ContentScale.Crop
                        )
                        Box(modifier = Modifier.width(10.dp)) {

                        }
                        Text(
                            text = "Дата проведения",
                            fontSize = 15.sp
                        )
                        Box(modifier = Modifier.width(20.dp)) {

                        }

                        Text(
                            text = date,
                            fontSize = 15.sp

                        )
                    }
                    Row() {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = name, fontSize = 30.sp
                            )
                        }

                    }
                }
            }
        }
    }
}
