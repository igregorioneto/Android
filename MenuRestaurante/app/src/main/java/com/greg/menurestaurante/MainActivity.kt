package com.greg.menurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.greg.menurestaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val precoCafe = 1.0
    private val precoPao = 0.5
    private val precoChocolate = 1.5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enviarPedido.setOnClickListener {
            var i = Intent(this, SplashScreenActivity::class.java)
            i.putExtra("quant_cafe", binding.quantidadeCafe.text.toString())
            i.putExtra("quant_pao", binding.quantidadePao.text.toString())
            i.putExtra("quant_chocolate", binding.quantidadeChocolate.text.toString())
            i.putExtra("preco_cafe", precoCafe)
            i.putExtra("preco_pao", precoPao)
            i.putExtra("preco_chocolate", precoChocolate)

            startActivity(i)
        }

        binding.checkboxCafe.setOnClickListener {
            if (binding.checkboxCafe.isChecked()) {
                binding.quantidadeCafe.setText("1")
                val preco = binding.quantidadeCafe.text.toString().toDouble()
                binding.valorQuantidadeCafe.setText("R$ ${preco * precoCafe}")
                binding.valorQuantidadeCafe.visibility = View.VISIBLE
            } else {
                binding.quantidadeCafe.setText("0")
                binding.valorQuantidadeCafe.visibility = View.GONE
            }
        }
        binding.checkboxPao.setOnClickListener {
            if (binding.checkboxPao.isChecked()) {
                binding.quantidadePao.setText("1")
                val preco = binding.quantidadePao.text.toString().toDouble()
                binding.valorQuantidadePao.setText("R$ ${preco * precoPao}")
                binding.valorQuantidadePao.visibility = View.VISIBLE
            } else {
                binding.quantidadePao.setText("0")
                binding.valorQuantidadePao.visibility = View.GONE
            }
        }
        binding.checkboxChocolate.setOnClickListener {
            if (binding.checkboxChocolate.isChecked()) {
                binding.quantidadeChocolate.setText("1")
                val preco = binding.quantidadeChocolate.text.toString().toDouble()
                binding.valorQuantidadeChocolate.setText("R$ ${preco * precoChocolate}")
                binding.valorQuantidadeChocolate.visibility = View.VISIBLE
            } else {
                binding.quantidadeChocolate.setText("0")
                binding.valorQuantidadeChocolate.visibility = View.GONE
            }
        }

    }
}