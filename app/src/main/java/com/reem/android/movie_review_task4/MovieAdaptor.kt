package com.reem.android.movie_review_task4

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MovieAdapter(val context: Context) : RecyclerView.Adapter<MovieViewHolder>() {

    var movieList: List<Movie> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.screen_two, parent, false)
        return MovieViewHolder(view)
    }


    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {


        holder.movieName.text = movieList.get(position).results.get(position).title
        holder.movieYear.text = movieList.get(position).results.get(position)
            .release_date
        Glide.with(context).load(movieList.get(position).results.get(position).poster_path)
            .apply(RequestOptions().centerCrop())
            .into(holder.movieImage)
    }

    fun setMovieListItems(movieList: List<Movie>) {
        this.movieList = movieList
        notifyDataSetChanged()
    }

}