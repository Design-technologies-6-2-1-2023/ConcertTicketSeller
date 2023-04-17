package com.example.testcompose.Byer

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcompose.Item
import com.example.testcompose.R
import com.example.testcompose.Routes
@Composable
fun Prefarence() {
    Column() {
        Box(modifier = Modifier.height(30.dp)){

        }
        Box(

            modifier = Modifier
                .background(color = colorResource(R.color.backgroud))
                .height(150.dp)
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
                Box(modifier = Modifier.height(30.dp)){

                }
                Row() {
                    Image(
                        painterResource(id = R.drawable.filter_v7wlx),
                        contentDescription = "image",
                        modifier = Modifier.size(30.dp, 30.dp).clickable() {},
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Уточнение и сортировка", fontSize = 20.sp)

                }
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
                    ListItem(cost = l.cost.toString(), location = l.EventLocation, date = l.EventDate, name =l.EventTitle,l.image )

            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun PrefarenceScreenPreview() {
    Prefarence()
}