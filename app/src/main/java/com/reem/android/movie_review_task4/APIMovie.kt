package com.reem.android.movie_review_task4

import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


interface APIMovie {
//https://api.themoviedb.org/3/movie/popular?api_key=d78d306988042530d99e166c3cb00017&language=en-US&page=1

    @GET("popular?")

    public fun getMovie(
        @Query("api_key") apiKey: String,
        @Query("language") lang: String,
        @Query("page") page: Int = 1
    ): Call<List<Movie>>

    companion object {

        var BASE_URL = "https://api.themoviedb.org/3/movie/"
        fun create() : APIMovie {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(APIMovie::class.java)

        }
    }
}





