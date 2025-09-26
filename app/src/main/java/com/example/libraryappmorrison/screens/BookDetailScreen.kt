package com.example.libraryappmorrison.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.libraryappmorrison.components.BookDetailCard
import com.example.libraryappmorrison.models.books
import com.example.libraryappmorrison.ui.theme.AccentYellowDark
import com.example.libraryappmorrison.ui.theme.BackgroundLight
import com.example.libraryappmorrison.ui.theme.HeaderGreen
import com.example.libraryappmorrison.ui.theme.Headphones
import com.example.libraryappmorrison.ui.theme.LibraryAppMorrisonTheme

@Composable
fun BookDetailScreen(bookId : Int){
    val book = books.firstOrNull{it.id == bookId}
    Column(modifier = Modifier
        .fillMaxSize()
        .background(BackgroundLight)
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .clip(RoundedCornerShape(bottomStart = 70.dp))
            .background(HeaderGreen)
            .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = book?.image,
                contentDescription = book?.title,
                modifier = Modifier
                    .width(150.dp)
                    .weight(2f)
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(16.dp)
                    .background(Color.White),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(top = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(book?.title ?: "Desconocido",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White)
                Text(book?.author ?: "Sin autor",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White)
                Row(modifier = Modifier
                    .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ){
                    BookDetailCard("Rating",book?.rating.toString())
                    BookDetailCard("Pages", book?.pages ?: "0")
                    BookDetailCard("Audio", book?.audio ?: "Oh 0m")
                    BookDetailCard("Lang", book?.language?.take(3)?.uppercase() ?: "ENG")

                }
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(vertical = 10.dp, horizontal = 5.dp)
        ){
            Button({},
                colors = ButtonDefaults.buttonColors(containerColor = AccentYellowDark),
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .padding(horizontal = 5.dp)
            ){
                Text("Leer ahora")

            }
            Icon(imageVector = Headphones,
                null,
                modifier = Modifier
                    .clip(CircleShape)
                    .padding(8.dp)
                    .fillMaxHeight()
                    .size(55.dp)
                    .background(AccentYellowDark),
                tint = Color.White)
        }
    }
}

@Preview
@Composable
fun BookDetailPreview(){
    LibraryAppMorrisonTheme {
        BookDetailScreen(4)
    }
}