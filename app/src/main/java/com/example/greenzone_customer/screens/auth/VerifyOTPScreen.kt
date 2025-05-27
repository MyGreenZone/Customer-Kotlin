package com.example.greenzone_customer.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun VerifyOTPScreen() {
    Box(
        modifier = Modifier.fillMaxSize().background(GZColor.white),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "VerifyOTPScreen", fontSize = 20.sp, color = GZColor.black)
    }
}