package com.example.greenzone_customer.components.headers

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greenzone_customer.components.containers.GZRow
import com.example.greenzone_customer.components.texts.TitleText
import com.example.greenzone_customer.constants.UIKeys
import com.example.greenzone_customer.ui.theme.GZColor
import io.eyram.iconsax.IconSax

@Composable
fun HeaderOrder(
    title: String,
    onCategoryClick: () -> Unit = {},
    onFavoriteClick: () -> Unit = {},
    onSearchClick: () -> Unit = {}
) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(1f).padding(vertical = 12.dp, horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            GZRow(
                modifier = Modifier.clickable(onClick = onCategoryClick)
            ) {
                Icon(
                    painter = painterResource(IconSax.Bulk.Category2),
                    contentDescription = "Icon category",
                    tint = GZColor.primary,
                    modifier = Modifier.size(28.dp)
                )

                TitleText(
                    text = "Danh mục", textStyle = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = UIKeys.TEXT_SIZE_HEADER.sp
                    )
                )
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowDown,
                    contentDescription = "icon search",
                    tint = GZColor.primary
                )

            }

            GZRow {
                Icon(
                    painter = painterResource(IconSax.Outline.SearchNormal1),
                    contentDescription = "Icon category",
                    tint = GZColor.primary,
                    modifier = Modifier.size(28.dp).clickable(onClick = onSearchClick)
                )

                Icon(
                    painter = painterResource(IconSax.Outline.Heart),
                    contentDescription = "Icon category",
                    tint = GZColor.primary,
                    modifier = Modifier.size(28.dp).clickable(onClick = onFavoriteClick)
                )



            }


        }

        HorizontalDivider(thickness = 1.dp, color = GZColor.borderInput)
    }

}