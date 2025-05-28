package com.example.greenzone_customer.components.texts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.constants.UIKeys
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun TitleText(
    modifier: Modifier = Modifier,
    text: String = "Title text",
    textStyle: TextStyle = TextStyle()
) {
    val defaultStyle = TextStyle(
        color = GZColor.black,
        fontWeight = FontWeight.Normal,
        fontSize = UIKeys.TEXT_SIZE_TITLE.sp
    )

    Text(
        text = text,
        modifier = modifier,
        style = defaultStyle.merge(textStyle)
    )
}