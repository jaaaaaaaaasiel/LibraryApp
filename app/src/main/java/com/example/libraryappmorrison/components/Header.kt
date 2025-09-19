package com.example.libraryappmorrison.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.libraryappmorrison.models.books
import com.example.libraryappmorrison.ui.theme.HeaderGreen

@Composable
fun Header(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .height(300.dp)
        .clip(RoundedCornerShape(bottomStart = 70.dp))
        .background(HeaderGreen)
        .padding(20.dp)
        .padding(top = 20.dp)
    ) {

        HeaderInfo()

        Text("Continuar Leyendo",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White)

        BookCard(books[2])
    }
}