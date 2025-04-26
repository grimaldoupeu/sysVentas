package pe.edu.upeu.sysventasjpc.ui.navigation

import androidx.compose.runtime.Composable
<<<<<<< HEAD
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
=======
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.runtime.getValue
@Composable
fun currentRoute(navController: NavHostController): String? {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        return navBackStackEntry?.destination?.route
>>>>>>> e7f4703 (crud)
}