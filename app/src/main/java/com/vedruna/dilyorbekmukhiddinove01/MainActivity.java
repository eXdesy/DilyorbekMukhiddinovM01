package com.vedruna.dilyorbekmukhiddinove01;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.navigation_home) {
                navController.navigate(R.id.homeFragment);
            } else if (item.getItemId() == R.id.navigation_counter) {
                navController.navigate(R.id.counterFragment);
            } else if (item.getItemId() == R.id.navigation_api) {
                navController.navigate(R.id.apiFragment);
            } else if (item.getItemId() == R.id.navigation_settings) {
                navController.navigate(R.id.settingsFragment);
            }
            return true;
        });
    }
}
