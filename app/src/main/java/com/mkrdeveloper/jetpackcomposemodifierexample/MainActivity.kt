package com.mkrdeveloper.jetpackcomposemodifierexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mkrdeveloper.jetpackcomposemodifierexample.ui.theme.JetpackComposeModifierExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeModifierExampleTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Text(text = "Subscribe please",
            modifier = Modifier
                .padding(10.dp)
                .background(Color.Green)
                .padding(10.dp)
                //.width(250.dp)
               // .height(250.dp)
                //.size(250.dp)
               // .fillMaxWidth()
                //.fillMaxHeight()
                //.fillMaxSize()
        )
        Box(modifier = Modifier
            .padding( 60.dp)
            .size(250.dp)
            .rotate(45f)
           // .alpha(0.4f)
            .clip(CutCornerShape(20.dp))
            .background(Color.Cyan)
            .border(3.dp, Color.Black,CutCornerShape(20.dp))
            .clickable {  }

        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeModifierExampleTheme {
        MyApp()
    }
}