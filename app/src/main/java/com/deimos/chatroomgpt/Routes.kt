package com.deimos.chatroomgpt

sealed class Routes(val route: String)
{
	object Login : Routes("Login")
}
