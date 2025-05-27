package com.example.greenzone_customer.utils

import java.text.NumberFormat
import java.util.Locale

object TextFormatter {
    fun formatCurrency(amount: Number?): String{
        if (amount == null) return "Co cai nit"
        val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
        return formatter.format(amount).replace("\\s?₫".toRegex(), "₫")
    }

    fun formatQuantity(quantity: Int): String{
        return if (quantity == 0) "0" else quantity.toString().padStart(2, '0')
    }

    fun formatQuantityProduct(quantity: Int): String{
        return if(quantity > 1) "${quantity} products" else "${quantity} products"
    }
}

