package com.example.greenzone_customer.enums

enum class OrderStatus(
    val label: String,
    val value: String
) {
    AWAITING_PAYMENT(label = "Chờ thanh toán", value = "awaitingPayment"),
    PENDING_CONFIRMATION(label = "Chờ xác nhận", value = "pendingConfirmation"),
    PROCESSING(label = "Đang chuẩn bị", value = "processing"),
    READY_FOR_PICKUP(label = "Chờ lấy hàng", value = "readyForPickup"),
    SHIPPING_ORDER(label = "Đang giao hàng", value = "shippingOrder"),
    COMPLETED(label = "Hoàn thành", value = "completed"),
    CANCELLED(label = "Đã hủy", value = "cancelled");

    companion object {
        fun getValues(): List<String> {
            return OrderStatus.entries.map { it -> it.value }
        }

        fun getLabels(): List<String> {
            return OrderStatus.entries.map { it -> it.label }
        }

        fun getLabelByValue(value: String): String {
            return OrderStatus.entries.find { it.value == value }?.value ?: "Không xác định"
        }

        fun getMessageInfoByStatus(status: OrderStatus): MessageInfo {
            return when (status) {
                AWAITING_PAYMENT -> MessageInfo(type = "sucess", icon = "warning")
                PENDING_CONFIRMATION -> MessageInfo(type = "success", icon = "success")

                PROCESSING,
                SHIPPING_ORDER -> MessageInfo(type = "info", icon = "info")

                READY_FOR_PICKUP,
                COMPLETED -> MessageInfo(type = "success", icon = "success")

                CANCELLED -> MessageInfo(type = "danger", icon = "danger")
            }
        }
    }
}

data class MessageInfo(val type: String, val icon: String)