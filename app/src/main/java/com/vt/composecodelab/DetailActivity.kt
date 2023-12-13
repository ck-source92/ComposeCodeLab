package com.vt.composecodelab

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.vt.composecodelab.ui.theme.ComposeCodeLabTheme

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            ComposeCodeLabTheme {
                Text(text = "Detail Activity")
            }
        }
    }
}

@Composable
fun Title() {
    Text(text = "Detail Activity", color = Color.Green)
}

@Preview(showBackground = true)
@Composable
fun PreviewTitle() {
    ComposeCodeLabTheme {
        Title()
    }
}