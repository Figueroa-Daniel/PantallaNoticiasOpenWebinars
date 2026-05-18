package dev.teamchecky.pantallanoticiasopenwebinars.model

data class CategoryModel(
    val id: Long,
    val title: String,
    val items: List<NewsModel>
)