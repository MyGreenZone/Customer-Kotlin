package com.example.greenzone_customer.enums

enum class OnlineMethod(
    val label: String,
    val value: String
) {
    PAYOS(label = "PayOS", value = "payos"),
    CARD(label = "Card", value = "card")
}