package com.example.m1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class NinePaymentPage3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_3)

        // Find the button by ID for Download Invoice
        val btnDownloadInvoice = findViewById<Button>(R.id.btn_download_invoice)

        // Set the OnClickListener for the button
        btnDownloadInvoice.setOnClickListener {
            // Create an Intent to navigate to TenDeliveryPage
            val intent = Intent(this, TenDeliveryPage::class.java)
            startActivity(intent)
        }

        // Find the back button by ID (ImageView)
        val backButton = findViewById<ImageView>(R.id.BackButton1)

        // Set the OnClickListener for the back button
        backButton.setOnClickListener {
            // Navigate back to the previous activity
            onBackPressed()
        }
    }
}
