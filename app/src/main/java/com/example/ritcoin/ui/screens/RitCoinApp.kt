
package com.example.ritcoin.ui.screens
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.animation.Crossfade
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeColor
import com.example.ritcoin.ui.screens.comprovants.Comprovants
import com.example.ritcoin.ui.screens.credits.Creditos
import com.example.ritcoin.ui.screens.exchanged.Exchanged

import com.example.ritcoin.ui.screens.payment.Comprar
import com.example.ritcoin.ui.screens.payment.Payments
import com.example.ritcoin.ui.screens.payment.SideBySideAlertDialogSample
import com.example.ritcoin.ui.screens.payment.Vender
import com.example.ritcoin.ui.utility.RitCoinApp
import com.example.ritcoin.ui.utility.Screen


@Composable
fun RitCoinApp() {
    MaterialTheme{
         AppContent()
    }
}


@Composable
private fun AppContent() {
    Crossfade(RitCoinApp.currentScreen) { screen ->
        Surface(color = +themeColor { background }) {
            when (screen) {
                is Screen.HomePage -> HomePage()
                is Screen.Payments -> Payments()
                is Screen.Creditos -> Creditos()
                is Screen.Comprovants -> Comprovants()
                is Screen.Exchanged -> Exchanged()
                is Screen.Comprar -> Comprar()
                is Screen.Vender -> Vender()
                is Screen.SideBySideAlertDialogSample -> SideBySideAlertDialogSample()
            }
        }
    }
}
