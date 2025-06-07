package com.example.greenzone_customer.screens.auth


import OTPInput
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.greenzone_customer.components.containers.GZColumn

import com.example.greenzone_customer.ui.theme.GZColor
import com.magneto.magotplib.Screen.OtpComposableOutlined

@Composable
fun VerifyOTPScreen(navController: NavHostController) {
    GZColumn(
        modifier = Modifier.fillMaxSize().background(GZColor.white),

    ) {
        Text(text = "VerifyOTPScreen", fontSize = 20.sp, color = GZColor.black)
        OTPInput {  }

    }
}