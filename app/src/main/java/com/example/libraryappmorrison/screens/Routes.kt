package com.example.libraryappmorrison.screens

import kotlinx.serialization.Serializable

@Serializable
object BookScreenRoute
@Serializable
object FavoriteScreenRoute
@Serializable
data class BookDetailScreenRoute(val id: Int)
