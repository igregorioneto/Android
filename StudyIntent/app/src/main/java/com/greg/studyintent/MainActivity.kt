package com.greg.studyintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.greg.studyintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var result: ActivityResultLauncher<Intent>

    private var nome = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPanel.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("nome", nome)
            result.launch(i)
        }

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.data != null && it.resultCode == 1) {
                nome = it.data?.getStringExtra("nome").toString()
                binding.textNome.text = "Olá $nome"
            } else if(it.data != null && it.resultCode == 2) {
                Toast
                    .makeText(applicationContext, "Operação Cancelada!", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast
                    .makeText(applicationContext, "Erro ao atualizar nome!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}