/*
 * Designed and developed by Cavin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cavin.material3expressivecatalog.components.bottomappbar

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.cavin.material3expressivecatalog.navigation.BottomApBarRoutes
import com.cavin.material3expressivecatalog.ui.screens.ContentScreen

fun NavGraphBuilder.bottomAppBarNavGraph(navController: NavHostController) {
    composable<BottomApBarRoutes.ListingRoute> {
        BottomAppBarListingScreen(
            onNavigateToExample = { navController.navigate(it) },
            onNavigateBack = { navController.popBackStack() },
        )
    }

    composable<BottomApBarRoutes.Variant1Route> {
        ContentScreen {
            BottomAppBarVariant1()
        }
    }

    composable<BottomApBarRoutes.Variant2Route> {
        BottomAppBarVariant2()
    }

    composable<BottomApBarRoutes.Variant3Route> {
        BottomAppBarVariant3()
    }

    composable<BottomApBarRoutes.Variant4Route> {
        BottomAppBarVariant4()
    }
}
