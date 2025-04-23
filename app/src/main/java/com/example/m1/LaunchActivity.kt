package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        // Find the NextButton by ID
        val nextButton = findViewById<Button>(R.id.NextButton)

        // Set the OnClickListener to launch SecondsignupActivity when clicked
        nextButton.setOnClickListener {
            // Create an Intent to start SecondsignupActivity
            val explicitIntent = Intent(this, SecondsignupActivity::class.java)
            startActivity(explicitIntent)
        }
    }
}
