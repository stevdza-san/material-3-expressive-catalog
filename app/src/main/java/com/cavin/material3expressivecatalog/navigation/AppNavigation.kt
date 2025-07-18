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
package com.cavin.material3expressivecatalog.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cavin.material3expressivecatalog.components.bottomappbar.bottomAppBarNavGraph
import com.cavin.material3expressivecatalog.components.buttongroup.groupButtonNavGraph
import com.cavin.material3expressivecatalog.components.buttons.buttonNavGraph
import com.cavin.material3expressivecatalog.components.fab.fabMenuNavGraph
import com.cavin.material3expressivecatalog.components.floatingtoolbar.floatingToolBarNavGraph
import com.cavin.material3expressivecatalog.components.largefab.largeFabNavGraph
import com.cavin.material3expressivecatalog.components.navigationrail.navigationRailNavGraph
import com.cavin.material3expressivecatalog.components.progressindicators.progressIndicatorNavGraph
import com.cavin.material3expressivecatalog.components.splitbutton.splitButtonNavGraph
import com.cavin.material3expressivecatalog.components.verticalfloatingtoolbar.verticalFloatingToolBarNavGraph
import com.cavin.material3expressivecatalog.components.widenavigationrail.wideNavigationRailNavGraph
import com.cavin.material3expressivecatalog.home.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        startDestination = Routes.HomeRoute,
        navController = navController
    ) {
        composable<Routes.HomeRoute> {
            HomeScreen(
                onNavigateToButtonGroup = { navController.navigate(ButtonGroupRoutes.ListingRoute) },
                onNavigateToProgressIndicator = {
                    navController.navigate(
                        ProgressIndicatorRoutes.ListingRoute,
                    )
                },
                onNavigateToButtonRoute = { navController.navigate(ButtonRoutes.ButtonRoute) },
                onNavigateToBottomAppBarRoute = {
                    navController.navigate(
                        BottomApBarRoutes.ListingRoute,
                    )
                },
                onNavigateToFabMenuRoute = { navController.navigate(FabMenuRoutes.FabMenuRoute) },
                onNavigateToFloatingToolBarRoute = {
                    navController.navigate(
                        FloatingToolBarRoutes.ListingRoute,
                    )
                },
                onNavigateToLargeFabRoute = {
                    navController.navigate(
                        LargeFabRoutes.ListingRoute,
                    )
                },
                onNavigateToNavigationRailRoute = {
                    navController.navigate(
                        NavigationRailRoutes.ListingRoute,
                    )
                },
                onNavigateToSplitButtonRoute = {
                    navController.navigate(
                        SplitButtonRoutes.ListingRoute,
                    )
                },
                onNavigateToVerticalFloatingToolbarRoute = {
                    navController.navigate(
                        VerticalFloatingToolBarRoutes.ToolbarRoute,
                    )
                },
                onNavigateToWideNavigationRailRoute = {
                    navController.navigate(
                        WideNavigationRailRoutes.ToolbarRoute,
                    )
                },
            )
        }

        groupButtonNavGraph(navController)

        progressIndicatorNavGraph(navController)

        buttonNavGraph(navController)

        bottomAppBarNavGraph(navController)

        fabMenuNavGraph(navController)

        floatingToolBarNavGraph(navController)

        largeFabNavGraph(navController)

        navigationRailNavGraph(navController)

        splitButtonNavGraph(navController)

        verticalFloatingToolBarNavGraph()

        wideNavigationRailNavGraph()
    }
}
