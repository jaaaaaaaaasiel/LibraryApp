package com.example.libraryappmorrison.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HeaderInfo(){
    Row (modifier = Modifier
        .fillMaxWidth()
    ){
        Column(modifier = Modifier
            .weight(1f)
        ) {
            Text("Hola Morrison",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White)
            Text("Comencémos a leer",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White)
        }
        Icon(imageVector = Icons.Default.Search,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .size(40.dp)
                .background(Color.LightGray)
                .clip(CircleShape)
                .padding(5.dp)
        )
        Box(modifier = Modifier
            .padding(start = 20.dp)
            .size(40.dp)
            .background(Color.LightGray)
            .clip(CircleShape)
            .padding(5.dp)){

        }
    }
}