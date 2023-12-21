package com.example.firstproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            val nome = binding.editNome.text.toString()
            binding.textResultado.setText("Olá $nome")
        }
    }
}