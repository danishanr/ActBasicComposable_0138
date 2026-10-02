package com.example.actbasiccomposable_0138

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
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

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Profil Film"
            )

            Spacer(modifier = Modifier.height(15.dp))

            // Gambar atas
            Image(
                painter = logo,
                contentScale = null,
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))

            // Teks
            Text(
                text = "Judul: Interstellar",
                color = Color.Black
            )

            Text(
                text = "Genre: Sci-Fi",
                color = Color.Green
            )

            Text(
                text = "Durasi 169 menit",
                color = Color.Blue
            )
        }


    }



}