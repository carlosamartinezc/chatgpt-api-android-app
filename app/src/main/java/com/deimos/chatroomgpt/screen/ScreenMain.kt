package com.deimos.chatroomgpt.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.deimos.chatroomgpt.screen.LoginPage
import com.deimos.chatroomgpt.Routes

@Composable
fun ScreenMain() 
{
    val navController = rememberNavController()

	NavHost(navController, Routes.Login.route){
		composable(Routes.Login.route){ LoginPage(navController)}
	}
}
