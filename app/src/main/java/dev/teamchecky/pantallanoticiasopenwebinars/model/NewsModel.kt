package dev.teamchecky.pantallanoticiasopenwebinars.model

/**
 * Modelo que representa una noticia individual.
 * @author Daniel Figueroa
 */
data class NewsModel (
    val id: Long,
    val title: String,
    val description: String,
    val date: String,
    val imageUrl: String,
    val author: String
)
