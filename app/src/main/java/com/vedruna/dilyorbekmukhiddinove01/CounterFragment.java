package com.vedruna.dilyorbekmukhiddinove01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CounterFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private TextView textViewNumero;
    private int contador = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_counter, container, false);

        textViewNumero = view.findViewById(R.id.textView_numero);

        Button buttonPlus = view.findViewById(R.id.button_plus);
        Button buttonMinus = view.findViewById(R.id.button_minus);
        Button buttonReset = view.findViewById(R.id.button_reset);

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

        return view;
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
