package com.omarqataberi.blckgemchallenge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.omarqataberi.blckgemchallenge.modules.News


class NewsFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewManager = LinearLayoutManager(this@NewsFragment.activity)
        viewAdapter = NewsAdapter(getFakeNews())



        recyclerView = view.findViewById<RecyclerView>(R.id.news_recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
    //because API link not working this could be changed to an http request
    private fun getFakeNews(): Array<News> {
        return arrayOf(
            News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            ), News(
                "Omar Qataberi",
                "October 20, 2020",
                "The menu and magnifying glass (search icon) can be found in the Material.io website or added through android stusdio asset. They are only for visual preview and do not have any behaviour.",
                "Where Can You Find The Icons"
            )
        )
    }
}