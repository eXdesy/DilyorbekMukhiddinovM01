package com.vedruna.dilyorbekmukhiddinove01;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SettingsFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        // Obtén la referencia del botón desde el diseño
        Button buttonExit = view.findViewById(R.id.buttonClickMe);

        // Agrega un OnClickListener al botón
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ejemplo: iniciar una nueva actividad de inicio de sesión
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);

                // Puedes mostrar un mensaje de despedida
                Toast.makeText(getActivity(), "Sesión cerrada", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}