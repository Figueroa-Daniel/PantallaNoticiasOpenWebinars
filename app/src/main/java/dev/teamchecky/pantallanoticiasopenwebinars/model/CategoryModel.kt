package dev.teamchecky.pantallanoticiasopenwebinars.model

/**
 * Modelo que representa una categoría de noticias.
 * @author Daniel Figueroa
 */
data class CategoryModel(
    val id: Long,
    val title: String,
    val items: List<NewsModel>
)
