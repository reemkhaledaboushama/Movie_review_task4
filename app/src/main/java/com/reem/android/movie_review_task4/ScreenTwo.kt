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

class ScreenTwo : AppCompatActivity() {

    private val api: APIMovie by lazy {
        RetMovie.getMovie().create(APIMovie::class.java)
    }
    private val apiKey = "d78d306988042530d99e166c3cb00017"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_two)
        //main_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        main_recycler.layoutManager = GridLayoutManager(this, 2)
        main_recycler.adapter = NotesAdapter(getNotes())
        main_recycler.setHasFixedSize(true)
        val back: Button = findViewById(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this, ScreenOne::class.java)
            startActivity(intent)


        }
        requestMovies()
    }

        private fun requestMovies() {
            api.getMovie(apiKey, "en", 1).enqueue(object : Callback<Movie> {
                override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                    if (response.isSuccessful) {
                        val movieResponse = response.body()
                        bindMoviesData(movieResponse!!)
                    }
                }
                override fun onFailure(call: Call<Movie>, t: Throwable) {
                    t.printStackTrace()
                    Toast.makeText(
                        this@ScreenTwo,
                        "Error while getting Movies data",
                        Toast.LENGTH_LONG
                    ).show()
                }
            })
        }


        private fun bindMoviesData(movie: Movie) {
            if (movie.results.isNotEmpty()) {
                movie_name.text = movie.results.first().title
                movie_year.text = movie.results.first().release_date
                Glide.with(this).load("https://image.tmdb.org/t/p/w500/ ${movie.results.first().poster_path}").into(movie_image)
            }
        }
    }

    private fun getNotes(): List<Note> {
        val noteList = ArrayList<Note>()
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))
        noteList.add(Note(R.drawable.fast1, "Fast1", "2020"))


        return noteList

    }
