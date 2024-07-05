package com.application.cognimate

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.application.cognimate.ui.theme.CognimateTheme
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CognimateTheme {
                SplashScreen()
            }
        }
    }

    @Preview
    @Composable
    private fun SplashScreen() {

        val alpha = remember {
            androidx.compose.animation.core.Animatable(0f)
        }

        LaunchedEffect(key1 = true, block = {
            alpha.animateTo(
                1f,
                animationSpec = tween(1500)
            )
            delay(5000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        })

        Box (modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .alpha(alpha.value)
            , contentAlignment = Alignment.Center) {

            Image(painter = painterResource(id = R.drawable.kiddo),
                contentDescription = null,
                modifier = Modifier.size(300.dp, 300.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp, 100.dp)
                    .absolutePadding(0.dp, 0.dp, 0.dp, 40.dp)
                    .align(Alignment.BottomCenter)
            )

            Text(
                text = "CogniMate",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .absolutePadding(0.dp, 0.dp, 0.dp, 20.dp)
                    .align(Alignment.BottomCenter)
                    .alpha(0.5f)
            )

        }

    }

}