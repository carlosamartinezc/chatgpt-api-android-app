package com.deimos.chatroomgpt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface

import com.deimos.chatroomgpt.ui.theme.ChatRoomGPTTheme
import com.deimos.chatroomgpt.screen.ScreenMain

class MainActivity : ComponentActivity() 
{
    override fun onCreate(savedInstanceState: Bundle?)
	{
        super.onCreate(savedInstanceState)

        setContent {
			ChatRoomGPTTheme {
				Surface(){
					ScreenMain()
				}
			}
    	}
    }
}
