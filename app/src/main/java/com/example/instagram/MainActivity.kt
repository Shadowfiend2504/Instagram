package com.example.instagram

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Abrir Google al pulsar cualquier historia
        val openGoogle = View.OnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent)
        }

        val storyAdd: ImageButton? = findViewById(R.id.story_add_btn)
        val story1: ImageView? = findViewById(R.id.story_1)
        val story2: ImageView? = findViewById(R.id.story_2)
        val story3: ImageView? = findViewById(R.id.story_3)

        storyAdd?.setOnClickListener(openGoogle)
        story1?.setOnClickListener(openGoogle)
        story2?.setOnClickListener(openGoogle)
        story3?.setOnClickListener(openGoogle)
    }
}
