package com.example.ritcoin.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.DrawVector
import androidx.ui.layout.*
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.TopAppBar
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.surface.Card
import androidx.ui.res.vectorResource
import com.example.ritcoin.R
import com.example.ritcoin.ui.utility.Screen
import com.example.ritcoin.ui.widgets.anuncioList
import com.example.ritcoin.ui.widgets.listViewModel
import com.example.ritcoin.ui.widgets.transactionButtons

// SCREEN ================================
@Composable
fun HomePage() {
    FlexColumn(){
        inflexible {
            appBar()
        }
        expanded(1f) {
            Column(mainAxisSize = LayoutSize.Expand) {
                userBody()
                horizontalListAnuncio()
                bussinesButtons()
                verticalList()
            }
        }
        inflexible {
            bottomBar {}
        }
    }
} // SCREEN ================================

// FUNCTIONS ================================
@Composable
fun appBar() {
    Center {
        TopAppBar(color = Color.White, title = { Text(text = "RitCoin") })
    }
}

@Composable
fun userBody() {
    // PERFIL E DADOS DO USUARIO
    listViewModel("Guilherme", 1000.00)
}

@Composable
fun horizontalListAnuncio() {
    // HORIZONTAL SCROLLES PARA ANUNCIOLIST
    Padding(padding = EdgeInsets(all = 6.dp)) {
        Card(color = Color.White, shape = RoundedCornerShape(4.dp)) {
            HorizontalScroller(isScrollable = true) {
                Padding(padding = 4.dp) {
                    Row(
                        mainAxisSize = LayoutSize.Expand,
                        mainAxisAlignment = MainAxisAlignment.SpaceBetween
                    ) {
                        for (i in 1..20) {
                            anuncioList("Xiaomi")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun bussinesButtons() {
    // BOTÕES DE NEGOCIAÇOES
    //HeightSpacer(height = 5.dp)
    Padding(padding = 10.dp) {
        Row(
            mainAxisSize = LayoutSize.Expand,
            mainAxisAlignment = MainAxisAlignment.SpaceEvenly,
            crossAxisAlignment = CrossAxisAlignment.Center
        ) {
            transactionButtons("Payments", tela = Screen.Payments, vetor = R.drawable.qrcode_scan)
            transactionButtons("Exchanged", tela = Screen.Exchanged, vetor = R.drawable.send)
            transactionButtons("Comprovants", tela = Screen.Comprovants, vetor = R.drawable.library_books)
            transactionButtons("Creditos", tela = Screen.Creditos, vetor = R.drawable.bitcoin)
        }
    }
}

@Composable
fun verticalList() {
    // VERTICAL SCROLLER PARA LISTVIEWMODEL
    Padding(padding = EdgeInsets(all = 6.dp)) {
        Card(color = Color.Transparent, shape = RoundedCornerShape(4.dp)) {
            Container(height = 420.dp, expanded = true) {
                VerticalScroller() {
                    Column() {
                        for (i in 1..10) {
                            listViewModel(
                                "Bitcoin",
                                30000.00
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun bottomBar(onUnimplementedAction: () -> Unit) {
    val context = +ambient(ContextAmbient)
    FlexRow(crossAxisAlignment = CrossAxisAlignment.Center ,mainAxisAlignment = MainAxisAlignment.SpaceAround) {
        inflexible {
            BottomBarAction(R.drawable.bitcoin) {
                onUnimplementedAction()
            }
            BottomBarAction(id = R.drawable.bitcoin) {
                onUnimplementedAction()
            }
        }
        inflexible {
            Container(height = 70.dp, width = 100.dp) {
                FloatingActionButton(text = "+", onClick = {}, elevation = 6.dp)
            }
        }
        inflexible {
            BottomBarAction(R.drawable.bitcoin) {
                onUnimplementedAction()
            }
            BottomBarAction(id = R.drawable.bitcoin) {
                onUnimplementedAction()
            }
        }
    }
}

// FUNCTIONS ================================
@Composable
private fun BottomBarAction(@DrawableRes id: Int, onClick: () -> Unit) {
    Ripple(
        bounded = false,
        radius = 24.dp
    ) {
        Clickable(onClick = onClick) {
            Padding(12.dp) {
                Container(width = 24.dp, height = 24.dp) {
                    DrawVector(+vectorResource(id))
                }
            }
        }
    }
}