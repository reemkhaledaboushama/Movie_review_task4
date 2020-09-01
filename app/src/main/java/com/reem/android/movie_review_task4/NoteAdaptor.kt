package com.reem.android.movie_review_task4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NotesAdapter(private val notesList: List<Film>) : RecyclerView.Adapter<NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val noteView = layoutInflater.inflate(R.layout.screen_twoo , parent , false)
        return NoteViewHolder(noteView)
    }


    override fun getItemCount(): Int {
        return notesList.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {

        val note = notesList[position]
        holder.movieImage.setImageResource(note.imagee)
        holder.movieName.text = note.namee
        holder.moviegenre.text = note.genree
        holder.movierating.text = note.ratingg
    }
}