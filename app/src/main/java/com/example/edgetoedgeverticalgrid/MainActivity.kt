package com.example.edgetoedgeverticalgrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.edgetoedgeverticalgrid.ui.theme.EdgeToEdgeVerticalGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                val list = List(50) { it }
                LazyVerticalGrid(
                    columns = GridCells.Adaptive(180.dp),
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = WindowInsets.safeDrawing.asPaddingValues(),
                ) {
                    items(list, key = { it }) { obj ->
                        Box(
                            Modifier
                                .padding(8.dp)
                                .fillMaxSize()
                                .aspectRatio(1f)
                                .background(Color.Blue)
                        )
                    }
                }
            }
        }
    }
}
