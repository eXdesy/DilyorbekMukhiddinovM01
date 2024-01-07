package com.vedruna.dilyorbekmukhiddinove01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v) {
        // Obtener referencias a los EditText para el usuario y la contraseña
        EditText editTextUsuario = findViewById(R.id.editTextUsuario);
        EditText editTextContraseña = findViewById(R.id.editTextContraseña);

        // Obtener los valores ingresados por el usuario
        String usuario = editTextUsuario.getText().toString().trim();
        String contraseña = editTextContraseña.getText().toString().trim();

        // Verificar si el usuario y la contraseña son iguales a "admin"
        if (usuario.equals("admin") && contraseña.equals("admin")) {
            // Si son iguales, iniciar la actividad MainActivity
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            // Si no son iguales, mostrar un mensaje de error
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}