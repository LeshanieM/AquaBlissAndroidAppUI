package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FourthProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Find the button by ID
        val buttonHome = findViewById<Button>(R.id.buttonHome)

        // Set the OnClickListener for the button
        buttonHome.setOnClickListener {
            // Create an Intent to navigate to HomeActivity
            val intent = Intent(this, FifthHomeActivity::class.java)
            startActivity(intent)
        }
    }
}
