package com.example.catnews.presentation

import android.content.Context
import android.content.Intent
import android.view.View
import com.example.catnews.json_parser.JsonParser
import com.example.catnews.model.Story

class StoryActivityViewModel {

    private val jsonParser: JsonParser = JsonParser()

    fun handleUserClickingBackButton(button: View, context: Context) {
        button.setOnClickListener {
            val intent = Intent(context, IndexActivity::class.java)
            context.startActivity(intent)
        }
    }

    fun loadStoryFromJson(context: Context): Story {
        val jsonString = jsonParser.readJsonFromAssets(context, "sample_story1.json")
        return jsonParser.parseJsonToStory(jsonString)
    }
}
