package com.example.catnews.presentation

import android.content.Intent
import com.example.catnews.model.NewsIndexItem

class NewsIndexAdapterUtility {
    fun insertAdvert(holder: NewsIndexCustomAdapter.ViewHolder, newsIndexItem: NewsIndexItem, position: Int) {
        if (newsIndexItem.data[position].type == "advert") {
            holder.textNewsItemHeading.text = newsIndexItem.data[position].type
        }
    }

    fun moveUserToStoryPageOnClick(holder: NewsIndexCustomAdapter.ViewHolder) {
        holder.newsItemCard.setOnClickListener {
            val intent = Intent(holder.itemView.context, StoryPageActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }
}