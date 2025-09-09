package com.quirozsolutions.gestordeinventario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import com.quirozsolutions.gestordeinventario.ui.theme.GestorDeInventarioTheme
import androidx.navigation.compose.rememberNavController



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestorDeInventarioTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = AppRoutes.MAIN_SCREEN
                )
                {
                    appNavigation(navController)
                }

            }
        }
    }
}

