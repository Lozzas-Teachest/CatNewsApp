package com.example.catnews.model

import java.util.Date

data class Story (
    val id: String,
    val headline: String,
    val heroImage: HeroImage,
    val creationDate: Date,
    val modifiedDate: Date,
    val contents: Array<Content>
)

data class HeroImage(
    val imageUrl: String,
    val accessibilityText: String
)

data class Content(
    val type: String,
    val text: String
)
