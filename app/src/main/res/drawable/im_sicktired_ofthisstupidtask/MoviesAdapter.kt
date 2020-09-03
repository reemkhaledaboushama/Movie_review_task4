package com.yomna.im_sicktired_ofthisstupidtask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.layout_movie.view.*

class MoviesAdapter(val movies : List<Movie>) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_movie, parent, false)
        )
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.view.textViewTitle.text = movie.title
        holder.view.textViewLanguage.text = movie.original_language
        holder.view.textView8.text = movie.release_date
        holder.view.textViewType.text = movie.overview
        holder.view.textViewLikePercent.text = "Popularity: "+ movie.popularity.toString()
        holder.view.textViewVotesCount.text = "Votes: " + movie.vote_count.toString()
        holder.view.textViewIsNew.visibility = if(movie.adult == true) View.VISIBLE else View.INVISIBLE

        Glide.with(holder.view.context)
            .load(movie.image)

            .into(holder.view.imageView)
    }


    class MovieViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}