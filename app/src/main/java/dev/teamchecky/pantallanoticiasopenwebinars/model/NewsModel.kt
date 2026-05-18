package dev.teamchecky.pantallanoticiasopenwebinars.model

data class NewsModel (
    val id: Long,
    val title: String,
    val description: String,
    val date: String,
    val imageUrl: String,
    val author: String
)