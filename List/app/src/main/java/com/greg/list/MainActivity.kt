package com.greg.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.greg.list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var listNumeros = ArrayList<Int>()
        listNumeros.add(1)
        listNumeros.add(7)
        listNumeros.add(6)
        listNumeros.add(10)
        listNumeros.add(5)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listNumeros)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast
                .makeText(applicationContext, "Item Clicado é o ${listNumeros.get(i)}", Toast.LENGTH_SHORT)
                .show()
        }
    }
}