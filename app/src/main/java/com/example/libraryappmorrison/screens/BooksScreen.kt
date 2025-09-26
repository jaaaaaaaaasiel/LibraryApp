package com.example.libraryappmorrison.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil3.compose.SubcomposeAsyncImage
import com.example.libraryappmorrison.components.Header
import com.example.libraryappmorrison.components.PopularBooks
import com.example.libraryappmorrison.models.books
import com.example.libraryappmorrison.ui.theme.BackgroundLight
import com.example.libraryappmorrison.ui.theme.HeaderGreenLight
import com.example.libraryappmorrison.ui.theme.LibraryAppMorrisonTheme

@Composable
fun BooksScreen(navController : NavController){
    LazyColumn(modifier = Modifier
        .fillMaxSize().
        background(BackgroundLight)
    ) {
        item {
            Header()
        }
        item {
            PopularBooks()
        }

        items(books) { book ->
            Row(modifier = Modifier
                .fillMaxWidth()
                .clickable{navController.navigate(BookDetailScreenRoute(book.id))},
                verticalAlignment = Alignment.CenterVertically
            ) {
                SubcomposeAsyncImage(
                    model = book.image,
                    contentDescription = book.title,
                    modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                    loading = {
                        Box(modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(HeaderGreenLight),
                            contentAlignment = Alignment.Center
                        ){
                            CircularProgressIndicator(
                                strokeWidth = 2.dp,
                                color = Color.White,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    },
                    error = {
                        Box(modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape)
                            .background(HeaderGreenLight),
                            contentAlignment = Alignment.Center
                        ){
                            Text(text = book.title.take(2).uppercase(),
                                style = MaterialTheme.typography.titleMedium,
                                color = Color.White)
                        }
                    }
                )
                Column(modifier  =Modifier
                    .weight(1f)
                    .padding(start = 10.dp)
                ) {
                    Text(book.title,
                        style = MaterialTheme.typography.titleMedium)
                    Text(book.author,
                        style = MaterialTheme.typography.bodyMedium)
                }
                Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,"navigate")
            }
        }
    }
}

@Preview
@Composable
fun BookScreenPreview(){
    LibraryAppMorrisonTheme {
        BooksScreen(rememberNavController())
    }
}