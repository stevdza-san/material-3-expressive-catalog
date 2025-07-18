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
package com.cavin.material3expressivecatalog.components.splitbutton

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.cavin.material3expressivecatalog.navigation.SplitButtonRoutes

fun NavGraphBuilder.splitButtonNavGraph(navController: NavHostController) {
    composable<SplitButtonRoutes.ListingRoute> {
        SplitButtonListingScreen(
            onNavigateToExample = { route ->
                navController.navigate(route)
            },
            onNavigateBack = { navController.popBackStack() },
        )
    }

    composable<SplitButtonRoutes.Variant1Route> {
        SplitButtonVariant1()
    }

    composable<SplitButtonRoutes.Variant2Route> {
        SplitButtonVariant2()
    }

    composable<SplitButtonRoutes.Variant3Route> {
        SplitButtonVariant3()
    }
}
