package com.greg.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.greg.linearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDolar.setOnClickListener {
            escrever(4.89);
        }

        binding.buttonEuro.setOnClickListener {
            escrever(5.39);
        }

        binding.buttonPeso.setOnClickListener {
            escrever(0.006)
        }
    }

    private fun escrever(taxa: Double) {
        var real = binding.editReal.text.toString().trim()
        if (!real.isEmpty()) {
            var calc = "%.2f".format(real.toDouble() * taxa)
            Toast
                .makeText(applicationContext, "Resultado: $calc $", Toast.LENGTH_LONG)
                .show()
        } else {
            Toast
                .makeText(applicationContext, "Valor inválido!", Toast.LENGTH_SHORT)
                .show()
        }
    }
}