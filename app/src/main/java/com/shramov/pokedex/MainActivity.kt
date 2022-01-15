package com.shramov.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.shramov.pokedex.ui.theme.JetpackComposePokedexTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author Alexandr Shramov
 * @date 15.01.2022
 */
@AndroidEntryPoint
class MainActivity: ComponentActivity() {

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                JetpackComposePokedexTheme {

                }
            }
        }
    }

}