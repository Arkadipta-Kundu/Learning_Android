package com.example.greeting_app

import android.media.tv.TvContract.Channels.Logo
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greeting_app.ui.theme.Greeting_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetMeWithText(message = "hi its your birthday!!", by = getString(R.string.friend))
                }
            }
        }
    }
}

@Composable
fun GreetMeWithImage(message: String, by: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
    GreetMeWithText(message = message, by = by);
}

@Composable
fun GreetMeWithText(message: String, by: String,modifier: Modifier = Modifier) {
    Column {

        Text(
            text = message,
            fontSize = 40.sp,
            modifier = modifier.fillMaxWidth().wrapContentSize(align = Alignment.Center).padding(top = 16.dp)
        )
        Text(
            text = by,
            fontSize = 20.sp,
            modifier = modifier.fillMaxWidth().wrapContentSize(align = Alignment.Center).padding( top = 5.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting_appTheme {
        GreetMeWithImage(message = stringResource(R.string.happy_birthday), by = stringResource(R.string.form_friendname))
    }
}