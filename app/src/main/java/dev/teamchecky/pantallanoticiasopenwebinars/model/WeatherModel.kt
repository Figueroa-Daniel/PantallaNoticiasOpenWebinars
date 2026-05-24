package dev.teamchecky.pantallanoticiasopenwebinars.model

/**
 * Modelo que representa la información meteorológica.
 * @author Daniel Figueroa
 */
data class WeatherModel(
    val type: WeatherConditionType,
    val temperature: Int,
    val description: String
)
