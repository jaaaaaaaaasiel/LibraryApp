package com.example.libraryappmorrison.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Headphones: ImageVector
    get() {
        if (_Headphones != null) return _Headphones!!

        _Headphones = ImageVector.Builder(
            name = "Headphones",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                reflectiveQuadToRelative(114f, -77f)
                reflectiveQuadTo(480f, 120f)
                reflectiveQuadToRelative(140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                reflectiveQuadToRelative(77f, 114f)
                reflectiveQuadTo(840f, 480f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(600f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 200f)
                reflectiveQuadToRelative(-198.5f, 81.5f)
                reflectiveQuadTo(200f, 480f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                close()
                moveToRelative(-80f, -240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                close()
                moveToRelative(-400f, 0f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()

        return _Headphones!!
    }

private var _Headphones: ImageVector? = null

