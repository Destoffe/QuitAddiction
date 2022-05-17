package com.cringe.quitaddiction.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cringe.quitaddiction.Dashboard


@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = Screens.Dashboard.route){
        composable(route = Screens.Dashboard.route){
            Dashboard()
        }

        composable(route = Screens.Register.route){
            Dashboard()
        }
    }
}
