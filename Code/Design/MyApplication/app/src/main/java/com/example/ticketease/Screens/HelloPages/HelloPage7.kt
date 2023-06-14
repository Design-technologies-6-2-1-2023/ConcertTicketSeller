package com.example.ticketease.Screens.HelloPages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.ticketease.DataClasses.Person.Cities
import com.example.ticketease.DataClasses.Person.Role
import com.example.ticketease.MVVM.HelloPages.HelloPage7ChooseCity
import com.example.ticketease.MVVM.HelloPages.HelloPage7ViewModel
import com.example.ticketease.R
@Composable
fun HelloPage7(navController: NavHostController, viewModel: HelloPage7ViewModel = hiltViewModel()) {
    Box(
        modifier = Modifier
            .background(color = colorResource(R.color.backgroud))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.size(300.dp, 900.dp))
        {
            Box(contentAlignment = Alignment.Center) {

                Button(
                    onClick = {
                        viewModel.city(HelloPage7ChooseCity.City(Cities.Voronezh))
                        viewModel.city(HelloPage7ChooseCity.SaveCity)
                        if (viewModel.roleState == Role.BUYER.toString())
                            navController.navigate("CatalogNAUser") else if(viewModel.roleState == Role.ORGANIZER.toString())
                            navController.navigate("EnterPageOrg")


                    },
                    modifier = Modifier.padding(top = 100.dp).height(50.dp).width(300.dp)
                        .offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(R.color.white)
                    ))
                {

                    Column {
                        Text("Воронеж", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        viewModel.city(HelloPage7ChooseCity.City(Cities.Moscow))
                        viewModel.city(HelloPage7ChooseCity.SaveCity)
                        if (viewModel.roleState == Role.BUYER.toString())
                            navController.navigate("CatalogNAUser") else if(viewModel.roleState == Role.ORGANIZER.toString())
                            navController.navigate("EnterPageOrg")                  },
                    modifier = Modifier.padding(top = 10.dp).height(50.dp).width(300.dp)
                        .offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(R.color.white)
                    ))
                {

                    Column {
                        Text("Москва", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        viewModel.city(HelloPage7ChooseCity.City(Cities.SaintPetersburg))
                        viewModel.city(HelloPage7ChooseCity.SaveCity)
                        if (viewModel.roleState == Role.BUYER.toString())
                            navController.navigate("CatalogNAUser") else if(viewModel.roleState == Role.ORGANIZER.toString())
                            navController.navigate("EnterPageOrg")
                    },
                    modifier = Modifier.padding(top = 10.dp).height(50.dp).width(300.dp)
                        .offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(R.color.white)
                    ))
                {

                    Column {
                        Text("Санкт-Петербург", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
        }
    }
}
