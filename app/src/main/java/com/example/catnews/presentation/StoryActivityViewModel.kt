package com.example.catnews.presentation

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.catnews.R
import com.example.catnews.json_parser.JsonParser
import com.example.catnews.model.NewsIndexItem

class StoryActivityViewModel {

    private val jsonParser: JsonParser = JsonParser()

    fun handleUserClickingBackButton(button: View, context: Context) {
        button.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }

    fun loadStoryFromJson(context: Context): NewsIndexItem {
        val jsonString = jsonParser.readJsonFromAssets(context, "sample_story1.json")
        return jsonParser.parseJsonToModel(jsonString)
    }
}
