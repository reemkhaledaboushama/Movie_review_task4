package com.reem.android.movie_review_task4

import com.reem.android.movie_review_task4.RetMovie.getMovie
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetMovie {
    private var instance: Retrofit? = null

    fun getMovie(): Retrofit {
        if (instance == null)
            instance = Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/movie/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpClient().newBuilder().build())
                .build()

        return instance!!
    }


}
