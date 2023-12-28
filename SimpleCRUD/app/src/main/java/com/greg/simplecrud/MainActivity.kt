package com.greg.simplecrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.greg.simplecrud.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var pos = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaUtilizadores = ArrayList<Utilizador>()
        listaUtilizadores.add(Utilizador("user", "pass"))
        listaUtilizadores.add(Utilizador("user123", "pass123"))
        listaUtilizadores.add(Utilizador("user1234", "pass1234"))

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaUtilizadores)
        binding.listItem.adapter = adapter

        binding.listItem.setOnItemClickListener {_, _, position, _ ->
            binding.editUsername.setText(listaUtilizadores.get(position).username)
            binding.editPassword.setText(listaUtilizadores.get(position).password)
            pos = position
        }

        binding.buttonInserir.setOnClickListener {
            val username = binding.editUsername.text.toString()
            val password = binding.editPassword.text.toString()
            if (!username.isEmpty() && !password.isEmpty() && pos < 0) {
                listaUtilizadores.add(Utilizador(username, password))
                adapter.notifyDataSetChanged()
                limparCampos()
            }
        }

        binding.buttonEditar.setOnClickListener {
            val username = binding.editUsername.text.toString()
            val password = binding.editPassword.text.toString()
            if (pos > -1 && !username.isEmpty() && !password.isEmpty()) {
                listaUtilizadores.get(pos).username = username
                listaUtilizadores.get(pos).password = password
                pos = -1
                limparCampos()
                adapter.notifyDataSetChanged()
            }
        }
        binding.buttonDeletar.setOnClickListener {
            if (pos > -1) {
                listaUtilizadores.removeAt(pos)
                adapter.notifyDataSetChanged()
                limparCampos()
                pos = -1
            }
        }
        binding.buttonLimpar.setOnClickListener {
            listaUtilizadores.clear()
            adapter.notifyDataSetChanged()
            limparCampos()
            pos = -1
        }
    }

    private fun limparCampos() {
        binding.editUsername.setText("")
        binding.editPassword.setText("")
    }
}