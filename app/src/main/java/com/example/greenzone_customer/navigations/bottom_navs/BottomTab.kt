package com.example.greenzone_customer.navigations.bottom_navs

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.greenzone_customer.ui.theme.GZColor

@Composable
fun BottomTab(navController: NavHostController, currentRoute: String?) {
    NavigationBar(
        containerColor = GZColor.white
    ) {
        BottomScreen.bottomScreens.forEach { item ->
            val selected = currentRoute == item.route
            NavigationBarItem(
                label = { Text(text = item.label) },
                selected = selected,
                onClick = {
                    if (!selected) {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(id = if (selected) item.selectedIcon else item.unselectedIcon),
                        contentDescription = item.label
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = GZColor.primary,
                    selectedTextColor = GZColor.primary,
                    unselectedIconColor = GZColor.gray700,
                    unselectedTextColor = GZColor.gray700,
                    indicatorColor = GZColor.transparent
                )
            )
        }
    }
}