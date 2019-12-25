package com.example.ritcoin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import com.example.ritcoin.ui.screens.RitCoinApp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MaterialTheme {
                RitCoinApp()
            }
        }
    }
}


