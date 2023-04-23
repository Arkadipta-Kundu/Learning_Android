package com.example.business_card_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
                    AllToGether(firstname = "Arkadipta", lastname = "Kundu");
                }
            }
        }
    }
}

@Composable
fun AllToGether(modifier: Modifier = Modifier, firstname: String, lastname: String) {
    Box {
        val image = painterResource(R.drawable.annie_spratt_6a3nqq1ywbw_unsplash);
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        nameAndLastname(firstname = firstname, lastname = lastname);
    }
}

@Composable
fun nameAndLastname(firstname: String, lastname: String, modifier: Modifier = Modifier) {
    Column (modifier = modifier
        .fillMaxWidth().fillMaxHeight()
        .wrapContentSize(align = Alignment.Center)){
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
            modifier = Modifier.padding(start = 37.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Business_card_appTheme {
        AllToGether(firstname = "Arkadipta", lastname = "Kundu");
    }
}