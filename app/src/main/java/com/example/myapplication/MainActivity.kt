package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val id: Int = 10
    val name: String = "dinesh"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.next_button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("id", id)
            intent.putExtra("name", "dinesh")

            startActivity(intent)
        }

        val google_button = findViewById<Button>(R.id.google_button)
        val queryUrl:Uri = Uri.parse("https://www.google.com")
        google_button.setOnClickListener {
            val intent2 = Intent(Intent.ACTION_VIEW, queryUrl)
            startActivity(intent2)
        }
    }
}