package com.example.ticketease.Screens.Organizer


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.ticketease.MVVM.Event.SuccessfulEvent.ViewModelSuccessfulEvent
import com.example.ticketease.R


@Composable
fun SuccessfulEvent(navController: NavHostController, viewModel : ViewModelSuccessfulEvent = hiltViewModel()) {

    Box(

        modifier = Modifier
            .background(color = colorResource(R.color.backgroud))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier= Modifier.size(300.dp, 900.dp))
        {

            Box(contentAlignment = Alignment.Center) {
                Column(modifier= Modifier
                    .size(450.dp, 200.dp)
                    .offset(y = 120.dp, x = -20.dp)) {
                    Text(
                        text = "Мероприятие успешно создано!",
                        fontSize = 32.sp,
                        lineHeight = 50.sp,
                        color = Color.White
                    )
                }
            }

            Box(contentAlignment = Alignment.Center) {

                Button(
                    onClick = {
                        viewModel.createTickets()
                        navController.navigate("CreateEvent")
                              },
                    modifier = Modifier
                        .height(50.dp)
                        .offset(y = 485.dp, x = 65.dp)
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
        }
    }
}