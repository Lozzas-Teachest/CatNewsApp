package com.example.catnews.viewmodel

import android.content.Context
import android.content.Intent
import android.view.View
import com.example.catnews.json_parser.JsonParser
import com.example.catnews.model.Story
import com.example.catnews.activity.IndexActivity
import javax.inject.Inject

class StoryActivityViewModel @Inject constructor(private val jsonParser: JsonParser) {

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
