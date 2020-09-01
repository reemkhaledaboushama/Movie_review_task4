package com.reem.android.movie_review_task4

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.movie_item.view.*
import kotlinx.android.synthetic.main.movie_item.view.*
import kotlinx.android.synthetic.main.screen_twoo.view.*

class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val movieImage : ImageView = itemView.movieposter
    val movieName : TextView = itemView.moviename
    val movierating : TextView = itemView.rating
    val moviegenre: TextView=itemView.genre

}