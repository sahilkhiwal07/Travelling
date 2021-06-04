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
import com.example.travelling.Model.Recent
import com.example.travelling.R

class RecentAdapter(
    private val context: Context
) : ListAdapter<Recent, RecentAdapter.RecentHolder>(DIFF_ITEM_CALLBACK) {

    companion object {
        const val RECENT_KEY = "RECENT_KEY"

        val DIFF_ITEM_CALLBACK = object : DiffUtil.ItemCallback<Recent>() {
            override fun areItemsTheSame(oldItem: Recent, newItem: Recent): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Recent, newItem: Recent): Boolean {
                return oldItem == newItem
            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.recent, parent, false)
        return RecentHolder(view)
    }

    override fun onBindViewHolder(holder: RecentHolder, position: Int) {
        getItem(position)?.let { recent ->

            holder.placeName.text = recent.placeName
            holder.countryName.text = recent.countryName
            holder.price.text = recent.price

            Glide.with(context).load(recent.images).into(holder.image)

            holder.singleItems.setOnClickListener {
                val intent = Intent(context, RecentDetailed::class.java)
                intent.putExtra(RECENT_KEY,recent)
                context.startActivity(intent)
            }

        }
    }

    class RecentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image: AppCompatImageView = itemView.findViewById(R.id.recent_image)
        val placeName: AppCompatTextView = itemView.findViewById(R.id.recent_place_Name)
        val countryName: AppCompatTextView = itemView.findViewById(R.id.recent_country_Name)
        val price: AppCompatTextView = itemView.findViewById(R.id.recent_price)
        val singleItems: CardView = itemView.findViewById(R.id.singleItems)

    }

}