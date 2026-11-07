package com.topazaimobile.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopazApp()
        }
    }
}

@Composable
fun TopazApp() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF101014)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(35.dp))

                Text(
                    "TOPAZ AI",
                    color = Color.White,
                    fontSize = 32.sp
                )

                Text(
                    "MOBILE",
                    color = Color(0xFF9B78FF),
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(55.dp))

                Text(
                    "Melhore seus vídeos com IA",
                    color = Color.White,
                    fontSize = 21.sp
                )

                Spacer(modifier = Modifier.height(25.dp))

                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Text("Selecionar vídeo")
                }

                Spacer(modifier = Modifier.height(35.dp))

                Text("FERRAMENTAS DE IA", color = Color.Gray)

                Spacer(modifier = Modifier.height(20.dp))

                listOf(
                    "AI Upscale 4K",
                    "AI Face Recovery",
                    "AI Denoise",
                    "AI Frame Interpolation"
                ).forEach {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 5.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF202027)
                        )
                    ) {
                        Text(
                            it,
                            color = Color.White,
                            modifier = Modifier.padding(18.dp)
                        )
                    }
                }
            }
        }
    }
}
