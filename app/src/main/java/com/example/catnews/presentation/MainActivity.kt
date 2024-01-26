package com.example.catnews.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.catnews.json_parser.JsonParser
import com.example.catnews.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jsonParser = JsonParser()
        val jsonString = jsonParser.readJsonFromAssets(baseContext, "cat_news_index.json")
        val newsIndexData = jsonParser.parseJsonToModel(jsonString)
//        val catDataSet = arrayOf("Cats are great", "cats rule", "buy a cat", "cat news", "Cats! A movie")
//        val catDescriptionData = arrayOf("Lorem ipsum dolor sit amet", "consectetur adipiscing elit", "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", "Description", "Description")
        val newsIndexCustomAdapter = NewsIndexCustomAdapter(newsIndexData)
        val catNewsRecyclerView: RecyclerView = findViewById(R.id.newsfeed_recycler_view)

        catNewsRecyclerView.adapter = newsIndexCustomAdapter

        catNewsRecyclerView.layoutManager = LinearLayoutManager(baseContext)
    }
}