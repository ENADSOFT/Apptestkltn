package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class PaymentActivity : AppCompatActivity() {

    private lateinit var paymentSuccessMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        paymentSuccessMessage = findViewById(R.id.payment_success_message)
        paymentSuccessMessage.text = "Payment successful"
    }
}
