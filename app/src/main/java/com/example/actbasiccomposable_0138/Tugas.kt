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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlin.coroutines.coroutineContext

@Composable
fun Tugas(modifier: Modifier) {
    val background = painterResource(id = R.drawable.bg_star)
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
                text = "Profil Film",
                color = Color.White
            )

            Spacer(modifier = Modifier.height(15.dp))

            // logo letterboxd
            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))

            // teks
            Text(
                text = "Judul: Interstellar",
                color = Color.White
            )

            Text(
                text = "Genre: Sci-Fi",
                color = Color.Green
            )

            Text(
                text = "Durasi 169 menit",
                color = Color.Cyan
            )

            Spacer(modifier = Modifier.height(15.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .background(Color.White)
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = foto,
                        contentDescription = null,
                        modifier = Modifier
                            .width(150.dp)
                            .height(220.dp)
                            .border(
                                3.dp,
                                Color.White
                            ),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(
                            text = "Review singkat: "
                        )
                        Text(
                            text = "Interstellar adalah film sci-fi yang menarik dengan visual dan musik yang kuat. Ceritanya cukup kompleks, tetapi tetap emosional dan seru untuk diikuti. Cocok untuk yang suka film luar angkasa dengan cerita yang mendalam.",
                            color = Color.Blue
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start) {
                        Text(
                            text = "Rating              : ",
                        )
                        Text(
                            text = "️️⭐️⭐️⭐️⭐️/5",
                            color = Color.Blue,
                        )
                    }
                }
            }
        }
    }
}