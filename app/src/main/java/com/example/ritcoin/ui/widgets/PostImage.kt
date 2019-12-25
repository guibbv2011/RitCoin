package com.example.ritcoin.ui.widgets

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.layout.Container
import androidx.ui.res.imageResource
import com.example.ritcoin.R

@Composable
fun postImage(){
    val image = +imageResource(R.drawable.anuncioimg)

    Container(width = 40.dp, height = 40.dp) {
        DrawImage(image = image)
    }
}