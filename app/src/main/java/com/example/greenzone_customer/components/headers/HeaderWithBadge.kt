package com.example.greenzone_customer.components.headers

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.R
import com.example.greenzone_customer.components.texts.TitleText
import com.example.greenzone_customer.constants.UIKeys

@Composable
fun HeaderWithBadge(
    title: String,
    @DrawableRes leftIcon: Int = R.drawable.arrow_back_ios_new_24px,
    enableLeftIcon: Boolean = false,
    onLeftPress: () -> Unit = {},
    enableBadge: Boolean = true
){
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(vertical = 24.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        content = {
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ){
                if (enableLeftIcon){
                    Icon(
                        painter = painterResource(leftIcon),
                        modifier = Modifier
                            .size(24.dp)
                            .clickable(onClick = onLeftPress),
                        contentDescription = "Header left icon"
                    )
                }

                TitleText(
                    text = title,
                    modifier = Modifier,
                    textStyle = TextStyle(
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp
                    )
                )
            }


            if (enableBadge) {
               IconWithBadge(quantity = 88, onClick = {})
            } else {
                Spacer(modifier = Modifier.size(24.dp))
            }
        }
    )
}