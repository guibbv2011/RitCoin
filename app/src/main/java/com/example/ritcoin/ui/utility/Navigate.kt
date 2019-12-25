package com.example.ritcoin.ui.utility

import androidx.compose.Model
import androidx.fragment.app.Fragment
import com.example.ritcoin.R
import com.example.ritcoin.ui.MainActivity

sealed class Screen() {
    object HomePage : Screen()
    object Payments : Screen()
    object Creditos : Screen()
    object Exchanged : Screen()
    object Comprovants : Screen()
    object Comprar : Screen()
    object Vender : Screen()
    object SideBySideAlertDialogSample : Screen()
}

@Model
object RitCoinApp {
    var currentScreen: Screen = Screen.HomePage
    var currentScreenPayments: Screen = Screen.Payments
    var currentScreenExchanged: Screen = Screen.Exchanged
    var currentScreenCreditos: Screen = Screen.Creditos
    var currentScreenComprovants: Screen = Screen.Comprovants
    var currentScreenComprar: Screen = Screen.Comprar
    var currentScreenVender: Screen = Screen.Vender
    var currentScreenSideBySideAlertDialogSample: Screen = Screen.SideBySideAlertDialogSample
}

fun navigateTo(destination: Screen) {
    RitCoinApp.currentScreen = destination
    RitCoinApp.currentScreenPayments = destination
    RitCoinApp.currentScreenExchanged = destination
    RitCoinApp.currentScreenCreditos = destination
    RitCoinApp.currentScreenComprovants = destination
    RitCoinApp.currentScreenComprar = destination
    RitCoinApp.currentScreenVender = destination
    RitCoinApp.currentScreenSideBySideAlertDialogSample = destination
}