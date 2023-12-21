package com.greg.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greg.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (!binding.editValor.text.toString().isBlank()) {
                var celcius = binding.editValor.text.toString().toDouble()
                var f = String.format("%.2f",celcius * 1.8 + 32)
                binding.textResultado.text = "${f} °F"
            } else {
                binding.textResultado.text = "Valor inválido!"
            }
        }
    }
}