package com.example.greenzone_customer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.greenzone_customer.screens.SplashScreen


@Composable
fun MainScreen(navController: NavHostController){
    val currentBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry.value?.destination?.route
    val bottomBarRoutes = listOf<String>("home")
    val enableBottomBar = currentRoute in bottomBarRoutes

    Scaffold (
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            if(enableBottomBar) {
                BottomAppBar() { }
            }
        }
    ){ innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "splash",
            modifier = Modifier.padding(innerPadding)
        ){
            composable("splash"){ SplashScreen() }
        }

    }
}