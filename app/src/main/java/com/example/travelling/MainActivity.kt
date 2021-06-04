package com.example.travelling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.travelling.Adapters.PopularAdapter
import com.example.travelling.Adapters.RecentAdapter
import com.example.travelling.AllData.Popular
import com.example.travelling.AllData.Recent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recentAdapter: RecentAdapter
    private lateinit var popularAdapter: PopularAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getRecentAdapter()
        getPopularAdapter()

        see_all_recent.setOnClickListener {
            val intent = Intent(this, RecentlyVisited::class.java)
            startActivity(intent)
        }


    }

    private fun getPopularAdapter() {
        popularAdapter = PopularAdapter(this)
        popular_recyclerView.adapter = popularAdapter
        popular_recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        popularAdapter.submitList(Popular.popularList)
    }

    private fun getRecentAdapter() {
        recentAdapter = RecentAdapter(this)
        recyclerView.adapter = recentAdapter
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recentAdapter.submitList(Recent.recentList)
    }


}