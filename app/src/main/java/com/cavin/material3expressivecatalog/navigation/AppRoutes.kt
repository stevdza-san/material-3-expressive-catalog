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

import kotlinx.serialization.Serializable

sealed interface Routes {
    @Serializable
    data object HomeRoute : Routes
}

sealed interface ButtonGroupRoutes :
    Routes
{
    @Serializable
    data object ListingRoute : ButtonGroupRoutes

    @Serializable
    data object ButtonGroupRoute : ButtonGroupRoutes

    @Serializable
    data object ConnectedButtonGroupRoute : ButtonGroupRoutes
}

sealed interface ProgressIndicatorRoutes :
    Routes
{
    @Serializable
    data object ProgressIndicatorRoute : ProgressIndicatorRoutes

    @Serializable
    data object RefreshIndicatorRoute : ProgressIndicatorRoutes

    @Serializable
    data object ListingRoute : ProgressIndicatorRoutes
}

sealed interface ButtonRoutes :
    Routes
{
    @Serializable
    data object ButtonRoute : ButtonRoutes
}

sealed interface FabMenuRoutes :
    Routes
{
    @Serializable
    data object FabMenuRoute : FabMenuRoutes
}

sealed interface BottomApBarRoutes :
    Routes
{
    @Serializable
    data object ListingRoute : BottomApBarRoutes

    @Serializable
    data object Variant1Route : BottomApBarRoutes

    @Serializable
    data object Variant2Route : BottomApBarRoutes

    @Serializable
    data object Variant3Route : BottomApBarRoutes

    @Serializable
    data object Variant4Route : BottomApBarRoutes
}

sealed interface FloatingToolBarRoutes :
    Routes
{
    @Serializable
    data object ListingRoute : FloatingToolBarRoutes

    @Serializable
    data object Variant1Route : FloatingToolBarRoutes

    @Serializable
    data object Variant2Route : FloatingToolBarRoutes
}

sealed interface LargeFabRoutes :
    Routes
{
    @Serializable
    data object ListingRoute : LargeFabRoutes

    @Serializable
    data object Variant1Route : LargeFabRoutes

    @Serializable
    data object Variant2Route : LargeFabRoutes
}

sealed interface NavigationRailRoutes :
    Routes
{
    @Serializable
    data object ListingRoute : NavigationRailRoutes

    @Serializable
    data object Variant1Route : NavigationRailRoutes

    @Serializable
    data object Variant2Route : NavigationRailRoutes
}

sealed interface SplitButtonRoutes :
    Routes
{
    @Serializable
    data object ListingRoute : SplitButtonRoutes

    @Serializable
    data object Variant1Route : SplitButtonRoutes

    @Serializable
    data object Variant2Route : SplitButtonRoutes

    @Serializable
    data object Variant3Route : SplitButtonRoutes
}

sealed interface VerticalFloatingToolBarRoutes :
    Routes
{

    @Serializable
    data object ToolbarRoute : VerticalFloatingToolBarRoutes
}

sealed interface WideNavigationRailRoutes :
    Routes
{

    @Serializable
    data object ToolbarRoute : WideNavigationRailRoutes
}
