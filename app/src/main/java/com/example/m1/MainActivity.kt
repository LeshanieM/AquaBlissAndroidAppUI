package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the explicitButton by ID
        val explicitButton = findViewById<Button>(R.id.explicitButton)

        // Set the OnClickListener to launch the LaunchActivity when clicked
        explicitButton.setOnClickListener {
            // Create an Intent to start LaunchActivity
            val explicitIntent = Intent(this, LaunchActivity::class.java)
            startActivity(explicitIntent)
        }
    }
}
