package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThirdLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Set your login page layout

        // Find the button with ID button
        val loginButton = findViewById<Button>(R.id.button)

        // Set the OnClickListener to navigate to the DashboardActivity when clicked
        loginButton.setOnClickListener {
            // Create an Intent to navigate to the DashboardActivity
            val intent = Intent(this, FourthProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
