package com.reem.android.movie_review_task4

data class Movie (val popularity :Double,
val poster_path: String,
val adult :Boolean,
val original_language :String = "en",
val original_title :String ,
val title :String,
val overview :String ,
val release_date : String)