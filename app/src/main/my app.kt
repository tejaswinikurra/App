package com.example.myapp

import android.os.Bundle
android.widget.Button
android.widget.Toast
androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aboutButton: Button = findViewById(R.id.about_button)
        val featuresButton: Button = findViewById(R.id.features_button)

        aboutButton.setOnClickListener {
            Toast.makeText(this, "This is a sample application built with Kotlin.", Toast.LENGTH_SHORT).show()
        }

        featuresButton.setOnClickListener {
            Toast.makeText(this, "Features: \n1. Feature 1\n2. Feature 2\n3. Feature 3", Toast.LENGTH_SHORT).show()
        }
    }
}
