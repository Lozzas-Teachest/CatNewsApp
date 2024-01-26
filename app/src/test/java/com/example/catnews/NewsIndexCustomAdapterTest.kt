package com.example.catnews

import com.example.catnews.json_parser.JsonParser
import com.example.catnews.model.Detail
import com.example.catnews.model.Links
import com.example.catnews.model.NewsArticleIndex
import com.example.catnews.model.NewsIndexItem
import com.example.catnews.model.UrlDetails
import com.example.catnews.presentation.NewsIndexCustomAdapter
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.kotlin.whenever

class NewsIndexCustomAdapterTest {

//    @Mock
//    lateinit var mockJsonParser: JsonParser

    @Mock
    lateinit var viewHolder: NewsIndexCustomAdapter.ViewHolder
    fun setup() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun onBindViewHolderSetsHeadlineAndTeaserText() {
        //arrange
        val newsArticleIndex = arrayOf(NewsArticleIndex("1", "story", "Headline", "Teaser text", "date", "date", Links(Detail(
            UrlDetails("", true, "")
        ), "text")))
        val newsIndexItem = NewsIndexItem(newsArticleIndex)
        //Mockito.`when`(mockJsonParser.parseJsonToModel(jsonTestString)).thenReturn(newsIndexItem)
        //act
        val newsIndexCustomAdapter = NewsIndexCustomAdapter(newsIndexItem)
        //call on bind view holdeer and then check that the viewholders text is correct
        //assert
    }

    companion object {
        const val jsonTestString = """{"data": [{"id":"1","type":"story","headline":"Story Headline","teaserText":"Story teaser text","creationDate":"2020-11-18T00:00:00Z","modifiedDate":"2020-11-19T00:00:00Z","teaserImage":{"_links":{"url":{"href":"","templated":true,"type":"image/jpeg"}},"accessibilityText":"Image content description"}}]}"""
    }
}