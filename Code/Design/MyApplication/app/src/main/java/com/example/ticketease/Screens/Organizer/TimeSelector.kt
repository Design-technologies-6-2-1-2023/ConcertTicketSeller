package com.example.ticketease.Screens.Organizer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.example.ticketease.MVVM.Event.SelectPlace.SelectPlace
import com.example.ticketease.MVVM.Event.SelectPlace.SelectPlaceViewModel
import com.example.ticketease.MVVM.Event.SelectTime.SelectTime
import com.example.ticketease.MVVM.Event.SelectTime.SelectTimeViewModel
import com.example.ticketease.MVVM.Event.getEvents.ViewModelRepositoryGetEvents
import com.example.ticketease.MVVM.Event.getTime.ViewModelgetTimeRepository
import com.example.ticketease.R
import com.example.ticketease.getTime

@Composable
fun TimeSelector(navController: NavHostController) {

    val list = getTime()
    Box(
        modifier = Modifier
            .background(color = colorResource(R.color.white))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(modifier = Modifier.size(300.dp, 900.dp).verticalScroll(
            rememberScrollState()
        )
        )
        {
            for (l in list) {
                ListItemTime(
                    time = l.date.toString(),
                    navController
                )
            }
        }
    }

}
@Composable
fun ListItemTime(time:String, navController: NavHostController,  viewModel: SelectTimeViewModel = hiltViewModel()){
    val isButtonPressed = remember { mutableStateOf(false) }

    Box(contentAlignment = Alignment.Center) {
        Button(
            onClick = {
                isButtonPressed.value = !isButtonPressed.value
                viewModel.place(SelectTime.Time(time))
                navController.navigate("SuccessfulEvent")
            },
            modifier = Modifier.padding(top = 20.dp).height(50.dp).width(300.dp)
                .offset(y = 0.dp, x = 0.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isButtonPressed.value) colorResource(R.color.backgroud) else colorResource(
                    R.color.find
                )
            ),

            )
        {

            Column {
                Text(time, fontSize = 18.sp, color = Color.White)

            }
        }
    }
}