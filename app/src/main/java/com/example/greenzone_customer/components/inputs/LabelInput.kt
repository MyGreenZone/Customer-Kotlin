package com.example.greenzone_customer.components.inputs

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.constants.UIKeys
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun LabelInput(
    label: String,
    modifier: Modifier = Modifier,
    required: Boolean = false,
    textStyle: TextStyle = TextStyle(
        color = GZColor.black,
        fontSize = UIKeys.TEXT_SIZE_DEFAULT.sp
    )
) {
    Text(
        text = buildAnnotatedString {
            append(label)
            if (required) {
                withStyle(style = SpanStyle(color = GZColor.red900)) {
                    append(" *")
                }
            }
        },
        style = textStyle,
        modifier = modifier
    )
}
