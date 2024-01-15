package com.example.catnews.model

data class Links(
    val _links: Detail
)

data class Detail(
    val url: UrlDetails
)

data class UrlDetails(
    val href: String,
    val templated: Boolean,
    val type: String
)
