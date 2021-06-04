package com.example.travelling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.travelling.Adapters.RecentAdapter
import com.example.travelling.Model.Popular
import com.example.travelling.Model.Recent
import kotlinx.android.synthetic.main.activity_recent_detailed.*

class RecentDetailed : AppCompatActivity() {

    private lateinit var recent: Recent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recent_detailed)

        recent = intent.getParcelableExtra<Recent>(RecentAdapter.RECENT_KEY)!!

        rd_place_name.text = recent.placeName
        rd_date.text = recent.date
        rd_description.text = recent.description
        rd_rating.text = recent.rating
        rd_price.text = recent.price

        Glide.with(this).load(recent.images).into(rd_image)


    }
}