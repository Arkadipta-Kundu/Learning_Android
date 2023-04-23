package com.example.business_card_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card_app.ui.theme.Business_card_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Business_card_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(
                        firstname = "Arkadipta", lastname = "Kundu",
                        email = "arkadiptak49@gmail.com", number = 7584917773
                    );
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    modifier: Modifier = Modifier,
    firstname: String,
    lastname: String,
    number: Long,
    email: String
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray)
            .wrapContentSize(align = Alignment.Center)
    ) {
        val image = painterResource(id = R.drawable.me_in_coat)
        Image(
            painter = image, contentDescription = null, modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
        Text(
            text = "$firstname",
            fontSize = 35.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "$lastname",
            fontSize = 25.sp,
            color = Color.White,
        )
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 600.dp)
            .padding(bottom = 70.dp)
            .wrapContentSize(align = Alignment.Center)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 60.dp),
        ) {
            Text(text = "📧", fontSize = 20.sp)
            Text(
                text = "$email",
                fontSize = 20.sp,
                color = Color.White, modifier = Modifier.padding(start = 10.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 60.dp),
        ) {
            Text(text = "📞", fontSize = 20.sp)
            Text(
                text = "$number",
                fontSize = 20.sp,
                color = Color.White, modifier = Modifier.padding(start = 10.dp)
            )
        }

    }
}

@Composable
fun nameAndLastname(firstname: String, lastname: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()

            .padding(start = 37.dp)
    ) {

        contactDetails(number = 758491773, email = "arkadiptak49@gmail.com")
    }
}

@Composable
fun contactDetails(number: Int, email: String, modifier: Modifier = Modifier) {
    Column(
    ) {
        Text(
            text = "$number",
            fontSize = 20.sp,
            color = Color.White,
        )
        Text(
            text = "$email",
            fontSize = 20.sp,
            color = Color.White,
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Business_card_appTheme {
        BusinessCard(
            firstname = "Arkadipta", lastname = "Kundu",
            email = "arkadiptak49@gmail.com", number = 7584917773
        );
    }
}