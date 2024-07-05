package com.application.cognimate.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.application.cognimate.R
import com.application.cognimate.components.CountCard
import com.application.cognimate.components.Info
import com.application.cognimate.components.Subjects

@Preview
@Composable
fun HomeScreen() {
    Scaffold (
        topBar = { HomeTopBar() }
    ) { paddingValues ->
        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Color.White)
        ) {
            item {
                CountCardsSection(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    subjectCount = 5,
                    studiedHours = "10",
                    goalHours = "15"
                )
            }
            item {
                Info(
                    modifier = Modifier
                )
            }
            item {
                Box (modifier = Modifier
                    .fillMaxHeight()
                    .background(Color.White)
                ) {
                    Text(
                        text = "Subjects",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 12.sp,
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .absolutePadding(15.dp, 15.dp, 0.dp, 0.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Subjects()
            }
        }
    }
}

@Composable
private fun HomeTopBar() {

    Box (modifier = Modifier
        .height(70.dp)
        .fillMaxWidth()
        .background(Color.White)
    ) {

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .size(75.dp, 75.dp)
                .absolutePadding(15.dp, 15.dp, 0.dp, 0.dp)
                .align(Alignment.TopStart)
        )

        Text(
            text = "CogniMate",
            style = TextStyle(
                color = Color.Black,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .absolutePadding(80.dp, 29.dp, 0.dp, 0.dp)
                .align(Alignment.TopStart)
                .alpha(0.5f)
        )

        Text(
            text = "Prototype 0.0.1",
            style = TextStyle(
                color = Color.Black,
                fontSize = 9.sp,
            ),
            modifier = Modifier
                .absolutePadding(80.dp, 50.dp, 0.dp, 0.dp)
                .align(Alignment.TopStart)
                .alpha(0.4f)
        )

    }

}

@Composable
private fun CountCardsSection(
    modifier: Modifier,
    subjectCount: Int,
    studiedHours: String,
    goalHours: String
) {

    Box (modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(Color.White)
    ) {
        Text(
            text = "Status",
            style = TextStyle(
                color = Color.Black,
                fontSize = 12.sp,
            ),
            modifier = Modifier
                .align(Alignment.TopStart)
                .absolutePadding(15.dp, 10.dp, 0.dp, 0.dp)
        )
    }

    Row (modifier = modifier) {
        CountCard(
            modifier = Modifier
                .weight(1f)
                .height(100.dp),
            headingText = "Subject Count",
            count = "$subjectCount",
        )
        Spacer(modifier = Modifier.width(5.dp))
        CountCard(
            modifier = Modifier
                .weight(1f)
                .height(100.dp),
            headingText = "Studied Hours",
            count = studiedHours
        )
        Spacer(modifier = Modifier.width(5.dp))
        CountCard(
            modifier = Modifier
                .weight(1f)
                .height(100.dp),
            headingText = "Goal Study Hours",
            count = goalHours
        )
    }

}