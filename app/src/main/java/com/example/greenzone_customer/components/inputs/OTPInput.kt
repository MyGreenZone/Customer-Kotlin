import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.*
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun OTPInput(
    otpLength: Int = 6,
    onOtpComplete: (String) -> Unit
) {
    val focusRequesters = remember { List(otpLength) { FocusRequester() } }
    val focusManager = LocalFocusManager.current
    val otpValues = remember { List(otpLength) { mutableStateOf("") } }

    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        otpValues.forEachIndexed { index, state ->
            OutlinedTextField(
                value = state.value,
                onValueChange = { value ->
                    if (value.length <= 1 && value.all { it.isDigit() }) {
                        state.value = value

                        if (value.isNotEmpty() && index < otpLength - 1) {
                            focusRequesters[index + 1].requestFocus()
                        }

                        if (otpValues.all { it.value.isNotEmpty() }) {
                            onOtpComplete(otpValues.joinToString("") { it.value })
                        }
                    }
                },
                modifier = Modifier
                    .width(48.dp)
                    .height(56.dp)
                    .focusRequester(focusRequesters[index])
                    .onKeyEvent { event ->
                        if (event.type == KeyEventType.KeyDown && event.key == Key.Backspace) {
                            if (otpValues[index].value.isEmpty()) {
                                if (index > 0) {
                                    otpValues[index - 1].value = ""
                                    focusRequesters[index - 1].requestFocus()
                                }
                            }
                            true // Chặn sự kiện để xử lý
                        } else {
                            false
                        }
                    }
                    .border(
                        width = 1.dp,
                        color = GZColor.gray300,
                        shape = RoundedCornerShape(16.dp)
                    ),
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    focusedLabelColor = Color.Transparent,
                    unfocusedLabelColor = Color.Transparent
                ),
                shape = RoundedCornerShape(16.dp),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            )
        }
    }

    LaunchedEffect(Unit) {
        focusRequesters.first().requestFocus()
    }
}

