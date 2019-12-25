package com.example.ritcoin.ui.screens.payment

import android.widget.Scroller
import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.shape.border.Border
import androidx.ui.foundation.shape.border.DrawBorder
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.Container
import androidx.ui.layout.FlexColumn
import androidx.ui.layout.FlexRow
import androidx.ui.layout.Padding
import androidx.ui.material.Tab
import androidx.ui.material.TabRow
import androidx.ui.material.TopAppBar
import androidx.ui.material.themeTextStyle
import com.example.ritcoin.R
import com.example.ritcoin.ui.utility.Screen
import com.example.ritcoin.ui.utility.VectorImageButton
import com.example.ritcoin.ui.utility.navigateTo

@Composable
fun Payments() {
    FlexColumn() {
        inflexible {
            TopAppBar(
                navigationIcon = { VectorImageButton(R.drawable.ic_baseline_arrow_back_24) {
                        navigateTo(Screen.HomePage) }
                },
                title = { Text(text = "Pagina de pagamentos", style = +themeTextStyle { subtitle2 }) }
            )
        }
        expanded(1f){
            IconTabs()
        }
    }
}
@Composable
fun IconTabs(){
    val state = +state { 0 }
    val titles = listOf("Comprar","Vender")
    val indicatorContainer = @Composable{tabPositions: List<TabRow.TabPosition> ->
        TabRow.IndicatorContainer(tabPositions = tabPositions, selectedIndex = state.value){
            FancyIndicator(color = Color.White)
        }
    }
    FlexRow(){
        flexible(1f) {
            TabRow(items = titles, selectedIndex = state.value, indicatorContainer = indicatorContainer ){ index, text ->
                Tab(text = text, onSelected = { state.value = index },selected = state.value == index)
            }
        }
    }
    when(state.value){
        0 -> Comprar()
        1 -> Vender()
    }
}

@Composable
fun FancyIndicator(color: Color) {
    // Draws a rounded rectangular with border around the Tab, with a 5.dp padding from the edges
    // Color is passed in as a parameter [color]
    Padding(5.dp) {
        Container(expanded = true) {
            DrawBorder(RoundedCornerShape(5.dp),Border(color, 2.dp))
        }
    }
}
