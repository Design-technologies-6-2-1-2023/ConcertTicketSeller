package com.example.ticketease.Screens.HelloPages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ticketease.R
import kotlinx.coroutines.delay

@Composable
fun LogoPage(navController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(2000) // Задержка в 3 секунды
        navController.navigate("HelloPage1") // Переход на другой экран
    }
    Box(

        modifier = Modifier
            .background(color = colorResource(R.color.white))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(contentAlignment = Alignment.Center) {
            Image(
                painterResource(id = R.drawable.logo),
                contentDescription = "image",
                modifier = Modifier
                    .width(400.dp)
                    .align(alignment = Alignment.TopEnd)
                    .offset(y = 0.dp, x = 12.dp),
                contentScale = ContentScale.Crop
            )

        }
    }
}