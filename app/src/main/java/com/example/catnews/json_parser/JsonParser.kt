package com.example.catnews.json_parser

import android.content.Context
import com.example.catnews.model.NewsIndexItem
import com.example.catnews.model.Story
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import javax.inject.Inject

class JsonParser @Inject constructor() {

    fun readJsonFromAssets(context: Context, fileName: String): String {
        return context.assets.open(fileName).bufferedReader().use { it.readText() }
    }

    fun parseJsonToModel(jsonString: String): NewsIndexItem {
        val gson = Gson()
        return gson.fromJson(jsonString, object : TypeToken<NewsIndexItem>(){}.type)
    }

    fun parseJsonToStory(jsonString: String): Story {
        val gson = Gson()
        return gson.fromJson(jsonString, object : TypeToken<Story>(){}.type)
    }
}