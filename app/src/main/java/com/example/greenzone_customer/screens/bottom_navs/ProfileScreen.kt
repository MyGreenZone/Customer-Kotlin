package com.example.greenzone_customer.screens.bottom_navs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.greenzone_customer.components.buttons.PrimaryButton
import com.example.greenzone_customer.components.headers.HeaderWithBadge
import com.example.greenzone_customer.navigations.graph_routes.AuthRoutes
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun ProfileScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().background(GZColor.white)

    ) {
        HeaderWithBadge(title = "Cá nhân")
        PrimaryButton(
            modifier = Modifier.padding(top = 50.dp),
            title = "Log out",
            onClick = {
            navController.navigate(AuthRoutes.LoginScreen){
                popUpTo(AuthRoutes.LoginScreen){inclusive = true}
            }
        })
    }
}