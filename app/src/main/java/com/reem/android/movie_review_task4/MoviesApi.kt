package com.reem.android.movie_review_task4

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.themoviedb.org/3/movie/popular?api_key=d78d306988042530d99e166c3cb00017&language=en-US&page=1

const val BASE_URL = "https://api.themoviedb.org/3/movie/"

interface MoviesApi {

    @GET("popular?")
    fun getMovies(/*@Query("api_key") apiKey: String,
                  @Query("language") lang: String,
                  @Query("page") page: Int*/) : Call<List<Movie>>

    companion object {
        operator fun invoke() : MoviesApi{
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MoviesApi::class.java)
        }
    }
}