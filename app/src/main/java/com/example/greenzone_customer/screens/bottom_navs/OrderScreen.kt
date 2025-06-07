package com.example.greenzone_customer.screens.bottom_navs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.greenzone_customer.components.headers.HeaderOrder
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun OrderScreen() {
    Column(
        modifier = Modifier.fillMaxSize().background(GZColor.white),
        verticalArrangement = Arrangement.Center
    ) {
        HeaderOrder(title = "Danh mục") { }
    }
}