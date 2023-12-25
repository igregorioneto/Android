package com.greg.studybundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.greg.studybundle.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var i = intent

        val numero1 = i.extras?.getInt("numero1")
        val numero2 = i.extras?.getInt("numero2")

        if (numero1 != null && numero2 != null) {
            val sum = numero1 + numero2
            binding.textResultado.text = "SOMA: $sum"
        } else {
            Toast
                .makeText(applicationContext, "Erro ao passar valores", Toast.LENGTH_SHORT)
                .show()
        }
    }
}