package com.example.greenzone_customer.navigations.bottom_navs

import androidx.annotation.DrawableRes
import com.example.greenzone_customer.R
import com.example.greenzone_customer.navigations.graph_routes.BottomRoutes

sealed class BottomScreen(
    val route: String,
    val label: String,
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int
) {
    object Home : BottomScreen(BottomRoutes.HomeScreen, "Trang chủ", R.drawable.home_filled_24px, R.drawable.home_outlined_24px)
    object Order : BottomScreen(BottomRoutes.OrderScreen, "Đặt hàng", R.drawable.fastfood__filled_24px, R.drawable.fastfood_outlined_24px)
    object Merchant : BottomScreen(BottomRoutes.MerchantScreen, "Cửa hàng", R.drawable.store_filled_24px, R.drawable.store_outlined_24px)
    object Voucher : BottomScreen(BottomRoutes.VoucherScreen, "Ưu đãi", R.drawable.redeem_filled_24px, R.drawable.redeem_outlined_24px)
    object Profile : BottomScreen(BottomRoutes.ProfileScreen, "Cá nhân", R.drawable.account_circle_filled_24px, R.drawable.account_circle_outlined_24px)

    companion object{
        val bottomScreens = listOf<BottomScreen>(
            Home, Order, Merchant, Voucher, Profile
        )
    }
}