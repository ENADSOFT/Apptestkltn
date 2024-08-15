package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class NotificationActivity : AppCompatActivity() {

    private lateinit var notification: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        notification = findViewById(R.id.notification)
        notification.text = "You have new notifications"
    }
}
