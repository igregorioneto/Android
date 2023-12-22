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

        binding.buttonConversor.setOnClickListener {
            var real = binding.editReal.text.toString().trim()
            if (!real.isEmpty()) {
                var calc = "%.2f".format(real.toDouble() * 4.87)
                binding.textResultado.text = "$calc $"
                Toast
                    .makeText(applicationContext, "Calculo realizado com sucesso!", Toast.LENGTH_LONG)
                    .show()
            } else {
                Toast
                    .makeText(applicationContext, "Valor inválido!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}