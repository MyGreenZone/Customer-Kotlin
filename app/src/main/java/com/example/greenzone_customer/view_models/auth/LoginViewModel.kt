package com.example.greenzone_customer.view_models.auth

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val phoneNumber: MutableState<String> = mutableStateOf("0779188717")
    val phoneValid: MutableState<Boolean> = mutableStateOf(true)

    fun validate(): Boolean {
        val regex = Regex("^(03|05|07|08|09)[0-9]{8}$")
        if (regex.matches(phoneNumber.value)) {
            phoneValid.value = true
            return true
        }
        phoneValid.value = false
        return false
    }

}