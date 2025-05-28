package com.example.greenzone_customer.screens.bottom_navs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.greenzone_customer.components.buttons.PrimaryButton
import com.example.greenzone_customer.components.headers.IconWithBadge
import com.example.greenzone_customer.components.headers.NormalHeader
import com.example.greenzone_customer.navigations.graph_routes.AuthRoutes
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun ProfileScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().background(GZColor.white)

    ) {
        NormalHeader(title = "Cá nhân")
        IconWithBadge()
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