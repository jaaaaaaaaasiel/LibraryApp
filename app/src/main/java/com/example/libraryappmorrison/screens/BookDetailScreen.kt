package com.example.libraryappmorrison.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.libraryappmorrison.models.books
import com.example.libraryappmorrison.ui.theme.LibraryAppMorrisonTheme

@Composable
fun BookDetailScreen(bookId : Int){
    val book = books.firstOrNull{it.id == bookId}
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Book Detail Screen: ${bookId}")
    }
}

@Preview
@Composable
fun BookDetailPreview(){
    LibraryAppMorrisonTheme {
        BookDetailScreen(4)
    }
}