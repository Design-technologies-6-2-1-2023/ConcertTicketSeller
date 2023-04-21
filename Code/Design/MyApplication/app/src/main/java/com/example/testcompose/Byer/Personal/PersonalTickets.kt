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
import com.example.testcompose.SomeItems.PersonItem
import com.example.testcompose.SomeItems.TicketItem

@Composable
fun PersonalTickets(navController: NavHostController) {
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
                    onClick = {navController.navigate(NavigationItem.Personal.route)},
                    modifier = Modifier
                        .padding(top = 30.dp)
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

                Box(
                    modifier = Modifier
                        .background(color = colorResource(R.color.white)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(colorResource(id = R.color.white))
                            .wrapContentSize(Alignment.Center)
                            .verticalScroll(rememberScrollState())
                    ) {

                        val i = Item("cdc", "dcdcdsc", 5, "dcdc", R.drawable.vkz, StatusEvent.Planned)
                        val j = TicketItem(
                            i.EventDate,
                            i.EventLocation,
                            i.cost,
                            i.EventTitle,
                            i.image,
                            5,
                            8, i.status
                        )
                        val list = listOf<Item>(i, i, i)
                        var TicketList = listOf<TicketItem>(j, j, j, j)

                        for (l in TicketList)
                            ListItemPersonalInformation(
                                l.cost.toString(),
                                l.EventLocation,
                                l.EventDate,
                                l.EventTitle,
                                l.Row.toString(),
                                l.Place.toString(), l.status, l.image
                            )

                    }

                }
            }

        }
    }
}


@Composable
fun ListItemPersonalInformation(   cost:String, location:String, date:String, name:String,Row:String, Column:String, statusEvent: StatusEvent, ID:Int) {
    Card(
        modifier = Modifier
            .width(400.dp)
            .height(200.dp)
            .padding(10.dp),

    ) {
        Box(modifier = Modifier.background(color = colorResource(R.color.grey)))
        {
            Column() {
                Box(modifier = Modifier.height(15.dp)){

                }

                Row() {
                    Box(modifier = Modifier.width(5.dp)) {

                    }
                    Column {
                        Text(
                            text = name,
                            fontSize = 25.sp
                        )
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
                            Image(
                                painterResource(id = R.drawable.ivh0xvcp_transformed),
                                contentDescription = "image",
                                modifier = Modifier.size(25.dp, 25.dp),
                                contentScale = ContentScale.Crop
                            )
                            Box(modifier = Modifier.width(10.dp)) {

                            }
                            Text(
                                text = "Места ",
                                fontSize = 15.sp
                            )
                            Box(modifier = Modifier.width(20.dp)) {

                            }
                            Text(
                                text = Row, fontSize = 15.sp
                            )
                            Box(modifier = Modifier.width(10.dp)) {

                            }
                            Text(
                                text = Column, fontSize = 15.sp
                            )

                        }
                        Row(){

                        }
                        if( statusEvent==StatusEvent.Planned){
                            PlannedStatus()
                        }else{
                            CancelledStatus()
                        }
                    }

                }
            }
        }
    }
}


@Composable
fun PlannedStatus(){
    Column(modifier = Modifier
        .background(colorResource(R.color.greenMy))
        .width(150.dp)
        .height(20.dp)) {
        Text("Запланировано", fontSize = 15.sp, color = Color.Black)
    }
}
@Composable
fun CancelledStatus(){
    Column(modifier = Modifier
        .background(colorResource(R.color.redMy))
        .width(150.dp)
        .height(20.dp)) {
        Text("Отменено", fontSize = 15.sp, color = Color.Black)
    }
}
