package com.learn.bookreader.navigation

import com.learn.bookreader.screens.details.BookDetailScreen
import com.learn.bookreader.screens.details.BookDetailsScreen
import com.learn.bookreader.screens.home.ReaderHomeScreen
import java.lang.IllegalArgumentException

enum class ReaderScreens{
    SplashScreen,
    LoginScreen,
    CreateAccountScreen,
    ReaderHomeScreen,
    SearchScreen,
    DetailsScreen,
    UpdateScreen,
    ReaderStatsScreen,


    companion object {
        fun fromRoute(route:String) :ReaderScreens
            = when(route?.substringBefore("/")){
                SplashScreen.name -> SplashScreen
                LoginScreen.name -> LoginScreen
                CreateAccountScreen.name -> CreateAccountScreen
                SearchScreen.name -> SearchScreen
                DetailsScreen.name -> DetailsScreen
                ReaderHomeScreen.name -> ReaderHomeScreen
                UpdateScreen.name -> UpdateScreen
                ReaderStatsScreen.name -> ReaderStatsScreen
                null -> ReaderHomeScreen
                else -> throw IllegalArgumentException("This route is not recogniged")

            }
    }
}