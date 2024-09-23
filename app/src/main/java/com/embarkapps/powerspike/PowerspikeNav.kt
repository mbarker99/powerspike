package com.embarkapps.powerspike

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.embarkapps.powerspike.common.Routes.SIGN_IN_SCREEN
import com.embarkapps.powerspike.common.Routes.SPLASH_SCREEN
import com.embarkapps.powerspike.presentation.signin.SignInScreen

@Composable
fun PowerspikeNav() {
    Surface(color = MaterialTheme.colorScheme.background) {
        val appState = rememberAppState()
        Scaffold { innerPadding ->
            NavHost(
                navController = appState.navController,
                startDestination = SIGN_IN_SCREEN,
                modifier = Modifier.padding(innerPadding)
            ) {
                calendarGraph(appState)
            }

        }

    }
}

@Composable
fun rememberAppState(navHostController: NavHostController = rememberNavController()) =
    remember(navHostController) {
        PowerspikeState(navHostController)
    }

fun NavGraphBuilder.calendarGraph(appState: PowerspikeState) {
    composable(SIGN_IN_SCREEN) {
        SignInScreen()
    }
}