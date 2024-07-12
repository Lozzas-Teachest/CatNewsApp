package com.example.catnews.adapter

import android.content.Context
import android.content.Intent
import com.example.catnews.activity.StoryPageActivity
import com.example.catnews.model.NewsIndexItem

class NewsIndexAdapterUtility {
    fun insertAdvert(holder: NewsIndexCustomAdapter.ViewHolder, newsIndexItem: NewsIndexItem, position: Int) {
        if (newsIndexItem.data[position].type == "advert") {
            holder.textNewsItemHeading.text = newsIndexItem.data[position].type
        }
    }

    fun moveUserToStoryPageOnClick(holder: NewsIndexCustomAdapter.ViewHolder, context: Context) {
        holder.newsItemCard.setOnClickListener {
            val intent = Intent(context, StoryPageActivity::class.java)
            context.startActivity(intent)
        }
    }
}