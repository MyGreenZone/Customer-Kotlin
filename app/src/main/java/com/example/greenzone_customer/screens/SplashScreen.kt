package com.example.greenzone_customer.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.greenzone_customer.R
import com.example.greenzone_customer.navigations.graph_routes.AuthRoutes
import com.example.greenzone_customer.ui.theme.GZColor
import com.example.greenzone_customer.utils.StatusBar
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate(route = AuthRoutes.LoginScreen){
            popUpTo(AuthRoutes.LoginScreen){inclusive = true}
        }
    }
    val configuration = LocalConfiguration.current
    val screenWidthDp = configuration.screenWidthDp.dp
    val imageWidth = (screenWidthDp.value / 1.5).dp
    val context = LocalContext.current

    StatusBar.changeStatusBarColor(context, GZColor.white)

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