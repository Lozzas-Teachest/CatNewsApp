package com.example.catnews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsIndexCustomAdapter(private val dataSet: Array<String>) : RecyclerView.Adapter<NewsIndexCustomAdapter.ViewHolder>(){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textNewsItem: TextView

        init {
            textNewsItem = view.findViewById(R.id.news_text_item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textNewsItem.text = dataSet[position]
    }

    override fun getItemCount() = dataSet.size
}