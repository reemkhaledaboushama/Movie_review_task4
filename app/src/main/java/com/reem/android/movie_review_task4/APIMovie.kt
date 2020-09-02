package com.reem.android.movie_review_task4

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface APIMovie {
//https://api.themoviedb.org/3/movie/popular?api_key=d78d306988042530d99e166c3cb00017&language=en-US&page=1

    @GET("popular?")
    fun getMovie(
        @Query("api_key") apiKey: String,
        @Query("language") lang: String,
        @Query("page") page: Int
    ): Call<Movie>


}

