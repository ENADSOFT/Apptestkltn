package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ShareActivity : AppCompatActivity() {

    private lateinit var shareSuccessMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        shareSuccessMessage = findViewById(R.id.share_success_message)
        shareSuccessMessage.text = "Shared successfully"
    }
}
