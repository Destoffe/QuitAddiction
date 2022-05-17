package com.cringe.quitaddiction.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cringe.quitaddiction.Dashboard
import com.cringe.quitaddiction.WelcomeView


@Composable
fun Navigation(navController: NavHostController){

    NavHost(navController = navController , startDestination = Screens.Welcome.route){
        composable(route = Screens.Dashboard.route){
            Dashboard(navController = navController)
        }

        composable(route = Screens.Welcome.route){
            WelcomeView(navController = navController)
        }
    }
}
