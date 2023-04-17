package com.example.testcompose.Byer

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcompose.Item
import com.example.testcompose.R

@Composable
fun Cart() {
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

                val i= Item("cdc", "dcdcdsc", 5, "dcdc", R.drawable.vkz)
                val list= listOf<Item>(i, i, i)
                for(l in list)
                    ListItemCart( date = l.EventDate, name =l.EventTitle,l.image )

            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun CartScreenPreview() {
    Cart()
}

@Composable
fun ListItemCart( date:String, name:String,  ID: Int) {
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
                    Box(modifier = Modifier.width(5.dp)){

                    }
                    Box(contentAlignment = Alignment.Center) {
                        Image(
                            painterResource(id = ID),
                            contentDescription = "image",
                            modifier = Modifier.size(200.dp, 150.dp),
                            contentScale = ContentScale.Crop,
                        )
                    }
                    Box(modifier = Modifier.width(120.dp)){

                    }
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

                    }
                }
            }
        }
    }
}
