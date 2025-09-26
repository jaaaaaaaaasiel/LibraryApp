package com.example.libraryappmorrison.models

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val year: Int,
    val description: String,
    val image: String,
    val rating: Float,
    val pages: String,
    val audio: String,
    val language: String
)
val books = listOf(
    Book(1, "1984", "George Orwell", 1949,
        "Distopía sobre vigilancia y control totalitario.",
        "https://m.media-amazon.com/images/I/618QN9w1zmL._AC_UF1000,1000_QL80_.jpg",
        4.7f, "328", "11h 22m", "Inglés"),

    Book(2, "Cien años de soledad", "Gabriel García Márquez", 1967,
        "Saga familiar en Macondo, realismo mágico puro.",
        "https://m.media-amazon.com/images/I/81AFocW+J-L._AC_UF1000,1000_QL80_.jpg",
        4.8f, "471", "17h 45m", "Español"),

    Book(3, "El nombre del viento", "Patrick Rothfuss", 2007,
        "Crónica épica de Kvothe, músico y mago legendario.",
        "https://m.media-amazon.com/images/I/81vpsIs58WL._AC_UF1000,1000_QL80_.jpg",
        4.6f, "662", "27h 55m", "Español"),

    Book(4, "Sapiens", "Yuval Noah Harari", 2011,
        "Historia de la humanidad desde la evolución hasta hoy.",
        "https://m.media-amazon.com/images/I/71XwV0YpTIL._AC_UF1000,1000_QL80_.jpg",
        4.5f, "443", "15h 18m", "Inglés"),

    Book(5, "La sombra del viento", "Carlos Ruiz Zafón", 2001,
        "Misterio literario en la Barcelona de posguerra.",
        "https://m.media-amazon.com/images/I/913DdP7RflL._AC_UF1000,1000_QL80_.jpg",
        4.9f, "565", "17h 33m", "Español"),

    Book(6, "Fahrenheit 451", "Ray Bradbury", 1953,
        "Sociedad donde los libros están prohibidos y quemados.",
        "https://m.media-amazon.com/images/I/71OFqSRFDgL._AC_UF1000,1000_QL80_.jpg",
        4.4f, "256", "5h 1m", "Inglés"),

    Book(7, "Los pilares de la Tierra", "Ken Follett", 1989,
        "Construcción de una catedral en la Edad Media.",
        "https://m.media-amazon.com/images/I/91zbi9M+mKL._AC_UF1000,1000_QL80_.jpg",
        4.8f, "1076", "40h 56m", "Español"),

    Book(8, "El psicoanalista", "John Katzenbach", 2002,
        "Thriller psicológico sobre un doctor perseguido.",
        "https://m.media-amazon.com/images/I/81ZLwAwVwBL._AC_UF1000,1000_QL80_.jpg",
        4.7f, "528", "19h 48m", "Español"),

    Book(9, "La carretera", "Cormac McCarthy", 2006,
        "Viaje postapocalíptico de un padre y su hijo.",
        "https://m.media-amazon.com/images/I/71g2ednj0JL._AC_UF1000,1000_QL80_.jpg",
        4.3f, "287", "6h 59m", "Español"),

    Book(10, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605,
        "Aventuras de un hidalgo que cree ser caballero.",
        "https://m.media-amazon.com/images/I/6173YSqHPtL._AC_UF1000,1000_QL80_.jpg",
        4.9f, "863", "41h 12m", "Español")
)

