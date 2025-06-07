package com.example.greenzone_customer.utils

import android.app.Activity
import android.content.Context
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.example.greenzone_customer.ui.theme.GZColor


object StatusBar {
    fun changeStatusBarColor(context: Context, color: Color = GZColor.white) {
        val window = (context as? Activity)?.window
        window?.statusBarColor = color.toArgb()
    }
}
