package com.example.actbasiccomposable_0138

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

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
                contentDescription = null,
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

            Spacer(modifier = Modifier.height(15.dp))

            // Box bawah lebih besar dari gambar atas
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .background(Color.White)
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = foto,
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)
                            .clip(CircleShape)
                            .border(
                                3.dp,
                                Color.White,
                                RoundedCornerShape(12.dp)
                            ),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(
                            text = "Review sinkat: "
                        )
                        Text(
                            text = "Interstellar adalah film sci-fi yang menarik dengan visual dan musik yang kuat. Ceritanya cukup kompleks, tetapi tetap seru dan memiliki sisi emosional, terutama tentang keluarga dan pengorbanan. Film ini cocok untuk penonton yang menyukai cerita luar angkasa yang tidak hanya mengandalkan aksi, tetapi juga memiliki cerita yang mendalam.",
                            color = Color.Blue
                        )
                    }
                }
            }
        }
    }
}