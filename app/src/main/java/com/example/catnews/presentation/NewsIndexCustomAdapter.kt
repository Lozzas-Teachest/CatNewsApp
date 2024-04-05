package com.example.catnews.presentation

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.catnews.R
import com.example.catnews.model.NewsIndexItem
import kotlin.coroutines.coroutineContext

class NewsIndexCustomAdapter(private val newsIndexItem: NewsIndexItem)
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

    private val newsIndexAdapterUtility = NewsIndexAdapterUtility()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textNewsItemHeading.text = newsIndexItem.data[position].headline
        holder.textNewsItemDescription.text = newsIndexItem.data[position].teaserText
        //setUpOnClickListener(holder)
        newsIndexAdapterUtility.insertAdvert(holder, newsIndexItem, position)
    }

    override fun getItemCount() = newsIndexItem.data.size

//    private fun setUpOnClickListener(holder: ViewHolder) {
//        holder.itemView.setOnClickListener {
//            val intent = Intent(it.context, StoryPageActivity::class.java)
//            it.context.startActivity(intent)
//        }
//    }
}
