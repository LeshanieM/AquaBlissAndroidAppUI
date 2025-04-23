package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondsignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
// Find the button with ID button4
        val button4 = findViewById<Button>(R.id.button4)

        // Set the OnClickListener to navigate to the LoginActivity when clicked
        button4.setOnClickListener {
            // Create an Intent to navigate to the LoginActivity
            val intent = Intent(this, ThirdLoginActivity::class.java)
            startActivity(intent)
        }
    }
}
