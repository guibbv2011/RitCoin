package com.example.ritcoin.ui.widgets

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.surface.Card
import androidx.ui.material.themeTextStyle
import androidx.ui.res.imageResource
import com.example.ritcoin.R

// MODELO PARA ANUNCIO NO APP COM CARD > TEXT
val image = +imageResource(R.drawable.anuncioimg)
@Composable
fun anuncioList(anuncio: String) {
    Padding(padding = 2.dp) {
        Column(
            mainAxisAlignment = MainAxisAlignment.Center,
            crossAxisAlignment = CrossAxisAlignment.Center
        ) {
            Card(shape = RoundedCornerShape(4.dp), color = Color.Transparent) {
                Container(height = 124.dp, width = 104.dp) {
                    DrawImage(image = image)
                }
            }
            Text(text = anuncio, style = +themeTextStyle { subtitle2.copy(color = Color.Gray) })
        }
    }
}
//========================================================