package com.example.greenzone_customer.components.texts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.constants.UIKeys
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun NormalText(
    text: String = "Normal text",
    modifier: Modifier = Modifier,
    color: Color = GZColor.black,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        text = text,
        fontSize = UIKeys.TEXT_SIZE_DEFAULT.sp,
        color = color,
        modifier = modifier,
        fontWeight = fontWeight
    )
}