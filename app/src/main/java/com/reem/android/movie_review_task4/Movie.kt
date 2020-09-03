package com.reem.android.movie_review_task4

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("results")
    val results: List<Res>
)


data class Res(
    @SerializedName("popularity")
    val popularity: Double,

    @SerializedName("poster_path")
    val poster_path: String,

    @SerializedName("adult")
    val adult: Boolean,

    @SerializedName("original_language")
    val original_language: String = "en",

    @SerializedName("original_title")
    val original_title: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("release_date")
    val release_date: String
)