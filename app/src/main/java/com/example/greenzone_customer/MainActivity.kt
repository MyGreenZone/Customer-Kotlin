package com.example.greenzone_customer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.greenzone_customer.screens.bottom_navs.HomeScreen
import com.example.greenzone_customer.ui.theme.GreenZoneCustomerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreenZoneCustomerTheme { val navController = rememberNavController()
               MainScreen(navController =  navController)
            }
        }
    }
}

