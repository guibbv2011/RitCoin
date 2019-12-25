package com.example.ritcoin.ui.widgets

import android.R
import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.surface.Card
import androidx.ui.res.imageResource
import androidx.ui.res.vectorResource
import com.example.ritcoin.ui.utility.Screen
import com.example.ritcoin.ui.utility.VectorImage
import com.example.ritcoin.ui.utility.navigateTo

// BOTOES DE NEGOCIAÇOES TRANSAÇÕES COMPROVANTES E CREDITOS
var discricao: String = ""


@Composable
fun transactionButtons(discricao: String, tela: Screen, vetor: Int) {
    Padding(padding = 4.dp) {
        Column(
            mainAxisAlignment = MainAxisAlignment.Center,
            crossAxisAlignment = CrossAxisAlignment.Center
        ) {
            Card(
                shape = RoundedCornerShape(4.dp),
                color = Color.White,
                elevation = 2.dp
            ) {
                Container(height = 78.dp, width = 78.dp) {
                    FloatingActionButton(
                        children = { VectorImage(id = vetor) },
                        onClick = { navigateTo(destination = tela) }
                    )
                }
            }
            Text(text = discricao)
        }
    }
}
//========================================================]