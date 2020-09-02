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

        val back: Button= findViewById(R.id.back)
        back.setOnClickListener{
            val intent = Intent(this, ScreenOne::class.java)
            startActivity(intent)

        }
    }

    private fun getNotes(): List<Note> {
        val noteList = ArrayList<Note>()
        noteList.add(Note(R.drawable.fast1, "The Fast and the Furious", "2001"))
        noteList.add(Note(R.drawable.fast1, "2 Fast 2 Furious", "2003"))
        noteList.add(Note(R.drawable.fast1, "Turbo-Charged Prelude", "2003"))
        noteList.add(Note(R.drawable.fast1, "Fast and Furious: Tokyo Drift", "2006"))
        noteList.add(Note(R.drawable.fast1, "Fast and Furious 4", "2009"))
        noteList.add(Note(R.drawable.fast1, "Los Bandoleros", "2009"))
        noteList.add(Note(R.drawable.fast1, "Fast Five", "2011"))
        noteList.add(Note(R.drawable.fast1, "Fast and Furious 6", "2013"))
        noteList.add(Note(R.drawable.fast1, "Fast and Furious 7", "2105"))
        noteList.add(Note(R.drawable.fast1, "The Fate of the Furious", "2017"))
        noteList.add(Note(R.drawable.fast1, "Hobbs and Shaw", "2019"))
        noteList.add(Note(R.drawable.fast1, "Fast and Furious 9", "2021"))
        noteList.add(Note(R.drawable.fast1, "Fast and Furious 10", "2022"))
        return noteList

    }
}