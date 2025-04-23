package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FifthHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Find the ImageView by ID
        val addButton2 = findViewById<ImageView>(R.id.addButton2)

        // Set the OnClickListener for the ImageView
        addButton2.setOnClickListener {
            // Create an Intent to navigate to CartActivity
            val intent = Intent(this, SixthCartActivity::class.java)
            startActivity(intent)
        }
    }
}
