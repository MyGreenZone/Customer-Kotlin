package com.example.greenzone_customer.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.greenzone_customer.R
import com.example.greenzone_customer.components.buttons.PrimaryButton
import com.example.greenzone_customer.components.inputs.NormalInput
import com.example.greenzone_customer.components.texts.TitleText
import com.example.greenzone_customer.navigations.graph_routes.AppRoutes
import com.example.greenzone_customer.ui.theme.GZColor


@Composable
fun LoginScreen(navController: NavHostController) {
    val config = LocalConfiguration.current
    val screenWidthDp = config.screenWidthDp.dp
    val imageWidth = (screenWidthDp.value / 1.5).dp
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .background(GZColor.white),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .size(imageWidth)
                .padding(bottom = 24.dp),
            painter = painterResource(R.drawable.logo_app),
            contentDescription = "Logo app"
        )
        TitleText(
            text = "Chào mừng bạn đến với",
            modifier = Modifier.padding(bottom = 24.dp)
        )
        Text(
            text = "GREEN ZONE",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = GZColor.primary,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        NormalInput(
            required = true,
            value = "0779188717",
            onValueChange = { value: String -> Unit },
            label = "Số điện thoại",
            modifier = Modifier.padding(bottom = 24.dp)
        )

        PrimaryButton(
            title = "Đăng nhập",
            onClick = {
                navController.navigate(AppRoutes.BOTTOM) {
                    popUpTo(AppRoutes.BOTTOM) { inclusive = true }
                }
            }
        )


    }
}