package com.omarqataberi.blckgemchallenge

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(1)

    }

    //called when the map icon clicked
    fun onMapIconClick(view: View) {
        changeFragment(2)
    }

    //called when the newspaper icon clicked
    fun onNewsIconClick(view: View) {
        changeFragment(1)
    }

    private fun changeFragment(fNumber:Int){
        val fragment: Fragment = if (fNumber == 1){
            news_button.setImageResource(R.drawable.news)
            map_button.setImageResource(R.drawable.map_icon_highlighted)

            NewsFragment()
        } else {
            news_button.setImageResource(R.drawable.news_highlighted)
            map_button.setImageResource(R.drawable.map_icon)

            MapsFragment()
        }

        val fm: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = fm.beginTransaction()
        transaction.replace(R.id.content_fragment, fragment)
        transaction.commit()
    }
}