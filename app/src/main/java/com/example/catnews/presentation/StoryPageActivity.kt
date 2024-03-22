package com.example.catnews.presentation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.catnews.R

class StoryPageActivity: AppCompatActivity() {

    private val storyViewModel: StoryActivityViewModel = StoryActivityViewModel()

    private val headlineText: TextView = findViewById(R.id.storyHeadlineTextview)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.story_page_view)
    }

    override fun onStart() {
        super.onStart()
        storyViewModel.handleUserClickingBackButton(findViewById(R.id.storyBackButton), this)
    }


}