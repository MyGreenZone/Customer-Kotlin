package com.example.greenzone_customer.enums

enum class DeliveryMethod(
    val label: String,
    val value: String,
    val shortLabel: String
) {
    PICK_UP(label = "Nhận tại cửa hàng", value = "pickup", shortLabel = "Mang đi"),
    DELIVERY(label = "Giao hàng tận nơi", value = "delivery", shortLabel = "Giao hàng");


    companion object{
        fun getShortLabelByValue(value: String): String{
            return DeliveryMethod.entries.find({it.value == value})?.shortLabel?: "Không xác định"
        }
    }
}