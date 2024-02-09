package com.example.catnews

import com.example.catnews.json_parser.JsonParser
import com.example.catnews.presentation.NewsIndexAdapterUtility
import com.example.catnews.presentation.NewsIndexCustomAdapter
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations


class NewsIndexAdapterUtilityTest {

    private var newsIndexAdapterUtility = NewsIndexAdapterUtility()
    @Mock
    private lateinit var testViewHolder: NewsIndexCustomAdapter.ViewHolder

    private var jsonParser: JsonParser = JsonParser()

    @Before
    fun init() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun insertAdvertTest() {
        //arrange
        testViewHolder.textNewsItemHeading.text = "not advert"
        val newsIndexItem = jsonParser.parseJsonToModel(JsonParserTest.jsonTestString)
        //act
        newsIndexAdapterUtility.insertAdvert(testViewHolder, newsIndexItem, 1)
        //assert
        assertEquals(testViewHolder.textNewsItemHeading.text, "advert")
    }

    companion object {
        const val jsonTestString = """{"data": [{"id":"1","type":"story","headline":"Story Headline","teaserText":"Story teaser text","creationDate":"2020-11-18T00:00:00Z","modifiedDate":"2020-11-19T00:00:00Z","teaserImage":{"_links":{"url":{"href":"","templated":true,"type":"image/jpeg"}},"accessibilityText":"Image content description"}}]}",{
      "type": "advert",
      "url": "advert/url"
    },"""
    }

}