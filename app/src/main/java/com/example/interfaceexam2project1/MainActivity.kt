package com.example.interfaceexam2project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.interfaceexam2project1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.loadUrl("https://godotengine.org")

        binding.button.setOnClickListener {
            binding.webView.loadUrl("https://google.com")
        }
    }
}