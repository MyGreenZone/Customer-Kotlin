package com.example.greenzone_customer.components.headers

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.R
import com.example.greenzone_customer.compose_icons.Bell
import com.example.greenzone_customer.constants.UIKeys
import com.example.greenzone_customer.ui.theme.GZColor


@Composable
fun IconWithBadge(
    quantity: Int = 99,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = Modifier
            .background(color = GZColor.white, shape = RoundedCornerShape(24.dp))
            .clickable(onClick = onClick),
        content = {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .shadow(elevation = 1.dp, shape = RoundedCornerShape(24.dp), ambientColor = GZColor.gray300,
                        clip = true, spotColor = GZColor.fbBg)
                    .border(
                        width = 1.dp,
                        color = GZColor.gray200,
                        shape = RoundedCornerShape(24.dp)),

                contentAlignment = Alignment.Center,
                content = {
                    Icon(
                        imageVector = Bell,
                        contentDescription = "icon bell",
                        tint = GZColor.primary,
                        modifier = Modifier.size(28.dp)
                    )
                }
            )

            if (quantity < UIKeys.MAX_QUANTITY &&
                quantity > UIKeys.MIN_QUANTITY
            ) {
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .absoluteOffset(x = 22.dp, y = -6.dp)
                        .background(color = GZColor.red800, shape = RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center,
                    content = {
                        Text(
                            text = quantity.toString(),
                            style = TextStyle(
                                color = GZColor.white,
                                fontSize = UIKeys.TEXT_SIZE_SMALL.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                )
            }
        }
    )
}