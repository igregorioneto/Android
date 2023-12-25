package com.greg.studybundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greg.studybundle.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var i = intent

        var bundle = i.extras

        binding.buttonNumber.setOnClickListener {
            var numero2 = binding.editNumber.text.toString().trim().toInt()
            var i = Intent(this, MainActivity3::class.java)

            if (bundle != null) {
                i.putExtras(bundle)
            }

            i.putExtra("numero2", numero2)
            startActivity(i)

        }
    }
}