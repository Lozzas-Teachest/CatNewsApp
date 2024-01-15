package com.example.catnews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catDataSet = arrayOf("Cats are great", "cats rule", "buy a cat", "cat news", "Cats! A movie")
        val newsIndexCustomAdapter = NewsIndexCustomAdapter(catDataSet)

        val catNewsRecyclerView: RecyclerView = findViewById(R.id.newsfeed_recycler_view)

        catNewsRecyclerView.adapter = newsIndexCustomAdapter

        catNewsRecyclerView.layoutManager = LinearLayoutManager(baseContext)
    }
}