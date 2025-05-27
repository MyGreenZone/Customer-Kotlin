package com.example.greenzone_customer.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greenzone_customer.R
import com.example.greenzone_customer.ui.theme.GZColor

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SplashScreen() {
    val configuration = LocalConfiguration.current
    val screenWidthDp = configuration.screenWidthDp.dp
    val imageWidth = (screenWidthDp.value / 1.5).dp
    Box(
        modifier = Modifier.fillMaxSize().background(GZColor.white),
        contentAlignment = Alignment.Center,
        content = {
            Image(
                painter = painterResource(R.drawable.logo_app),
                contentDescription = "Logo app",
                modifier = Modifier.size(imageWidth),
                contentScale = ContentScale.FillBounds
            )
        }
    )


}