package com.example.catnews.presentation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.catnews.R

class StoryPageActivity: AppCompatActivity() {

    private val storyViewModel: StoryActivityViewModel = StoryActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.story_page_view)

        val data = storyViewModel.loadStoryFromJson(this)
        val headline: TextView = findViewById(R.id.storyHeadlineTextview)
        headline.text = data.headline

        val storyContent: TextView = findViewById(R.id.storyContentTextView)
        storyContent.text = data.contents[0].text
    }

    override fun onStart() {
        super.onStart()
        storyViewModel.handleUserClickingBackButton(findViewById(R.id.storyBackButton), this)
    }
}
