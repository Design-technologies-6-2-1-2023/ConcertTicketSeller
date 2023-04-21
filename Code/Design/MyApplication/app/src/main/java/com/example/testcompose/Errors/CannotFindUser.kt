package com.example.testcompose

import androidx.compose.foundation.BorderStroke
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
import androidx.navigation.NavHostController
import com.example.testcompose.SomeItems.NavigationItem

@Composable
fun CannotFindUser(navController: NavHostController) {
    Box(

        modifier = Modifier
            .background(color = colorResource(R.color.backgroud))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier= Modifier.height(600.dp).width(300.dp))
        {
            Box(contentAlignment = Alignment.Center) {
                Text(
                    text = "Ой, ошибочка вышла!\n" +
                            "Не найдено аккаунта с таким логином",
                    fontSize = 32.sp,
                    lineHeight = 50.sp,
                    color = Color.White
                )

            }

            Box(contentAlignment = Alignment.Center) {

                Button(
                    onClick = { navController.navigate(NavigationItem.RegisterOrg.route)},
                    modifier = Modifier
                        .padding(top = 200.dp)
                        .height(50.dp)
                        .width(200.dp),
                    border = BorderStroke(3.dp, Color.White),
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

                    )
                {

                    Column {
                        Text("Регистрация", fontSize = 25.sp, color = Color.White)

                    }
                }
            }

        }
    }
}