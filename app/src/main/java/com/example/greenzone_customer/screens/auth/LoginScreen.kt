package com.example.greenzone_customer.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.ui.theme.GZColor
import com.example.greenzone_customer.R
import com.example.greenzone_customer.components.inputs.NormalInput
import com.example.greenzone_customer.constants.UIKeys

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreen() {
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
        Text(
            text = "Chào mừng bạn đến với",
            fontSize = UIKeys.TEXT_SIZE_TITLE.sp,
            color = GZColor.black,
            modifier = Modifier.padding(bottom = 24.dp)
        )
        Text(
            text = "GREENZONE",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            color = GZColor.primary,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        NormalInput(
            value = "0779188717",
            onValueChange = { value: String -> Unit },
            label = "Số điện thoại",
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = GZColor.primary)
        ) {
            Text(text = "Đăng nhập", color = GZColor.white)
        }


    }
}