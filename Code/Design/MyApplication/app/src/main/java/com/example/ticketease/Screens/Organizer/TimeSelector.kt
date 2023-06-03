package com.example.ticketease.Screens.Organizer

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
import androidx.navigation.NavHostController
import com.example.ticketease.R

@Composable
fun TimeSelector(navController: NavHostController) {

    val selectedTime = rememberSaveable { mutableStateOf(Time.NONE) }
    val isButtonPressedSeventeen = remember { mutableStateOf(false) }
    val isButtonPressedEighteen = remember { mutableStateOf(false) }
    val isButtonPressedNineteen = remember { mutableStateOf(false) }

    Box(


        modifier = Modifier
            .background(color = colorResource(R.color.white))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(modifier = Modifier.size(300.dp, 900.dp))
        {
            
            Box(contentAlignment = Alignment.Center) {
                Text("Время", fontSize = 35.sp, color = Color.Black)
                Button(
                    onClick = {
                        selectedTime.value = Time.SEVENTEEN
                        isButtonPressedSeventeen.value = !isButtonPressedSeventeen.value
                        //navController.navigate("SuccessfulEvent")
                    },
                    modifier = Modifier.padding(top = 140.dp).height(50.dp).width(300.dp)
                        .offset(y = 0.dp, x = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressedSeventeen.value) colorResource(R.color.backgroud) else colorResource(
                            R.color.find
                        )
                    ),

                    )
                {

                    Column {
                        Text("17:00", fontSize = 18.sp, color = Color.White)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        selectedTime.value = Time.EIGHTEEN
                        isButtonPressedNineteen.value = !isButtonPressedNineteen.value
                        //navController.navigate(NavigationItem.SuccessfulEvent.route)
                    },
                    modifier = Modifier.padding(top = 20.dp).height(50.dp).width(300.dp)
                        .offset(y = 0.dp, x = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressedNineteen.value) colorResource(R.color.backgroud) else colorResource(
                            R.color.find
                        )
                    ),

                    )
                {

                    Column {
                        Text("18:00", fontSize = 18.sp, color = Color.White)

                    }
                }
            }
            Box(contentAlignment = Alignment.Center) {
                Button(
                    onClick = {
                        selectedTime.value = Time.NINETEEN
                        isButtonPressedEighteen.value = !isButtonPressedEighteen.value
                        //navController.navigate(NavigationItem.SuccessfulEvent.route)
                    },
                    modifier = Modifier.padding(top = 20.dp).height(50.dp).width(300.dp)
                        .offset(y = 0.dp, x = 0.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isButtonPressedEighteen.value) colorResource(R.color.backgroud) else colorResource(
                            R.color.find
                        )
                    ),

                    )
                {

                    Column {
                        Text("19:00", fontSize = 18.sp, color = Color.White)

                    }
                }
            }



        }
    }

}
enum class Time {
    SEVENTEEN,
    EIGHTEEN,
    NINETEEN,
    NONE
}