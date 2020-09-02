package com.reem.android.movie_review_task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_one)

        val review: Button = findViewById(R.id.review)
        review.setOnClickListener{
            val intent = Intent(this, ScreenTwo::class.java)
            startActivity(intent)

        }

    }
}