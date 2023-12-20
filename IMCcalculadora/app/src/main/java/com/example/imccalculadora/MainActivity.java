package com.example.imccalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextView textResultado;
    private EditText editPeso, editAltura;

    private DecimalFormat formato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);

        formato = new DecimalFormat("#.##");
    }

    public void calcular(View view) {
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double calculo = peso / (altura * altura);
        String resposta = "";
        if (calculo < 18.5)
            resposta = "Abaixo do peso";
        else if (calculo >= 18.6 && calculo <= 24.9)
            resposta = "Peso ideal";
        else if (calculo >= 25 && calculo <= 29.9)
            resposta = "Levemente acima do peso";
        else if (calculo >= 30 && calculo <= 34.9)
            resposta = "Obesidade grau I";
        else if (calculo >= 35 && calculo <= 39.9)
            resposta = "Obesidade grau II";
        else
            resposta = "Obesidade grau III";

        String calculoFormatado = formato.format(calculo);

        textResultado.setText("Resultado: " + resposta + " - " + calculoFormatado);
    }
}