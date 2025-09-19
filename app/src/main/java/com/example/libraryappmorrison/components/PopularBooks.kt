package com.example.libraryappmorrison.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil3.compose.SubcomposeAsyncImage
import com.example.libraryappmorrison.models.books
import com.example.libraryappmorrison.ui.theme.HeaderGreenLight

@Composable
fun PopularBooks(){
    Column(modifier = Modifier
        .height(250.dp)
        .fillMaxWidth()
        .padding(20.dp)
    ) {
        Text("Libros Populares",
            style = MaterialTheme.typography.titleLarge)
        LazyRow(modifier = Modifier
            .fillMaxSize()
        ) {
            items(books){ book ->
                Column(modifier = Modifier
                    .padding(end = 20.dp)
                    .fillMaxHeight()
                    .width(120.dp)
                ) {
                    SubcomposeAsyncImage(
                        model = book.image,
                        contentDescription = book.title,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(30.dp),
                        contentScale = ContentScale.Crop,
                        loading = {
                            Box(modifier = Modifier
                                .fillMaxSize()
                                .background(HeaderGreenLight),
                                contentAlignment = Alignment.Center
                            ){
                                CircularProgressIndicator(
                                    strokeWidth = 3.dp,
                                    color = Color.White,
                                    modifier = Modifier.size(30.dp)
                                )
                            }
                        },
                        error = {
                            Box(modifier = Modifier
                                .fillMaxSize()
                                .background(HeaderGreenLight),
                                contentAlignment = Alignment.Center
                            ){
                                Text(text = book.title.take(2).uppercase(),
                                    style = MaterialTheme.typography.titleMedium,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold)
                            }
                        }
                    )

                    Text(text = book.title,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Center,
                        maxLines = 1)

                    Text(text = book.author.uppercase(),
                        style = MaterialTheme.typography.bodySmall,
                        textAlign = TextAlign.Center,
                        maxLines = 1)
                }
            }
        }
    }
}