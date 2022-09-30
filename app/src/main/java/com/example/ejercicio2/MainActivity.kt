package com.example.ejercicio2

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio2.ui.theme.Ejercicio2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val image = painterResource(R.drawable.munyeco)
                    Greeting()

                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column{
        Row{
            Text(text = "Nueva APP",
                style = MaterialTheme.typography.h1,
            textAlign = TextAlign.Center)
        }
        Row{
            Text(text = "Soy Alejandro\n Esta app no hace nada")
        }
        Row{
            androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.munyeco), contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Ejercicio2Theme {
        Greeting()
    }
}