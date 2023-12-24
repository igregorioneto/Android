package com.greg.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.greg.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            var username = binding.editUsername.text.toString().trim()
            var password = binding.editPassword.text.toString().trim()

            if (username.equals("user") && password.equals("pass")) {
                Toast.makeText(applicationContext, "Login efetuado com sucesso!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginOkActivity::class.java))
            } else {
                Toast.makeText(applicationContext, "Login Inválido!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginErrorActivity::class.java))
            }

            binding.editUsername.setText("")
            binding.editPassword.setText("")
        }
    }
}