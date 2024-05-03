package com.example.catnews.model

import java.util.Date

data class Story (
    val id: String,
    val headline: String,
    val heroImage: HeroImage,
    val creationDate: Date,
    val modifiedDate: Date,
    val contents: Array<Content>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Story

        if (id != other.id) return false
        if (headline != other.headline) return false
        if (heroImage != other.heroImage) return false
        if (creationDate != other.creationDate) return false
        if (modifiedDate != other.modifiedDate) return false
        if (!contents.contentEquals(other.contents)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + headline.hashCode()
        result = 31 * result + heroImage.hashCode()
        result = 31 * result + creationDate.hashCode()
        result = 31 * result + modifiedDate.hashCode()
        result = 31 * result + contents.contentHashCode()
        return result
    }
}

data class HeroImage(
    val imageUrl: String,
    val accessibilityText: String
)

data class Content(
    val type: String,
    val text: String
)
