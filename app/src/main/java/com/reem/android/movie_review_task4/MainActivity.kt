package com.reem.android.movie_review_task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val api: APIMovie by lazy {
            RetMovie.getMovie().create(APIMovie::class.java)
        }
        val apiKey = "d78d306988042530d99e166c3cb00017"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        api
            .getMovie( apiKey,"en",1)
            .enqueue(object : Callback<Movie> {
                override fun onResponse( call: Call<Movie>, response: Response<Movie>) {


                }
                override fun onFailure(call: Call<Movie>, t: Throwable) {

                }
            })





    }
}