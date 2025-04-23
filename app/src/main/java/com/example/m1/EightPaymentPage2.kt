package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EightPaymentPage2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_2)

        // Find the TextView by ID
        val tvPaymentAmount = findViewById<TextView>(R.id.tv_payment_amount)

        // Set the OnClickListener for the TextView
        tvPaymentAmount.setOnClickListener {
            // Create an Intent to navigate to PaymentPage3
            val intent = Intent(this, NinePaymentPage3::class.java)
            startActivity(intent)
        }
    }
}
