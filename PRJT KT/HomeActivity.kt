package com.example.myapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    private lateinit var profileButton: Button
    private lateinit var searchButton: Button
    private lateinit var cartButton: Button
    private lateinit var notificationButton: Button
    private lateinit var shareButton: Button
    private lateinit var paymentButton: Button
    private lateinit var logoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        profileButton = findViewById(R.id.profile_button)
        searchButton = findViewById(R.id.search_button)
        cartButton = findViewById(R.id.cart_button)
        notificationButton = findViewById(R.id.notification_button)
        shareButton = findViewById(R.id.share_button)
        paymentButton = findViewById(R.id.payment_button)
        logoutButton = findViewById(R.id.logout_button)

        profileButton.setOnClickListener { startActivity(Intent(this, ProfileActivity::class.java)) }
        searchButton.setOnClickListener { startActivity(Intent(this, SearchActivity::class.java)) }
        cartButton.setOnClickListener { startActivity(Intent(this, CartActivity::class.java)) }
        notificationButton.setOnClickListener { startActivity(Intent(this, NotificationActivity::class.java)) }
        shareButton.setOnClickListener { startActivity(Intent(this, ShareActivity::class.java)) }
        paymentButton.setOnClickListener { startActivity(Intent(this, PaymentActivity::class.java)) }
        logoutButton.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
    }
}
