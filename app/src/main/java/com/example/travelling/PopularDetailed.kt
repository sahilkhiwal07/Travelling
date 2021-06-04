package com.example.travelling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.travelling.Adapters.PopularAdapter
import com.example.travelling.Model.Popular
import kotlinx.android.synthetic.main.activity_popular_detailed.*
import kotlinx.android.synthetic.main.activity_recent_detailed.*
import kotlinx.android.synthetic.main.activity_recent_detailed.rd_description

class PopularDetailed : AppCompatActivity() {

    private lateinit var popular: Popular

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popular_detailed)

        popular = intent.getParcelableExtra<Popular>(PopularAdapter.POPULAR_KEY)!!

        pd_place_name.text = popular.placeName
        pd_date.text = popular.date
        pd_description.text = popular.description
        pd_rating.text = popular.rating
        pd_price.text = popular.price

        Glide.with(this).load(popular.images).into(pd_image)
    }
}