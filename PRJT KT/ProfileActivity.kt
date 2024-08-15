package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var saveButton: Button
    private lateinit var successMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        username = findViewById(R.id.username)
        saveButton = findViewById(R.id.save_button)
        successMessage = findViewById(R.id.success_message)

        saveButton.setOnClickListener {
            successMessage.text = "Profile updated successfully!"
        }
    }
}
