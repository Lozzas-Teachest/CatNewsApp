package com.example.catnews.model

data class NewsArticleIndex(
    val id: String,
    val type: String,
    val headline: String,
    val teaserText: String,
    val creationDate: String,
    val teaserImage: Links,
)
