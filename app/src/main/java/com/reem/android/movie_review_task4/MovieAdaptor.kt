
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.reem.android.movie_review_task4.Movie
import com.reem.android.movie_review_task4.R


class MovieAdaptor(private val context: Context): RecyclerView.Adapter<MovieAdaptor.MovieViewHolder>() {

    private var movieList: List<Movie> = listOf()

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titletxt: TextView = itemView.findViewById(R.id.movie_name)
        var yeartxt: TextView = itemView.findViewById(R.id.movie_year)
        var image: ImageView = itemView.findViewById(R.id.movie_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.movie_item,
            parent, false
        )
        return MovieViewHolder(view)
    }

    fun setMovieListItems(movieList: List<Movie>){
        this.movieList = movieList;
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.titletxt.text = movieList[position].results[position].title
        holder.yeartxt.text = movieList[position].results[position].release_date


        Glide.with(context)
            .load("https://image.tmdb.org/t/p/w500/" + movieList[position].results[position].poster_path)
            .apply(
                RequestOptions().centerCrop().placeholder(R.drawable.loading_shape)
                    .error(R.drawable.loading_shape)
            ).into(holder.image)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}

