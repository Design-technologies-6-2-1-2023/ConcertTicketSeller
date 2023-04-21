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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.testcompose.SomeItems.Item
import com.example.testcompose.SomeItems.NavigationItem
import com.example.testcompose.SomeItems.TicketItem

@Composable
fun Cart(navController: NavHostController) {
    Column() {

        Box(

            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp).fillMaxWidth(),
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

                    Box(contentAlignment = Alignment.Center) {
                        Button(
                            onClick = {},
                            modifier = Modifier.padding(top = 10.dp).height(50.dp)
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
                                        modifier = Modifier.size(30.dp, 30.dp).clickable() {
                                            navController.navigate(NavigationItem.Catalog.route)
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
                                            navController.navigate(NavigationItem.Favorite.route)
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
                                            navController.navigate(NavigationItem.Prefarence.route)
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
                                            navController.navigate(NavigationItem.Cart.route)
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
                                            navController.navigate(NavigationItem.Personal.route)
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
fun CartScreenPreview(navController: NavHostController) {
    Cart(navController)
}

@Composable
fun ListItem2Cart(   ID: Int, Row:String, Column:String) {
    Card(
        modifier = Modifier
            .width(400.dp)
            .height(200.dp)
            .padding(10.dp)
    ) {
        Box(modifier = Modifier.background(color = colorResource(R.color.grey)))
        {
            Column() {
                Box(modifier = Modifier.height(15.dp)){

                }

                Row() {
                    Box(modifier = Modifier.width(5.dp)) {

                    }
                    Box(contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = ID),
                            contentDescription = "image",
                            modifier = Modifier.size(200.dp, 150.dp),
                            contentScale = ContentScale.Crop,
                        )
                    }
                    Column() {


                        Row() {
                            Box(
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(30.dp)
                            ) {

                            }
                            Column() {
                                Image(
                                    painterResource(id = R.drawable.ticketease__12__transformed),
                                    contentDescription = "image2",
                                    modifier = Modifier
                                        .size(30.dp, 30.dp)
                                        .clickable() {
                                            /*TODO*/
                                        },
                                    contentScale = ContentScale.Crop

                                )


                            }

                        }
                        Box(modifier = Modifier.height(75.dp)) {

                        }
                        Box() {
                            Column() {


                                Row() {
                                    Box(modifier = Modifier.width(65.dp)) {

                                    }
                                    Text(
                                        text = "Ряд",
                                        fontSize = 12.sp,
                                        lineHeight = 20.sp, color = Color.Black
                                    )
                                    Box(modifier = Modifier.width(5.dp)) {

                                    }
                                    EnterRow(Row)


                                }
                                Row() {
                                    Box(modifier = Modifier.width(65.dp)) {

                                    }
                                    Text(
                                        text = "Место",
                                        fontSize = 12.sp,
                                        lineHeight = 20.sp, color = Color.Black
                                    )
                                    EnterPlace(i = Column)
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
fun EnterRow(i:String){
    Text(
        text = i,
        fontSize = 12.sp,
        lineHeight = 20.sp, color = Color.Black
    )
}

@Composable
fun EnterPlace(i:String){
    Text(
        text = i,
        fontSize = 12.sp,
        lineHeight = 20.sp, color = Color.Black
    )
}



@Composable
fun ListItemCart(   ID: Int) {
    Card(
        modifier = Modifier
            .width(400.dp)
            .height(200.dp)
            .padding(10.dp)
    ) {
        Box(modifier = Modifier.background(color = colorResource(R.color.grey)))
        {
            Column() {
                Box(modifier = Modifier.height(15.dp)){

                }

                Row() {
                    Box(modifier = Modifier.width(5.dp)) {

                    }
                    Box(contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = ID),
                            contentDescription = "image",
                            modifier = Modifier.size(200.dp, 150.dp),
                            contentScale = ContentScale.Crop,
                        )
                    }
                    Column() {


                        Row() {
                            Box(
                                modifier = Modifier
                                    .width(120.dp)
                                    .height(30.dp)
                            ) {

                            }
                            Column() {
                                Image(
                                    painterResource(id = R.drawable.like_3ekrj_h6d5l),
                                    contentDescription = "image2",
                                    modifier = Modifier
                                        .size(30.dp, 30.dp)
                                        .clickable() {
                                            /*TODO*/
                                        },
                                    contentScale = ContentScale.Crop

                                )


                            }

                        }
                        Box(modifier = Modifier.height(95.dp)){

                        }
                        Row() {
                            Box(modifier = Modifier.width(35.dp)){

                            }
                            Text(
                                text = "Количество",
                                fontSize = 12.sp,
                                lineHeight = 20.sp, color = Color.Black
                            )
                            Box(modifier = Modifier.width(5.dp)){

                            }
                            counter()

                        }
                    }

                }
            }
        }
    }
}

@Composable
fun showEn(i:String){

    Text(
        text = i,
        fontSize = 12.sp,
        lineHeight = 20.sp, color = Color.Black
    )
}
@Composable
fun counter(){
    Image(
        painterResource(id = R.drawable.like_3ekrj_h6d5l),
        contentDescription = "image2",
        modifier = Modifier
            .size(15.dp, 15.dp)
            .clickable() {


            },
        contentScale = ContentScale.Crop

    )
    showEn(i = 3.toString())
    Image(
        painterResource(id = R.drawable.like_3ekrj_h6d5l),
        contentDescription = "image2",
        modifier = Modifier
            .size(15.dp, 15.dp)
            .clickable() {
                /*TODO*/
            },
        contentScale = ContentScale.Crop

    )
}