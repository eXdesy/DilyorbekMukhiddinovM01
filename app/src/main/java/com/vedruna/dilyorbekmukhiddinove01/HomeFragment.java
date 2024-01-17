package com.vedruna.dilyorbekmukhiddinove01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Obtén la referencia del botón desde el diseño
        Button buttonClickMe = view.findViewById(R.id.buttonClickMe);

        // Agrega un OnClickListener al botón
        buttonClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muestra un mensaje al hacer clic en el botón
                Toast.makeText(getActivity(), "¡Hola desde tu botón!", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
