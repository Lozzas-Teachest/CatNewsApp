package com.example.catnews

import android.widget.TextView
import com.example.catnews.json_parser.JsonParser
import com.example.catnews.presentation.NewsIndexAdapterUtility
import com.example.catnews.presentation.NewsIndexCustomAdapter
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.mock
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
        val textView: TextView = mock()
        val newsIndexItem = jsonParser.parseJsonToModel(jsonTestString)
        Mockito.`when`(textView.text).thenReturn(("advert"))
        Mockito.`when`(testViewHolder.textNewsItemHeading).thenReturn((textView))
        //act
        newsIndexAdapterUtility.insertAdvert(testViewHolder, newsIndexItem, 0)
        //assert
        assertEquals(testViewHolder.textNewsItemHeading.text, newsIndexItem.data[0].type)
    }

    companion object {
        const val jsonTestString = """{"data": [{"type": "advert", "url": "advert/url"}]}"""
    }

}