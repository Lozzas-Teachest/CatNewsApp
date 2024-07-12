package com.example.catnews.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.catnews.R
import com.example.catnews.adapter.NewsIndexCustomAdapter
import com.example.catnews.CatNewsApplication
import com.example.catnews.json_parser.JsonParser
import javax.inject.Inject

class IndexActivity: AppCompatActivity() {

    @Inject
    lateinit var jsonParser: JsonParser

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as CatNewsApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.index_view)
        val jsonString = jsonParser.readJsonFromAssets(baseContext, "cat_news_index.json")
        val newsIndexData = jsonParser.parseJsonToModel(jsonString)
        val catNewsRecyclerView: RecyclerView = findViewById(R.id.newsfeed_recycler_view)
        val newsIndexCustomAdapter = NewsIndexCustomAdapter(newsIndexData, this)

        catNewsRecyclerView.adapter = newsIndexCustomAdapter

        catNewsRecyclerView.layoutManager = LinearLayoutManager(baseContext)
    }
}