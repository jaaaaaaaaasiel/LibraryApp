package com.example.libraryappmorrison.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.libraryappmorrison.ui.theme.AccentYellow
import com.example.libraryappmorrison.ui.theme.ChipBG

@Composable
fun BookDetailCard(
    cardText: String,
    rating: String
){
    Column(modifier = Modifier
        .clip(RoundedCornerShape(16.dp))
        .background(ChipBG)
        .padding(horizontal = 14.dp, vertical = 5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(cardText, style = MaterialTheme.typography.titleSmall)
        Text(rating, style = MaterialTheme.typography.bodyMedium)
    }
}