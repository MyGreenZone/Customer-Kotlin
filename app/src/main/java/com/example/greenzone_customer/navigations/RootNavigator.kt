package com.example.greenzone_customer.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.greenzone_customer.navigations.graph_routes.BottomRoutes
import com.example.greenzone_customer.navigations.graph_routes.GraphRoutes
import com.example.greenzone_customer.screens.SplashScreen
import com.example.greenzone_customer.screens.bottom_navs.HomeScreen
import com.example.greenzone_customer.screens.bottom_navs.MerchantScreen
import com.example.greenzone_customer.screens.bottom_navs.OrderScreen
import com.example.greenzone_customer.screens.bottom_navs.ProfileScreen
import com.example.greenzone_customer.screens.bottom_navs.VoucherScreen

@Composable
fun RootNavigator(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        route = GraphRoutes.ROOT,
        startDestination = GraphRoutes.SplashScreen,
        builder = {
            composable(route = GraphRoutes.SplashScreen){ SplashScreen(navController = navController) }

            navigation(
                route = GraphRoutes.BOTTOM,
                startDestination = BottomRoutes.HomeScreen
            ) {
                composable(route = BottomRoutes.HomeScreen) { HomeScreen() }
                composable(route = BottomRoutes.OrderScreen) { OrderScreen() }
                composable(route = BottomRoutes.MerchantScreen) { MerchantScreen() }
                composable(route = BottomRoutes.VoucherScreen) { VoucherScreen() }
                composable(route = BottomRoutes.ProfileScreen) { ProfileScreen() }

            }
        }
    )
}