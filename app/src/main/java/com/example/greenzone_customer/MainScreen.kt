package com.example.greenzone_customer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.greenzone_customer.navigations.RootNavigator
import com.example.greenzone_customer.navigations.bottom_navs.BottomScreen
import com.example.greenzone_customer.navigations.bottom_navs.BottomTab
import com.example.greenzone_customer.navigations.graph_routes.BottomRoutes


@Composable
fun MainScreen(navController: NavHostController) {
    val currentBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry.value?.destination?.route
    val enableBottomBar = currentRoute in BottomRoutes.routes

    Scaffold(

        modifier = Modifier.fillMaxSize(),

        content = { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                RootNavigator(navController = navController)
            }

        },
        bottomBar = {
            if (enableBottomBar) {
                BottomTab(navController = navController, currentRoute = currentRoute)
            }
        },
    )
}