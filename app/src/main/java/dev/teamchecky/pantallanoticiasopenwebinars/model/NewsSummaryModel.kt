package dev.teamchecky.pantallanoticiasopenwebinars.model

/**
 * Modelo que agrupa toda la información necesaria para la pantalla de noticias.
 * @author Daniel Figueroa
 */
data class NewsSummaryModel (
    val headerNews: NewsModel,
    val categories: List<CategoryModel>,
    val weather: WeatherModel,

)
