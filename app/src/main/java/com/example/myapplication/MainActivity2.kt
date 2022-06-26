package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle: Bundle? = intent.extras
        val name = bundle?.getString("name")
        val text2 = findViewById<TextView>(R.id.TextView2)
        text2.text = name.toString()
        val button2 = findViewById<Button>(R.id.home_button)
        button2.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}