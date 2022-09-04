package com.learn.bookreader.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.learn.bookreader.screens.SplashScreen
import com.learn.bookreader.screens.details.BookDetailScreen
import com.learn.bookreader.screens.home.ReaderHomeScreen
import com.learn.bookreader.screens.login.CreateAccountScreen
import com.learn.bookreader.screens.login.ReaderLoginScreen
import com.learn.bookreader.screens.search.ReaderSearcScreen
import com.learn.bookreader.screens.update.BookReaderUpdateScreen

@Composable
fun  ReaderNavigation() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = ReaderScreens.SplashScreen.name){
        composable(ReaderScreens.SplashScreen.name){
            SplashScreen(navController=navController)
        }

        composable(ReaderScreens.ReaderHomeScreen.name){
            ReaderHomeScreen(navController=navController)
        }

        composable(ReaderScreens.SearchScreen.name){
            ReaderSearcScreen(navController=navController)
        }

        composable(ReaderScreens.DetailsScreen.name){
            BookDetailScreen(navController=navController)
        }

        composable(ReaderScreens.UpdateScreen.name){
            BookReaderUpdateScreen(navController=navController)
        }

        composable(ReaderScreens.LoginScreen.name){
            ReaderLoginScreen(navController=navController)
        }

        composable(ReaderScreens.CreateAccountScreen.name){
            CreateAccountScreen(navController=navController)
        }
    }
}