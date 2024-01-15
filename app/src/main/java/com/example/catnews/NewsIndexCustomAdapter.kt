package com.example.catnews

import android.content.Intent
import android.provider.Telephony.Mms.Intents
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class NewsIndexCustomAdapter(private val dataSet: Array<String>, private val descriptionData: Array<String>)
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
        holder.textNewsItemHeading.text = dataSet[position]
        holder.textNewsItemDescription.text = descriptionData[position]
        holder.newsItemCard.setOnClickListener {
            val intent = Intent(holder.itemView.context, StoryPageActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataSet.size
}