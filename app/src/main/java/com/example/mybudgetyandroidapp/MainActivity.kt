package com.example.mybudgetyandroidapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.MaterialTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            MaterialTheme {
                NavHost(navController = navController,
                    startDestination = "login",
                    builder = {
                        composable("login") {
                            LoginScreen {
                                navController.navigate("pet")
                            }
                        }
                        composable("pet") {
                            PetScreen()
                        }
                    }
                )
            }
        }
    }
}