package com.example.firstproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            val nome = binding.editNome.text.toString().trim()
            val sobrenome = binding.editSobrenome.text.toString().trim()

            if (nome.isEmpty() || sobrenome.isEmpty()) {
                binding.textResultado.text = "Nome/Sobrenome inválido!"
                Toast.makeText(applicationContext, "Nome/Sobrenome inválido!", Toast.LENGTH_SHORT).show()
            } else {
                binding.textResultado.setText("Olá $nome $sobrenome")
                Toast.makeText(applicationContext, "Olá $nome $sobrenome", Toast.LENGTH_LONG).show()
            }
        }
    }
}