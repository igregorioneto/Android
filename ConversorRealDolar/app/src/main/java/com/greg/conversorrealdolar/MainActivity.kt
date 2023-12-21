package com.greg.conversorrealdolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greg.conversorrealdolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var value = binding.editValor.text.toString().toDouble()
            var calc = String.format("%.2f", value * 4.89)
            binding.textResultado.text = "R$ ${calc}"
        }
    }
}