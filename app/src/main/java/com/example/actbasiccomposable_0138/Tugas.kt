package com.example.actbasiccomposable_0138

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import java.lang.reflect.Modifier

@Composable
fun Tugas(modifier: Modifier) {
    val background = painterResource(id = R.drawable.bg_bintang)
    val logo = painterResource(id = R.drawable.logo_letterboxd)
    val foto = painterResource(id = R.drawable.poster_film)

    Box(modifier = modifier.fillMaxSize()
    ) {
        // gambar background
        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }



}