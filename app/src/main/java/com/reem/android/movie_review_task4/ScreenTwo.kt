package com.reem.android.movie_review_task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.screen_two.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ScreenTwo : AppCompatActivity() {


    lateinit var recyclerView: RecyclerView
    lateinit var recyclerAdapter: MovieAdapter
    private val apiKey = "d78d306988042530d99e166c3cb00017"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_two)
        recyclerView = findViewById(R.id.main_recycler)
        recyclerAdapter = MovieAdapter(this)
        main_recycler.layoutManager = GridLayoutManager(this, 2)
        main_recycler.adapter = recyclerAdapter
        main_recycler.setHasFixedSize(true)
        val back: Button = findViewById(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            val apiInterface = APIMovie.create().getMovie(apiKey,"en-US",1)


            apiInterface.enqueue( object : Callback<List<Movie>>{
                override fun onResponse(call: Call<List<Movie>>?, response: Response<List<Movie>>?) {

                    if(response?.body() != null)
                        recyclerAdapter.setMovieListItems(response.body()!!)
                }

                override fun onFailure(call: Call<List<Movie>>?, t: Throwable?) {

                }
            })


        }


    }




    }


