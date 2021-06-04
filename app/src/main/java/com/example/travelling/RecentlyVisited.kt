package com.example.travelling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.travelling.Adapters.RecentAdapter
import com.example.travelling.AllData.Recent
import kotlinx.android.synthetic.main.activity_recently_visited.*

class RecentlyVisited : AppCompatActivity() {

    private lateinit var recentAdapter: RecentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recently_visited)

        recentAdapter = RecentAdapter(this)
        rv_recyclerView.adapter = recentAdapter
        rv_recyclerView.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)
        recentAdapter.submitList(Recent.recentList)

    }
}