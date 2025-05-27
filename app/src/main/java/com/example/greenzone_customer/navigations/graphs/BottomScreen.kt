package com.example.greenzone_customer.navigations.graphs

import androidx.annotation.DrawableRes
import com.example.greenzone_customer.R

sealed class BottomNavItem(
    val route: String,
    val label: String,
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int
) {
    object Home : BottomNavItem("home", "Trang chủ", R.drawable.home_filled_24px, R.drawable.home_outlined_24px)
    object Order : BottomNavItem("order", "Đặt hàng", R.drawable.fastfood__filled_24px, R.drawable.fastfood_outlined_24px)
    object Merchant : BottomNavItem("merchant", "Cửa hàng", R.drawable.store_filled_24px, R.drawable.store_outlined_24px)
    object Voucher : BottomNavItem("voucher", "Ưu đãi", R.drawable.redeem_filled_24px, R.drawable.redeem_outlined_24px)
    object Profile : BottomNavItem("profile", "Cá nhân", R.drawable.account_circle_filled_24px, R.drawable.account_circle_outlined_24px)
}


