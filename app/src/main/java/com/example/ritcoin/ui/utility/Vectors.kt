package com.example.ritcoin.ui.utility

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.WithDensity
import androidx.ui.foundation.Clickable
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.DrawVector
import androidx.ui.layout.Container
import androidx.ui.material.ripple.Ripple
import androidx.ui.res.vectorResource
import java.util.*

@Composable
fun VectorImageButton(@DrawableRes id: Int, onClick: () -> Unit){
    Ripple(bounded = false) {
        Clickable(onClick = onClick) {
            VectorImage(id)
        }
    }
}

@Composable
fun VectorImage(@DrawableRes id: Int, tint: Color = Color.Transparent){
    val vector = +vectorResource(id)
    WithDensity {
        Container(
            width = vector.defaultWidth.toDp(),
            height = vector.defaultHeight.toDp()) {
            DrawVector(vectorImage = vector, tintColor = tint)
        }
    }
}