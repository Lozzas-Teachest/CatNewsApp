package com.example.catnews

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.catnews.model.NewsIndexItem

class NewsIndexCustomAdapter(private val newsIndexItem: List<NewsIndexItem>)
    : RecyclerView.Adapter<NewsIndexCustomAdapter.ViewHolder>(){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textNewsItemHeading: TextView
        val textNewsItemDescription: TextView
        val newsItemCard: CardView

        init {
            textNewsItemHeading = view.findViewById(R.id.news_item_heading)
            textNewsItemDescription = view.findViewById(R.id.news_item_description)
            newsItemCard = view.findViewById(R.id.recycler_card_view_item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textNewsItemHeading.text = newsIndexItem[position].data[position].headline
        holder.textNewsItemDescription.text = newsIndexItem[position].data[position].teaserText
        holder.newsItemCard.setOnClickListener {
            val intent = Intent(holder.itemView.context, StoryPageActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = newsIndexItem.size
}