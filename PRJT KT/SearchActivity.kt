package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView

class SearchActivity : AppCompatActivity() {

    private lateinit var searchInput: EditText
    private lateinit var searchResults: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        searchInput = findViewById(R.id.search)
        searchResults = findViewById(R.id.search_results)

        searchResults.text = "Displaying search results for: ${searchInput.text}"
    }
}
