package com.greg.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greg.loginapp.databinding.ActivityLoginOkBinding

class LoginOkActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginOkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logout.setOnClickListener {
            finish()
        }
    }
}