package com.example.ticketease.Screens.NAUser

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import com.example.ticketease.MVVM.Person.Buyer.CitySelector.CitySelector
import com.example.ticketease.MVVM.Person.Buyer.CitySelector.ViewModelCitySelector
import com.example.ticketease.MVVM.Person.NAUser.CorerctCity.ViewModelCitySelectorNAUser
import com.example.ticketease.MVVM.Person.NAUser.CorerctCity.ViewModelCitySelectorNAUser_Factory
import com.example.ticketease.R

@Composable
fun CitySelectorNAUser(navController: NavHostController, viewModel: ViewModelCitySelectorNAUser = hiltViewModel()) {

    val selectedCity = rememberSaveable { mutableStateOf(Cities.Voronezh) }
    val isButtonPressedVrn = remember { mutableStateOf(false) }
    val isButtonPressedSpb = remember { mutableStateOf(false) }
    val isButtonPressedMsc = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .background(color = colorResource(R.color.white))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(modifier = Modifier.size(300.dp, 900.dp))
        {
            
            Box(contentAlignment = Alignment.Center) {
                Text("Город", fontSize = 35.sp, color = Color.Black)
                Button(
                    onClick = {
                        viewModel.city(com.example.ticketease.MVVM.Person.NAUser.CorerctCity.CitySelectorNAUser.City(Cities.Voronezh))
                        viewModel.city(com.example.ticketease.MVVM.Person.NAUser.CorerctCity.CitySelectorNAUser.SaveCity)
                        navController.navigate("PersonalNAUser")
                    },
                    modifier = Modifier.padding(top = 140.dp).height(50.dp).width(300.dp)
                        .offset(y = 0.dp, x = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressedVrn.value) colorResource(R.color.backgroud) else colorResource(
                            R.color.find
                        )
                    ),

                    )
                {

                    Column {
                        Text("Воронеж", fontSize = 18.sp, color = Color.White)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        viewModel.city(com.example.ticketease.MVVM.Person.NAUser.CorerctCity.CitySelectorNAUser.City(Cities.Moscow))
                        viewModel.city(com.example.ticketease.MVVM.Person.NAUser.CorerctCity.CitySelectorNAUser.SaveCity)
                        navController.navigate("PersonalNAUser")
                    },
                    modifier = Modifier.padding(top = 20.dp).height(50.dp).width(300.dp)
                        .offset(y = 0.dp, x = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressedMsc.value) colorResource(R.color.backgroud) else colorResource(
                            R.color.find
                        )
                    ),

                    )
                {

                    Column {
                        Text("Москва", fontSize = 18.sp, color = Color.White)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        viewModel.city(com.example.ticketease.MVVM.Person.NAUser.CorerctCity.CitySelectorNAUser.City(Cities.SaintPetersburg))
                        viewModel.city(com.example.ticketease.MVVM.Person.NAUser.CorerctCity.CitySelectorNAUser.SaveCity)
                        navController.navigate("PersonalNAUser")
                    },
                    modifier = Modifier.padding(top = 20.dp).height(50.dp).width(300.dp)
                        .offset(y = 0.dp, x = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressedSpb.value) colorResource(R.color.backgroud) else colorResource(
                            R.color.find
                        )
                    ),

                    )
                {

                    Column {
                        Text("Санкт-Петербург", fontSize = 18.sp, color = Color.White)

                    }
                }
            }
            Box(contentAlignment = Alignment.TopStart) {
                // TODO What is this?
            }
        }
    }
}