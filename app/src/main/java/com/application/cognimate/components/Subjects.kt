package com.application.cognimate.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.application.cognimate.R

val GreenLantern = Color(red = 15, green = 153, blue = 132, alpha = 255)

@Preview
@Composable
fun Subjects() {
    LazyRow {
        items(count = 10) {
            Spacer(modifier = Modifier.width(10.dp))
            Card(
                modifier = Modifier
                    .width(180.dp)
                    .height(130.dp)
                    .padding(0.dp, 5.dp, 0.dp, 0.dp)
                    .clip(RoundedCornerShape(10.dp))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(GreenLantern)
                        .padding(5.dp),
                ) {
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        modifier = Modifier
                            .absolutePadding(15.dp, 0.dp, 0.dp, 0.dp),
                        text = "Math",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Image(
                        painter = painterResource(id = R.drawable.books),
                        contentDescription = "profile Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .scale(3f)
                            .offset(x = 50.dp)
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.width(10.dp))
}