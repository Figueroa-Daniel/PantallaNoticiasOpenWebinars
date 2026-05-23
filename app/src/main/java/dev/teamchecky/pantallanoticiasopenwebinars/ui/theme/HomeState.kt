package dev.teamchecky.pantallanoticiasopenwebinars.ui.theme

import dev.teamchecky.pantallanoticiasopenwebinars.model.NewsSummaryModel

sealed class HomeState {
    data class Data(val newSumary: NewsSummaryModel) : HomeState()
    data object Loading : HomeState()


}