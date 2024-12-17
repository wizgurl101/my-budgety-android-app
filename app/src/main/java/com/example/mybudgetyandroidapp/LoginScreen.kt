package com.example.mybudgetyandroidapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(onLoginSuccess: () -> Unit) {
    val logoPainter = painterResource(id = R.drawable.my_budgety_logo)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = logoPainter,
            contentDescription = "My Budgety Logo",
            modifier = Modifier.size(200.dp)
        )

        Text(text = "My Budgety")

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = "",
            onValueChange = { /*TODO*/ },
            label = {Text(text = "Email")})

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = "",
            onValueChange = { /*TODO*/ },
            label = {Text(text = "Password")})

        Spacer(modifier = Modifier.height(6.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
    }

}