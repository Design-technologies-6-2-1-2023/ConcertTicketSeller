package com.example.ticketease.Screens.NAUser

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
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
import com.example.ticketease.MVVM.Event.Catalog.ViewModelCatalog
import com.example.ticketease.R
import java.time.Instant


@Composable
fun PreferenceNAUSer(navController: NavHostController, viewModel: ViewModelCatalog = hiltViewModel() ) {
    val events = viewModel.catalog.observeAsState(initial = listOf())

    Column() {
        Box(

            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp).fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Column(  modifier = Modifier.padding(50.dp)) {
                Text("Предпочтения", fontSize = 35.sp, color = Color.White)

            }
        }
        Column() {


            Box(
                modifier = Modifier
                    .background(color = colorResource(R.color.white))
                ,
                contentAlignment = Alignment.BottomCenter
            ) {
                Box(modifier = Modifier.padding(bottom = 70.dp).fillMaxHeight()) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(colorResource(id = R.color.white))
                            .wrapContentSize(Alignment.Center)
                            .verticalScroll(rememberScrollState())
                    ) {
                        for (event in events.value)
                            com.example.testcompose.ListItem(
                                eventId = event.eventId,
                                name = event.name,
                                location = event.location,
                                date = Instant.ofEpochMilli(event.date),
                                cost = event.price,
                                ID = R.drawable.vkz
                            )


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
                                painterResource(id = R.drawable.qyv16bev_kxg8u),
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
                                painterResource(id = R.drawable.shopcart),
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