package com.example.catnews.presentation

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.catnews.R
import com.example.catnews.json_parser.JsonParser

class IndexActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.index_view)
        val jsonParser = JsonParser()
        val jsonString = jsonParser.readJsonFromAssets(baseContext, "cat_news_index.json")
        val newsIndexData = jsonParser.parseJsonToModel(jsonString)
        val newsIndexCustomAdapter = NewsIndexCustomAdapter(newsIndexData)
        val catNewsRecyclerView: RecyclerView = findViewById(R.id.newsfeed_recycler_view)

        catNewsRecyclerView.adapter = newsIndexCustomAdapter

        catNewsRecyclerView.layoutManager = LinearLayoutManager(baseContext)

    }
}