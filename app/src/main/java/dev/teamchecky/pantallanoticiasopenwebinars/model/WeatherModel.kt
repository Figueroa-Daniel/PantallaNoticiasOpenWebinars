package dev.teamchecky.pantallanoticiasopenwebinars.model

data class WeatherModel(
    val type: WeatherConditionType,
    val temperature: Int,
    val description: String
)