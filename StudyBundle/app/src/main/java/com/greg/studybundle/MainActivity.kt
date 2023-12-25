package com.greg.studybundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greg.studybundle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNumber.setOnClickListener {
            val numero1 = binding.editNumber.text.toString().trim().toInt()
            var i = Intent(this, MainActivity2::class.java)
            i.putExtra("numero1", numero1)

            startActivity(i)
        }
    }
}