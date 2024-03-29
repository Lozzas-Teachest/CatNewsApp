package com.example.catnews.json_parser

import android.content.Context
import com.example.catnews.model.NewsIndexItem
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class JsonParser {

    fun readJsonFromAssets(context: Context, fileName: String): String {
        return context.assets.open(fileName).bufferedReader().use { it.readText() }
    }

    fun parseJsonToModel(jsonString: String): NewsIndexItem {
        val gson = Gson()
        return gson.fromJson(jsonString, object : TypeToken<NewsIndexItem>(){}.type)
    }
}