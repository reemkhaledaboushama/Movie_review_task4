package com.reem.android.movie_review_task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.screen_two.*

class ScreenTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_two)
        //main_recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        main_recycler.layoutManager = GridLayoutManager(this, 2)
        main_recycler.adapter = NotesAdapter(getNotes())
        main_recycler.setHasFixedSize(true)
        val back: Button= findViewById(R.id.back)
        back.setOnClickListener{
            val intent = Intent(this, ScreenOne::class.java)
            startActivity(intent)

        }
    }

    private fun getNotes(): List<Film> {
        val noteList = ArrayList<Film>()
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))
        noteList.add(Film(R.drawable.the_shack, "The Shack", "4.8", "Drama"))

        return noteList

    }
}