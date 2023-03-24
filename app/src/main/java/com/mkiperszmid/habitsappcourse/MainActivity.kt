package com.mkiperszmid.habitsappcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.mkiperszmid.habitsappcourse.navigation.NavigationHost
import com.mkiperszmid.habitsappcourse.navigation.NavigationRoute
import com.mkiperszmid.habitsappcourse.ui.theme.HabitsAppCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HabitsAppCourseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavigationHost(
                        navHostController = navController,
                        startDestination = NavigationRoute.Onboarding
                    )
                }
            }
        }
    }
}
