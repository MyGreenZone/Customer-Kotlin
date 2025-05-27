package com.example.greenzone_customer.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateFormatter {
    fun formatDate(date: Date): String{
        val dateFormatter = SimpleDateFormat("HH:mm - dd/MM/yyyy", Locale.getDefault())
        return dateFormatter.format(date)
    }
}