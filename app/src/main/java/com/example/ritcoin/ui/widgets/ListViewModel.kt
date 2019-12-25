package com.example.ritcoin.ui.widgets

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.surface.Card
import androidx.ui.material.themeTextStyle
import androidx.ui.res.imageResource
import com.example.ritcoin.R

// MODELO DE LISTA LISTVIEW COM CARD > ROW > CONTAINER > COLUMN
val userImg = +imageResource(R.drawable.username)
@Composable
fun listViewModel(nameUser: String, userRit: Double) {
    Padding(padding = EdgeInsets(left = 6.dp, top = 4.dp, bottom = 4.dp, right = 6.dp)) {
        Card(shape = RoundedCornerShape(6.dp), color = Color.Transparent, elevation = 2.dp) {
            Row(
                mainAxisSize = LayoutSize.Expand,
                crossAxisAlignment = CrossAxisAlignment.Center
            ) {
                Padding(padding = 12.dp) {
                    Container(width = 58.dp, height = 58.dp) {
                        Clip(shape = CircleShape) {
                            DrawImage(image = userImg)
                        }
                    }
                }
                Column(mainAxisAlignment = MainAxisAlignment.Center,
                    crossAxisAlignment = CrossAxisAlignment.Start
                ) {
                    Text(text = nameUser, style = +themeTextStyle { subtitle1 })
                    Text(text = userRit.toString(),
                        style = +themeTextStyle { subtitle2.copy(color = Color.Gray) })
                }
            }
        }
    }
}
//========================================================