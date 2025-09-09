package com.quirozsolutions.gestordeinventario.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

import com.quirozsolutions.gestordeinventario.ui.screens.MainScreen


object AppRoutes {
const val MAIN_SCREEN = "main_screen"
}

fun NavGraphBuilder.appNavigation(navController: NavController){
    composable(AppRoutes.MAIN_SCREEN) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            MainScreen(navController)
        }
    }
}