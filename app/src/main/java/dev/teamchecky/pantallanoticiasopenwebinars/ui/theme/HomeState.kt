package dev.teamchecky.pantallanoticiasopenwebinars.ui.theme

import dev.teamchecky.pantallanoticiasopenwebinars.model.NewsSummaryModel

/**
 * Representa los diferentes estados de la pantalla de inicio.
 * @author Daniel Figueroa
 */
sealed class HomeState {
    /**
     * Estado que contiene los datos de las noticias cargadas.
     * @author Daniel Figueroa
     */
    data class Data(val newSumary: NewsSummaryModel) : HomeState()

    /**
     * Estado que indica que la información se está cargando.
     * @author Daniel Figueroa
     */
    data object Loading : HomeState()
}
