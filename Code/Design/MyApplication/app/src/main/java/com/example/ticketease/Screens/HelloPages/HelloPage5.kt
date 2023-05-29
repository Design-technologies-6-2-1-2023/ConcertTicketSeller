package com.example.ticketease.Screens.HelloPages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ticketease.R
var role:Role =Role.BUYER
@Composable
fun HelloPage5(navController: NavHostController) {

    val selectedRole = rememberSaveable { mutableStateOf(Role.NONE) }
    val isButtonPressed1 = remember { mutableStateOf(false) }
    val isButtonPressed2 = remember { mutableStateOf(false) }
    Box(

        modifier = Modifier
            .background(color = colorResource(R.color.backgroud))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier= Modifier.size(320.dp, 900.dp))
        {
            Box(contentAlignment = Alignment.TopStart) {
                Column() {
                    Box(modifier = Modifier.size(10.dp, 10.dp)) {

                    }
                    Row() {
                        Box(modifier = Modifier.size(270.dp, 10.dp)) {

                        }
                        Image(
                            painterResource(id = R.drawable.krest),
                            contentDescription = "image",
                            modifier = Modifier.size(70.dp, 70.dp).clickable(){
                                role=Role.NAUSER

                                navController .navigate("HelloPage7")
                            }

                        )
                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {

                Button(
                    onClick = {
                        selectedRole.value = Role.BUYER
                        isButtonPressed1.value = !isButtonPressed1.value
                        navController.navigate("HelloPage6")
                              },
                    modifier = Modifier.height(50.dp).width(300.dp).offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressed1.value) colorResource(R.color.find) else colorResource(R.color.white)
                    ),

                    )
                {

                    Column {
                        Text("Я - Покупатель", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        selectedRole.value = Role.ORGANIZER
                        isButtonPressed2.value = !isButtonPressed2.value
                        navController.navigate("HelloPage6")

                    },
                    modifier = Modifier.padding(top = 10.dp).height(50.dp).width(300.dp).offset(y = 270.dp, x = 0.dp),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(

                        backgroundColor = if (isButtonPressed2.value) colorResource(R.color.find) else colorResource(R.color.white),

                    ),
                    )

                {

                    Column {
                        Text("Я - Организатор", fontSize = 15.sp, color = Color.Black)

                    }
                }
            }
            /*
            Box(contentAlignment = Alignment.TopStart ) {

                Button(
                    onClick = {navController.navigate("HelloPage6")},
                    modifier = Modifier
                        .height(50.dp)
                        .offset(y = 470.dp, x = 65.dp)
                        .width(170.dp),
                    border = BorderStroke(3.dp, Color.White),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                    )
                {

                    Column {
                        Text("Далее", fontSize = 25.sp, color = Color.White)

                    }
                }


            }

             */

        }
    }

}

enum class Role {
    BUYER,
    ORGANIZER,
    NONE,
    NAUSER
}