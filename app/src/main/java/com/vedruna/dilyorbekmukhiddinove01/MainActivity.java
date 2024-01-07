package com.vedruna.dilyorbekmukhiddinove01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewNumero;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNumero = findViewById(R.id.textView_numero);

        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonReset = findViewById(R.id.button_reset);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementarContador();
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementarContador();
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetearContador();
            }
        });
    }

    private void incrementarContador() {
        contador++;
        actualizarTextView();
    }

    private void decrementarContador() {
        if (contador > 0) {
            contador--;
            actualizarTextView();
        }
    }

    private void resetearContador() {
        contador = 0;
        actualizarTextView();
    }

    private void actualizarTextView() {
        textViewNumero.setText(String.valueOf(contador));
    }
}
