package com.greg.sharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greg.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferentes = this.getSharedPreferences("valores", Context.MODE_PRIVATE)
        val valor = sharedPreferentes.getString("valor", "")

        binding.textResultado.setText(valor)

        binding.button.setOnClickListener {
            var text = binding.editText.text.toString()
            binding.textResultado.setText(text)

            val editor = sharedPreferentes.edit()
            editor.putString("valor", text)
            editor.apply()
        }
    }
}