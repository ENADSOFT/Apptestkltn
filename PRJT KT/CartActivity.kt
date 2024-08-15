package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class CartActivity : AppCompatActivity() {

    private lateinit var addToCartButton: Button
    private lateinit var checkoutButton: Button
    private lateinit var cartCount: TextView
    private lateinit var checkoutMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        addToCartButton = findViewById(R.id.add_to_cart)
        checkoutButton = findViewById(R.id.checkout_button)
        cartCount = findViewById(R.id.cart_count)
        checkoutMessage = findViewById(R.id.checkout_message)

        addToCartButton.setOnClickListener {
            cartCount.text = "1"
        }

        checkoutButton.setOnClickListener {
            checkoutMessage.text = "Thank you for your purchase"
        }
    }
}
