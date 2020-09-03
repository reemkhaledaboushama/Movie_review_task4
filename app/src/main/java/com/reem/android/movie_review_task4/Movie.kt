package com.reem.android.movie_review_task4

import com.google.gson.annotations.SerializedName

data class Movie(
    val id: Int,    //not needed but done

    @SerializedName("poster_path")
    val image: String,

    val adult: Boolean,
    val popularity: Double,
    val vote_count: Int,
    val overview: String,
    val title:String,
    val original_language:String,
    val release_date: String


)