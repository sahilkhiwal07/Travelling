package com.example.travelling.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.travelling.RecentDetailed
import com.example.travelling.Model.Popular
import com.example.travelling.PopularDetailed
import com.example.travelling.R

class PopularAdapter(
    private val context: Context
) : ListAdapter<Popular, PopularAdapter.PopularHolder>(DIFF_ITEM_CALLBACK) {

    companion object {

        const val POPULAR_KEY = "POPULAR_KEY"

        val DIFF_ITEM_CALLBACK = object : DiffUtil.ItemCallback<Popular>() {
            override fun areItemsTheSame(oldItem: Popular, newItem: Popular): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Popular, newItem: Popular): Boolean {
                return oldItem == newItem
            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.popular, parent, false)
        return PopularHolder(view)
    }

    override fun onBindViewHolder(holder: PopularHolder, position: Int) {
        getItem(position)?.let { popular ->
            holder.placeName.text = popular.placeName
            holder.countryName.text = popular.countryName
            holder.price.text = popular.price
            holder.rating.text = popular.rating

            Glide.with(context).load(popular.images).into(holder.images)

            holder.singleItems.setOnClickListener {
                val intent = Intent(context, PopularDetailed::class.java)
                intent.putExtra(POPULAR_KEY, popular)
                context.startActivity(intent)
            }

        }
    }

    class PopularHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val images: AppCompatImageView = itemView.findViewById(R.id.popular_image)
        val placeName: AppCompatTextView = itemView.findViewById(R.id.popular_place_Name)
        val countryName: AppCompatTextView = itemView.findViewById(R.id.popular_country_Name)
        val price: AppCompatTextView = itemView.findViewById(R.id.popular_price)
        val rating: AppCompatTextView = itemView.findViewById(R.id.p_rating)
        val singleItems: CardView = itemView.findViewById(R.id.cardView)
    }


}