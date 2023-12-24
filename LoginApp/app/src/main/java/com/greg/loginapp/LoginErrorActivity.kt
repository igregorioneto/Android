package com.greg.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greg.loginapp.databinding.ActivityLoginErrorBinding

class LoginErrorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginErrorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginErrorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.realizarLogin.setOnClickListener {
            finish()
        }
    }
}