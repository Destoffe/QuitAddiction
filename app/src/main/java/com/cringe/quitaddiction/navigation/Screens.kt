package com.cringe.quitaddiction.navigation

sealed class Screens(val route: String) {
    object Dashboard: Screens("dashboard")
    object Register: Screens("register")
}