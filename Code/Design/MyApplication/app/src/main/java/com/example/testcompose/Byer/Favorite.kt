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
import com.example.testcompose.SomeItems.Item

@Composable
fun Favorite() {
    Column() {

        Box(

            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp),
            contentAlignment = Alignment.Center) {
            Column(  modifier = Modifier.padding(50.dp)) {
                Text("Избранное", fontSize = 35.sp, color = Color.White)

            }
        }
        Box(
            modifier = Modifier
                .background(color = colorResource(R.color.white))
            ,
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.white))
                    .wrapContentSize(Alignment.Center)
                    .verticalScroll(rememberScrollState())
            ) {

                val i= Item("cdc", "dcdcdsc", 5, "dcdc", R.drawable.vkz, StatusEvent.Planned)
                val list= listOf<Item>(i, i, i)
                for(l in list)
                    ListItemFavorite(cost = l.cost.toString(), location = l.EventLocation, date = l.EventDate, name =l.EventTitle,l.image )

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteScreenPreview() {
    Favorite()
}
@Composable
fun ListItemFavorite(cost:String, location:String, date:String, name:String,  ID: Int) {
    Card(
        modifier = Modifier
            .width(400.dp)
            .height(330.dp)
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
                            painterResource(id = R.drawable._jltfum4_sx1na_transformed),
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
                            onClick = { /*TODO*/ },
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