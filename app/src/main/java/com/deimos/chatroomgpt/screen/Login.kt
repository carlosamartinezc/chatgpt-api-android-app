package com.deimos.chatroomgpt.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import com.deimos.chatroomgpt.R
import com.deimos.chatroomgpt.ui.theme.Purple700
import android.util.Log 

@Composable
fun LoginPage(navController: NavHostController) 
{
	Box(Modifier.fillMaxSize()){
		ClickableText(
			text = AnnotatedString(stringResource(R.string.sign_up)),
			modifier = Modifier
				.align(Alignment.BottomCenter)
				.padding(20.dp),
			onClick = { 
			
			},
			style = TextStyle(
				fontSize = 14.sp,
				textDecoration = TextDecoration.Underline,
				color = Purple700
			)
		)
	}

	Column(
		modifier = Modifier.padding(20.dp),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	){
		val username = remember { mutableStateOf(TextFieldValue()) }
		val password = remember { mutableStateOf(TextFieldValue()) }


	}
}
