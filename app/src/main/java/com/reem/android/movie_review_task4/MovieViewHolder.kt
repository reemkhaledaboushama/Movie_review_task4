package com.reem.android.movie_review_task4

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val movieImage: ImageView = itemView.movie_image
    val movieName: TextView = itemView.movie_name
    val movieYear: TextView = itemView.movie_year

}