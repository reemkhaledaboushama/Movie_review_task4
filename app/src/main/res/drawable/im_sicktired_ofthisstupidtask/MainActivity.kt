package com.yomna.im_sicktired_ofthisstupidtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MoviesApi().getMovies().enqueue(object : Callback<List<Movie>> {
            override fun onFailure(call: Call<List<Movie>>, t: Throwable) {
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<List<Movie>>, response: Response<List<Movie>>) {
                val movies = response.body()

                movies?.let {
                    showMovies(it)
                }

            }

        })
    }

    private fun showMovies(movies: List<Movie>) {
        recyclerViewMovies.layoutManager = LinearLayoutManager(this)
        recyclerViewMovies.adapter = MoviesAdapter(movies)
    }
}

/*val movies = listOf(
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015"),
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015"),
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015"),
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015"),
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015"),
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015"),
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015"),
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015"),
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015"),
    Movie(1,"",true,11170.25,150,"She saves the world","Captain America","en","22-7-2015")



)
recyclerViewMovies.layoutManager = LinearLayoutManager(this)
recyclerViewMovies.adapter = MoviesAdapter(movies)
}
}*/