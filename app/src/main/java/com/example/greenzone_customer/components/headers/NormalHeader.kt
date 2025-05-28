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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.ui.theme.GZColor
import com.example.greenzone_customer.R
import com.example.greenzone_customer.components.texts.TitleText
import com.example.greenzone_customer.constants.UIKeys

@Composable
fun NormalHeader(
    title: String,
    @DrawableRes leftIcon: Int = R.drawable.arrow_back_ios_new_24px,
    @DrawableRes rightIcon: Int = R.drawable.shopping_bag_24px,
    onLeftPress: () -> Unit = {},
    onRightPress: () -> Unit = {},
    enableRightIcon: Boolean = false,
    leftIconColor: Color = GZColor.black,
    rightIconColor: Color = GZColor.black
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(vertical = 24.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        content = {
            Icon(
                painter = painterResource(leftIcon),
                modifier = Modifier
                    .size(24.dp)
                    .clickable(onClick = onLeftPress),
                contentDescription = "Header left icon",
                tint = leftIconColor
            )

            TitleText(
                text = title,
                modifier = Modifier,
                textStyle = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = UIKeys.TEXT_SIZE_HEADER.sp
                )
            )

            if (enableRightIcon) {
                Icon(
                    painter = painterResource(rightIcon),
                    modifier = Modifier
                        .size(24.dp)
                        .clickable(onClick = onRightPress),
                    contentDescription = "Header right icon",
                    tint = rightIconColor
                )
            } else {
                Spacer(modifier = Modifier.size(24.dp))
            }
        }
    )
}