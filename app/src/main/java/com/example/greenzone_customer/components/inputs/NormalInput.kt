package com.example.greenzone_customer.components.inputs

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.constants.UIKeys
import com.example.greenzone_customer.ui.theme.GZColor


@Composable
fun NormalInput(
    required: Boolean = true,
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    isValid: Boolean = false,
    inValidMessage: String = "Trường này không được để trống",
    modifier: Modifier = Modifier.padding(horizontal = 16.dp)
) {
    Column(
        modifier = modifier
    ) {
        LabelInput(
            label = label,
            required = required,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        TextField(
            value = value,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp)
                .border(
                    width = 1.dp,
                    color = GZColor.borderInput,
                    shape = RoundedCornerShape(12.dp)
                ),
            onValueChange = onValueChange,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                focusedLabelColor = Color.Transparent,
                unfocusedLabelColor = Color.Transparent
            ),
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType)

        )
        if (!isValid) {
            InvalidSuggestion(message = inValidMessage)
        }
    }

}

@Composable
fun InvalidSuggestion(message: String = "Please enter this field") {
    Text(text = message, color = GZColor.invalid, fontSize = UIKeys.TEXT_SIZE_DEFAULT.sp)
}

