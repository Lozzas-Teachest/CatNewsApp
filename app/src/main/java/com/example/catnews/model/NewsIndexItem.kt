package com.example.catnews.model

data class NewsIndexItem(
    val title: String,
    val data: Array<NewsArticleIndex>,
    val accessibilityText: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NewsIndexItem

        if (title != other.title) return false
        if (!data.contentEquals(other.data)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + data.contentHashCode()
        return result
    }
}
