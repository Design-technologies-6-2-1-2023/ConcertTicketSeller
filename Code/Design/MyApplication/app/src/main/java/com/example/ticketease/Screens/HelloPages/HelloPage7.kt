package com.example.ticketease.Screens.HelloPages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.ticketease.DataClasses.Person.Cities
import com.example.ticketease.MVVM.HelloPagesPut.putCity
import com.example.ticketease.R
//var city = Cities.Moscow
@Composable
fun HelloPage7(navController: NavHostController, c: putCity = hiltViewModel()) {
    val selectedCity = rememberSaveable { mutableStateOf(Cities.Voronezh) }
    val isButtonPressedVrn = remember { mutableStateOf(false) }
    val isButtonPressedSpb = remember { mutableStateOf(false) }
    val isButtonPressedMsc = remember { mutableStateOf(false) }
    Box(

        modifier = Modifier
            .background(color = colorResource(R.color.backgroud))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier= Modifier.size(300.dp, 900.dp))
        {
            Box(contentAlignment = Alignment.Center) {

                Button(
                    onClick = {
                        selectedCity.value = Cities.Voronezh
                        isButtonPressedVrn.value = !isButtonPressedVrn.value
                        c.put(Cities.Voronezh)
                        toNextPage(navController)

                    },
                    modifier = Modifier.padding(top = 100.dp).height(50.dp).width(300.dp).offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressedVrn.value) colorResource(R.color.find) else colorResource(R.color.white)
                    ),

                    )
                {

                    Column {
                        Text("Воронеж", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        selectedCity.value = Cities.Moscow
                        isButtonPressedMsc.value = !isButtonPressedMsc.value
                        c.put(Cities.Moscow)
                        toNextPage(navController)
                    },
                    modifier = Modifier.padding(top = 10.dp).height(50.dp).width(300.dp).offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressedMsc.value) colorResource(R.color.find) else colorResource(R.color.white)
                    ),

                    )
                {

                    Column {
                        Text("Москва", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        selectedCity.value = Cities.SaintPetersburg
                        isButtonPressedSpb.value = !isButtonPressedSpb.value
                        c.put(Cities.SaintPetersburg)
                        toNextPage(navController)
                              },
                    modifier = Modifier.padding(top = 10.dp).height(50.dp).width(300.dp).offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressedSpb.value) colorResource(R.color.find) else colorResource(R.color.white)
                    ),

                    )
                {

                    Column {
                        Text("Санкт-Петербург", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
        }
    }
}
 private  fun toNextPage(navController: NavHostController){
     if(role== Role.BUYER){
         navController.navigate("EnterPageByer")
     }else if(role ==Role.ORGANIZER){
         navController.navigate("")

     }else if(role==Role.NAUSER){
         navController.navigate("CatalogNAUser")

     }else{
         navController.navigate("HelloPage5")

     }
 }