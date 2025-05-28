package com.example.greenzone_customer.components.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.constants.UIKeys
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun PrimaryButton(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier.height(48.dp),
    textStyle: TextStyle = TextStyle(
        color = GZColor.white,
        fontSize = UIKeys.TEXT_SIZE_DEFAULT.sp,
        fontWeight = FontWeight.Bold
    ),
    enabled: Boolean = true,
    containerColor: Color = GZColor.primary
) {
    Button(
        enabled = enabled,
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(UIKeys.BORDER_RADIUS_DEFAULT.dp),
        colors = ButtonDefaults.buttonColors(containerColor = containerColor)
    ) {
        Text(text = title, style = textStyle)
    }
}