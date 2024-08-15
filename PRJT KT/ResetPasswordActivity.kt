package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ResetPasswordActivity : AppCompatActivity() {

    private lateinit var email: EditText
    private lateinit var resetButton: Button
    private lateinit var successMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        email = findViewById(R.id.email)
        resetButton = findViewById(R.id.reset_button)
        successMessage = findViewById(R.id.success_message)

        resetButton.setOnClickListener {
            successMessage.text = "Password reset link sent!"
        }
    }
}
