package com.deimos.chatroomgpt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.res.*
import androidx.compose.ui.draw.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface


class MainActivity : ComponentActivity() 
{
	data class Message(val author: String, val body: String)

    override fun onCreate(savedInstanceState: Bundle?)
	{
        super.onCreate(savedInstanceState)

        setContent {
        }
    }
}
