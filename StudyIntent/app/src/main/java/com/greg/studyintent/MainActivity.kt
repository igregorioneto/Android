package com.greg.studyintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greg.studyintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPanel.setOnClickListener {
            val nome = binding.editNome.text.toString()

            if (nome != null) {
                var i = Intent(this, MainActivity2::class.java)
                i.putExtra("nome", nome)
                startActivity(i)
            }
        }
    }
}