package com.example.greenzone_customer.enums

enum class PaymentMethod(
    val label: String,
    val value: String
) {
    ONLINE(label = "online", value ="online"),
    COD(label = "cod", value = "cod")
}