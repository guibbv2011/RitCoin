package com.example.ritcoin.ui.screens.payment

import android.annotation.SuppressLint
import android.hardware.camera2.CameraDevice
import android.hardware.camera2.CameraManager
import android.hardware.camera2.params.Face
import android.os.Bundle
import androidx.compose.*
import androidx.fragment.app.DialogFragment
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Text
import androidx.ui.layout.*
import androidx.ui.material.*
import com.example.ritcoin.R
import com.example.ritcoin.ui.utility.Screen
import com.example.ritcoin.ui.utility.navigateTo
import com.example.ritcoin.ui.widgets.transactionButtons

@Composable
fun Comprar() {
    Center {
        transactionButtons(discricao = "QrCode", vetor = R.drawable.qrcode, tela = Screen.SideBySideAlertDialogSample)
    }
}

@Composable
fun SideBySideAlertDialogSample() {

    val openDialog = +state { true }

    if (openDialog.value) {
        AlertDialog(
            onCloseRequest = {
                // In this example we allow the dialog to be closed by other actions
                // such as taping outside or pressing the back button.
                openDialog.value = true
            },
            title = {
                Text(text = "Title")
            },
            text = {
                Text("This area typically contains the supportive text" +
                        " which presents the details regarding the Dialog's purpose.")
            },
            confirmButton = {
                Button("Confirm", onClick = {
                    navigateTo(Screen.HomePage)
                    openDialog.value = false
                })
            },
            dismissButton = {
                Button("Dismiss", onClick = {
                    navigateTo(Screen.HomePage)
                    openDialog.value = false
                })
            },
            buttonLayout = AlertDialogButtonLayout.SideBySide
        )
    }
}