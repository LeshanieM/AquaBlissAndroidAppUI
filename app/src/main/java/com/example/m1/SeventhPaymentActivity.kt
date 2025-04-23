package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SeventhPaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_1)

        // Find the RadioButton by ID
        val applePayRadioButton = findViewById<RadioButton>(R.id.applePayRadio)

        // Set the OnClickListener for the RadioButton
        applePayRadioButton.setOnClickListener {
            if (applePayRadioButton.isChecked) {
                // Create an Intent to navigate to PaymentPage2
                val intent = Intent(this, EightPaymentPage2::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Apple Pay not selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
