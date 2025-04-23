package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixthCartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        // Find the Button by ID
        val checkoutButton = findViewById<Button>(R.id.checkoutButton)

        // Set the OnClickListener for the Button
        checkoutButton.setOnClickListener {
            // Create an Intent to navigate to PaymentActivity
            val intent = Intent(this, SeventhPaymentActivity::class.java)
            startActivity(intent)
        }
    }
}
