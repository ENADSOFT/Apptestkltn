package com.example.myapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button
    private lateinit var successMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        loginButton = findViewById(R.id.login_button)
        successMessage = findViewById(R.id.success_message)

        loginButton.setOnClickListener {
            if (username.text.toString() == "test_user" && password.text.toString() == "password123") {
                successMessage.text = "Welcome ${username.text}!"
                val intent = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(intent)
            } else {
                successMessage.text = "Login failed!"
            }
        }
    }
}
