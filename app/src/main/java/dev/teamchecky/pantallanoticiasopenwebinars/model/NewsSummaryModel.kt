package dev.teamchecky.pantallanoticiasopenwebinars.model

data class NewsSummaryModel (
    val headerNews: NewsModel,
    val categories: List<CategoryModel>,
    val weather: WeatherModel,

)