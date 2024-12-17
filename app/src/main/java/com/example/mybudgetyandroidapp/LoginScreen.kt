package com.example.mybudgetyandroidapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(onLoginSuccess: () -> Unit) {
    val logoPainter = painterResource(id = R.drawable.my_budgety_logo)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    )
    {
        Image(
            painter = logoPainter,
            contentDescription = "My Budgety Logo",
        )

        Text(text = "Welcome to My Budgety")
    }
}