package com.example.ticketease.Screens.HelloPages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.ticketease.DataClasses.Person.Role
import com.example.ticketease.MVVM.HelloPages.HelloPage5ChooseRole
import com.example.ticketease.MVVM.HelloPages.HelloPage5ViewModel
import com.example.ticketease.R

@Composable
fun HelloPage5(navController: NavHostController, viewModel: HelloPage5ViewModel = hiltViewModel()) {
    Box(
        modifier = Modifier
            .background(color = colorResource(R.color.backgroud))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier= Modifier.size(320.dp, 900.dp))
        {
            Box(contentAlignment = Alignment.TopStart) {
                Column{
                    Box(modifier = Modifier.size(10.dp, 10.dp)) {

                    }
                    Row{
                        Box(modifier = Modifier.size(270.dp, 10.dp)) {

                        }
                        Image(
                            painterResource(id = R.drawable.krest),
                            contentDescription = "image",
                            modifier = Modifier.size(70.dp, 70.dp).clickable{
                                navController .navigate("HelloPage5")
                            }

                        )
                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {

                Button(
                    onClick = {
                        viewModel.role(HelloPage5ChooseRole.TypeRole(Role.BUYER))
                        viewModel.role(HelloPage5ChooseRole.SaveRole)
                        navController.navigate("HelloPage6")
                              },
                    modifier = Modifier.height(50.dp).width(300.dp).offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = colorResource(R.color.white)
                    ))
                {

                    Column {
                        Text("Я - Покупатель", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        viewModel.role(HelloPage5ChooseRole.TypeRole(Role.ORGANIZER))
                        viewModel.role(HelloPage5ChooseRole.SaveRole)
                        navController.navigate("HelloPage6")

                    },
                    modifier = Modifier.padding(top = 10.dp).height(50.dp).width(300.dp).offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(R.color.white)
                    ))

                {

                    Column {
                        Text("Я - Организатор", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
        }
    }
}