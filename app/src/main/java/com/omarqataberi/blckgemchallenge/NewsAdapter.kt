package com.omarqataberi.blckgemchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.omarqataberi.blckgemchallenge.modules.News
import kotlinx.android.synthetic.main.item_news_card.view.*

class NewsAdapter(private val newsList: Array<News>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    class MyViewHolder(val mainView: View) : RecyclerView.ViewHolder(mainView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewsAdapter.MyViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news_card, parent, false) as ConstraintLayout

        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.mainView.author_text.text = newsList[position].author
        holder.mainView.news_text.text = newsList[position].story
        holder.mainView.title_text.text = newsList[position].title
        holder.mainView.date_text.text = newsList[position].date
        holder.mainView.news_image.setImageResource(R.mipmap.news_image)
        holder.mainView.user_image.setImageResource(R.mipmap.user_image)
    }

    override fun getItemCount() = newsList.size
}