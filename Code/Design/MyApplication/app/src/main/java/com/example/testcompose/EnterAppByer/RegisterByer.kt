package com.example.testcompose

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.testcompose.MVVM.postDataRegisterUser

@Composable
fun RegisterByer(navController: NavHostController) {

    Box(modifier = Modifier
        .background(color = colorResource(R.color.white))
        .fillMaxSize()
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.verticalScroll(
            rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .background(color = colorResource(R.color.backgroud))
                    .fillMaxWidth()
                    .height(150.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(  modifier = Modifier.padding(50.dp)) {
                    Text("Регистрация", fontSize = 35.sp, color = Color.White)

                }
            }
            Column(modifier = Modifier.size(500.dp, 600.dp),horizontalAlignment = Alignment.CenterHorizontally)
            {
                EnterRegisterFun()
                Box() {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painterResource(id = R.drawable._jltfum4_sx1na_transformed),
                            contentDescription = "image",
                            modifier = Modifier.size(60.dp, 60.dp),
                            contentScale = ContentScale.Crop
                        )

                    }
                }
            }

        }
    }
}

@Composable
private fun EnterRegisterFun(){

    var name= remember {
        mutableStateOf(TextFieldValue())
    }
    var surname= remember {
        mutableStateOf(TextFieldValue())
    }
    var login= remember {
        mutableStateOf(TextFieldValue())
    }
    var email= remember {
        mutableStateOf(TextFieldValue())
    }
    var phone= remember {
        mutableStateOf(TextFieldValue())
    }
    var password= remember {
        mutableStateOf(TextFieldValue())
    }
    var repeadPassword= remember {
        mutableStateOf(TextFieldValue())
    }
    TextField(
        value = name.value,
        onValueChange = { name.value = it },
        placeholder = { Text(text = "Имя") },
        modifier = Modifier
            .padding(5.dp)
           ,

    )
    TextField(
        value = surname.value,
        onValueChange = { surname.value = it },
        placeholder = { Text(text = "Фамилия") },
        modifier = Modifier
            .padding(5.dp)
        ,
    )
    TextField(
        value = login.value,
        onValueChange = { login.value = it },
        placeholder = { Text(text = "Логин") },
        modifier = Modifier
            .padding(5.dp)
        ,

        )
    TextField(
        value = email.value,
        onValueChange = { email.value = it },
        placeholder = { Text(text = "email") },
        modifier = Modifier
            .padding(5.dp)
        ,
    )

    TextField(
        value = phone.value,
        onValueChange = { phone.value = it },
        placeholder = { Text(text = "Номер телефона") },
        modifier = Modifier
            .padding(5.dp)
        ,

        )
    TextField(
        value = password.value,
        onValueChange = { password.value = it },
        placeholder = { Text(text = "Пароль") },
        modifier = Modifier
            .padding(5.dp)
        ,
    )

    TextField(
        value = repeadPassword.value,
        onValueChange = { repeadPassword.value = it },
        placeholder = { Text(text = "Подтверждение пароля") },
        modifier = Modifier
            .padding(5.dp)
        ,
    )

    Button(
        onClick = {
            postDataRegisterUser(
                 name,
            surname,
            login,
            email,
            phone,
            password,
            )
        },
        modifier = Modifier
            .padding(top = 10.dp)
            .height(50.dp)
            .width(300.dp),
        border = BorderStroke(3.dp, colorResource(R.color.backgroud)),
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.backgroud)),

        ) {
        Text(text = "Регистрация", modifier = Modifier.padding(8.dp))
    }

}


