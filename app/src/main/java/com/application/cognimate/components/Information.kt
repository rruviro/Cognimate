package com.application.cognimate.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.application.cognimate.R

val Ruby = Color(red = 239, green = 106, blue = 106, alpha = 255)
val SkyBlue = Color(red = 110, green = 181, blue = 246, alpha = 255)
val EmeraldGreen = Color(red = 116, green = 185, blue = 127, alpha = 255)

val cornerRadius = 10.dp
val shape = RoundedCornerShape(cornerRadius)

@Composable
fun Info(
    modifier: Modifier
) {

    Box (modifier = Modifier
        .fillMaxHeight()
        .background(Color.White)
    ) {
        Text(
            text = "Information",
            style = TextStyle(
                color = Color.Black,
                fontSize = 12.sp,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .absolutePadding(15.dp, 0.dp, 0.dp, 0.dp)
        )
    }
    Spacer(modifier = Modifier.height(15.dp))
    Row (
        modifier = Modifier
            .absolutePadding(15.dp)
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Box (
            modifier = modifier
                .height(160.dp)
                .width(363.dp)
                .clip(shape)
                .absolutePadding(0.dp, 0.dp, 0.dp, 0.dp)
                .background(Ruby)
        ) {
            Text(
                text = "Financial Management",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier
                    .absolutePadding(15.dp, 17.dp, 0.dp, 0.dp)
            )
            Text(
                text = "At its core, financial management is the\npractice of making a business plan and\nthen ensuring all departments stay on\ntrack. Solid financial management\nenables the CFO or VP of finance to\nprovide data that supports creation of a\nlong-range vision, informs decisions on\nwhere to invest, and yields insights on\nhow to fund those investments, liquidity,\nprofitability, cash runway and more.",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 9.sp
                ),
                modifier = Modifier
                    .absolutePadding(15.dp, 35.dp, 0.dp, 0.dp)
                    .alpha(0.50f)

            )

            Image(
                painter = painterResource(id = R.drawable.financialmanagement),
                contentDescription = null,
                modifier = Modifier
                    .size(400.dp, 400.dp)
                    .offset(x = 100.dp)
                    .align(Alignment.TopEnd)
            )

        }
    }
    Spacer(modifier = Modifier.height(10.dp))
    Row (
        modifier = modifier
            .absolutePadding(15.dp)
    ) {
        Box (modifier = modifier
            .height(225.dp)
            .width(175.dp)
            .clip(shape)
            .background(SkyBlue)
        ) {
            Text(
                text = "System Development",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier
                    .absolutePadding(15.dp, 17.dp, 0.dp, 0.dp)
            )

            Text(
                text = "Systems development is the\nprocess of defining, designing,\ntesting, and implementing a new\nsoftware application or program.",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 9.sp
                ),
                modifier = Modifier
                    .absolutePadding(15.dp, 35.dp, 0.dp, 0.dp)
                    .alpha(0.50f)

            )

            Image(
                painter = painterResource(id = R.drawable.sysdev),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 70.dp)
                    .scale(1.38f)
                    .absolutePadding(0.dp, 0.dp, 0.dp, 10.dp)
                    .align(Alignment.BottomEnd)
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box (modifier = modifier
            .height(225.dp)
            .width(175.dp)
            .clip(shape)
            .background(EmeraldGreen)
        ) {
            Text(
                text = "Database Administrator",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier
                    .absolutePadding(15.dp, 17.dp, 0.dp, 0.dp)
            )
            Text(
                text = "A DBA is the data guardian, ensuring smooth operation, security, and performance of an organization's databases",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 9.sp
                ),
                modifier = Modifier
                    .absolutePadding(15.dp, 35.dp, 0.dp, 0.dp)
                    .alpha(0.50f)

            )
            Image(
                painter = painterResource(id = R.drawable.administrator),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = 56.dp)
                    .scale(1.95f)
                    .absolutePadding(0.dp, 0.dp, 0.dp, 18.dp)
                    .align(Alignment.BottomEnd)
            )
        }
    }


}