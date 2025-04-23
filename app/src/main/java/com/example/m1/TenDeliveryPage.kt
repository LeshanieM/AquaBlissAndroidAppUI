package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TenDeliveryPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery)

        // Find the button by ID
        val deliveryNextButton = findViewById<Button>(R.id.DeliveryNext)

        // Set the OnClickListener for the button
        deliveryNextButton.setOnClickListener {
            // Create an Intent to navigate to HomePage
            val intent = Intent(this, FifthHomeActivity::class.java)
            startActivity(intent)
        }
    }
}
