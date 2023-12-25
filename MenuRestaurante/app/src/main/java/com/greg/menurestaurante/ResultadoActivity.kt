package com.greg.menurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greg.menurestaurante.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var i = intent

        var quant_cafe = i.getStringExtra("quant_cafe").toString().toInt()
        var quant_pao = i.getStringExtra("quant_pao").toString().toInt()
        var quant_chocolate = i.getStringExtra("quant_chocolate").toString().toInt()

        var preco_cafe = i.getDoubleExtra("preco_cafe", 0.0)
        var preco_pao = i.getDoubleExtra("preco_pao", 0.0)
        var preco_chocolate = i.getDoubleExtra("preco_chocolate", 0.0)

        var resultado = """
            Resumo do Pedido:
            Café: $quant_cafe Preco: R$ ${preco_cafe * quant_cafe}
            Pão : $quant_pao Preco: R${'$'} ${preco_pao * quant_pao}
            Chocolate: $quant_chocolate Preco: R${'$'} ${preco_chocolate * quant_chocolate}
        """.trimIndent()

        binding.textResultado.setText(resultado)
    }
}