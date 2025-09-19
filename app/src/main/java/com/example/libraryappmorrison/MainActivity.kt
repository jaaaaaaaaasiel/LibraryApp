package com.example.libraryappmorrison

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.libraryappmorrison.screens.BookDetailScreen
import com.example.libraryappmorrison.screens.BooksScreen
import com.example.libraryappmorrison.screens.FavoriteScreen
import com.example.libraryappmorrison.ui.theme.AccentYellow
import com.example.libraryappmorrison.ui.theme.BackgroundLight
import com.example.libraryappmorrison.ui.theme.BottomBarBackground
import com.example.libraryappmorrison.ui.theme.LibraryAppMorrisonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LibraryAppMorrisonTheme {
                val navController = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize(),
                        bottomBar = {
                            NavigationBar(modifier = Modifier
                                .background(BackgroundLight)
                                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
                                containerColor = BottomBarBackground
                            ) {

                                NavigationBarItem(false, onClick = {
                                    navController.navigate("books")
                                },
                                    icon = { Icon(
                                        imageVector = Icons.Default.Menu,
                                        "home",
                                        modifier = Modifier.size(35.dp),
                                        tint = AccentYellow
                                    ) })
                                NavigationBarItem(false, onClick = {
                                    navController.navigate("favorites",
                                        )
                                },
                                    icon = { Icon(
                                        imageVector = Icons.Default.Favorite,
                                        "favoritos",
                                        modifier = Modifier.size(35.dp),
                                        tint = AccentYellow)})
                            }
                        }
                    ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {
                        composable("books") {
                            BooksScreen(navController = navController)
                        }
                        composable("favorites") {
                            FavoriteScreen()
                        }
                        composable(route = "books/{id}"
                            , arguments = listOf(
                                navArgument("id"){
                                    type = NavType.IntType
                                }
                            )
                        ){ backStackEntry ->
                            val id = backStackEntry.arguments?.getInt("id") ?: 0
                            BookDetailScreen(bookId = id)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LibraryAppMorrisonTheme {
        Greeting("Android")
    }
}