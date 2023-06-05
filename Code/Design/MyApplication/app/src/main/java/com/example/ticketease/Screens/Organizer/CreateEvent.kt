package com.example.ticketease.Screens.Organizer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.ticketease.MVVM.Event.EnterParam.EnterParamStateTextFields
import com.example.ticketease.MVVM.Event.EnterParam.ViewModelEnterParam
import com.example.ticketease.MVVM.Event.create.ViewModelCreateRepository
import com.example.ticketease.R

@Composable
fun CreateEvent(navController: NavHostController, viewModel: ViewModelEnterParam = hiltViewModel(),viewModel2: ViewModelCreateRepository = hiltViewModel() ) {
    val state = viewModel.state
    val context = LocalContext.current
    val statePlace=viewModel.statePlace
    val stateDate=viewModel.stateDate

    Box(modifier = Modifier
        .background(color = colorResource(R.color.white))
        .fillMaxSize()
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .background(color = colorResource(R.color.white))
                    .fillMaxWidth()
                    .height(150.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(  modifier = Modifier.padding(30.dp)) {
                    Text("Создать мероприятие", fontSize = 28.sp, color = Color.Black)

                }
            }
            Column(modifier = Modifier.size(800.dp, 1200.dp).offset(0.dp, -50.dp),horizontalAlignment = Alignment.CenterHorizontally)
            {
                TextField(
                    value = state.name,
                    onValueChange = { viewModel.enter(EnterParamStateTextFields.Name(it)) },
                    placeholder = { Text(text = "Название мероприятия") },
                    modifier = Modifier
                        .padding(5.dp),
                )

                TextField(
                    value = statePlace.value,
                    onValueChange = { viewModel.enter(EnterParamStateTextFields.Cost(it)) },
                    placeholder = { Text(text = "Стоимость мерпориятия") },
                    modifier = Modifier
                        .padding(5.dp),
                )
                TextField(
                    value = stateDate.value,
                    onValueChange = { viewModel.enter(EnterParamStateTextFields.Date(it)) },
                    placeholder = { Text(text = "Дата дд.мм.гг") },
                    modifier = Modifier
                        .padding(5.dp),
                )
                TextField(
                    value = state.type.toString(),
                    onValueChange = { viewModel.enter(EnterParamStateTextFields.Type(it)) },
                    placeholder = { Text(text = "Тип мероприятия") },
                    modifier = Modifier
                        .padding(5.dp),
                )
                TextField(
                    value = state.genre.toString(),
                    onValueChange = { viewModel.enter(EnterParamStateTextFields.Genre(it)) },
                    placeholder = { Text(text = "Жанр мероприятия") },
                    modifier = Modifier
                        .padding(5.dp),
                )
                TextField(
                    value = state.nameGroup.toString(),
                    onValueChange = { viewModel.enter(EnterParamStateTextFields.NameGroup(it)) },
                    placeholder = { Text(text = "Название коллектива") },
                    modifier = Modifier
                        .padding(5.dp),
                )
                TextField(
                    value = state.description.toString(),
                    onValueChange = { viewModel.enter(EnterParamStateTextFields.Description(it)) },
                    placeholder = { Text(text = "Описание") },
                    modifier = Modifier
                        .padding(5.dp).height(130.dp),
                )

                Box() {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Button(
                            onClick = {
                                /*
                                if (checkSymbols(state.name) and checkSymbols(state.genre!!) and checkSymbols(
                                        state.type!!
                                    ) and checkSymbols(
                                        state.description!!
                                    ) and stateDate.value.contains("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})\$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))\$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})\$".toRegex())
                                ) {

                                    viewModel.enter(EnterParamStateTextFields.Enter)
                                    navController.navigate("PlaceSelector")
                                }else{
                                    Toast.makeText(context,"Error", Toast.LENGTH_LONG).show()

                                }

                                 */
                                viewModel2.putPrice(statePlace.value)
                                viewModel.enter(EnterParamStateTextFields.Enter)
                                navController.navigate("PlaceSelector")
                            },
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .height(50.dp)
                                .width(300.dp),
                            shape = RoundedCornerShape(50),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = colorResource(
                                    R.color.backgroud
                                )
                            ),

                            )
                        {

                            Column {
                                Text("Создать", fontSize = 25.sp, color = Color.White)

                            }
                        }


                    }

                }
            }

        }
    }
}
