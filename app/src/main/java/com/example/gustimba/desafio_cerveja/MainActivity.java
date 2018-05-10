package com.example.gustimba.desafio_cerveja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valorceva;
    EditText valorml;
    EditText result;
    Button salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorceva = (EditText) findViewById(R.id.valordaceva);
        valorml = (EditText) findViewById(R.id.valorml);
        result = (EditText) findViewById(R.id.resultado);
        salvar = findViewById(R.id.salva);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double preco_ceva, ml ,resultado;
                String  nome = "R$:";
                preco_ceva = Double.parseDouble(valorceva.getText().toString());
                ml  = Double.parseDouble(valorml.getText().toString());
                resultado = (preco_ceva * 1000)/ml;
                result.setText(String.format(nome +" %.2f",resultado));
            }
        });
    }

}
