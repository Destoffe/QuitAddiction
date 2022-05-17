package com.cringe.quitaddiction.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.cringe.quitaddiction.R

@Composable
fun BottomNav(navController: NavController) {
    val items = listOf(
        Screens.Dashboard,
        Screens.Welcome
    )

    BottomNavigation() {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach {
            BottomNavigationItem(
                icon = {
                    Icon(
                        painterResource(id = R.drawable.ic_home_24),
                        contentDescription = "Home"
                    )
                },
                label = {
                    Text(
                        text = "home",
                        fontSize = 9.sp
                    )
                },
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == it.route,
                onClick = {
                    navController.navigate(it.route){
                        restoreState = true
                    }
                },
            )

        }
    }


}