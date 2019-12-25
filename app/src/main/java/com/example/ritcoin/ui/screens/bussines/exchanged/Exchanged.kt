package com.example.ritcoin.ui.screens.exchanged

import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.themeTextStyle
import com.example.ritcoin.R
import com.example.ritcoin.ui.utility.Screen
import com.example.ritcoin.ui.utility.VectorImageButton
import com.example.ritcoin.ui.utility.navigateTo

fun Exchanged(){
    FlexColumn() {
        inflexible {
            TopAppBar(
                navigationIcon = { VectorImageButton(R.drawable.ic_baseline_arrow_back_24) {
                    navigateTo(Screen.HomePage) }
                },
                title = { Text(text = "Pagina de Tranferências", style = +themeTextStyle { subtitle2 }) }
            )
        }
        expanded(1f){
            Text(text = "Tranferir creditos")
        }
    }
}