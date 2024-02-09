package com.example.catnews

import com.example.catnews.json_parser.JsonParser
import org.junit.Test

import org.junit.Assert.assertEquals

class JsonParserTest {

    private var jsonParser: JsonParser = JsonParser()
    @Test
    fun parseJsonToNewsIndexItemTest() {
        //arrange
        //act
        val newsIndexItem = jsonParser.parseJsonToModel(jsonTestString)
        //assert
        assertEquals(newsIndexItem.data[0].headline, "Story Headline")
        assertEquals(newsIndexItem.data.size, 1)
    }

    companion object {
        const val jsonTestString = """{"data": [{"id":"1","type":"story","headline":"Story Headline","teaserText":"Story teaser text","creationDate":"2020-11-18T00:00:00Z","modifiedDate":"2020-11-19T00:00:00Z","teaserImage":{"_links":{"url":{"href":"","templated":true,"type":"image/jpeg"}},"accessibilityText":"Image content description"}}]}"""
    }
}
