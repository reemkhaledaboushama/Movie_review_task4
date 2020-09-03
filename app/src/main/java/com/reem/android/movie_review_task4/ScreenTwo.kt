package com.reem.android.movie_review_task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.movie_item.*
import kotlinx.android.synthetic.main.screen_two.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.reem.android.movie_review_task4.MovieAdaptor

class ScreenTwo : AppCompatActivity() {

    private val apiKey = "d78d306988042530d99e166c3cb00017"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_two)
        //main_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        main_recycler.adapter = MovieAdaptor(this)
        main_recycler.layoutManager = GridLayoutManager(this, 2)

        main_recycler.setHasFixedSize(true)
        val back: Button = findViewById(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this, ScreenOne::class.java)
            startActivity(intent)


        }
val ad: MovieAdaptor? = null
        val apiMovie: Call<List<Movie>> =
            APIMovie.create().getMovie("d78d306988042530d99e166c3cb00017", "en", 1)
        apiMovie.enqueue(object : Callback<List<Movie>> {
            override fun onResponse(call: Call<List<Movie>>, response: Response<List<Movie>>) {
                if (response?.body() != null)
                    ad?.setMovieListItems(response.body()!!)

            }

            override fun onFailure(call: Call<List<Movie>>, t: Throwable) {
                t.printStackTrace()
                Toast.makeText(
                    this@ScreenTwo,
                    "Error while getting Movies data",
                    Toast.LENGTH_LONG
                ).show()
            }
        })
    }
}



