package com.example.ecorecicla;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Button homeButton = findViewById(R.id.homeButton);
        Button categoriesButton = findViewById(R.id.categoriesButton);
        Button statisticsButton = findViewById(R.id.statisticsButton);
        Button logoutButton = findViewById(R.id.logoutButton);
        Button benefitsButton = findViewById(R.id.benefitsButton);

        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainPageActivity.this, MainPageActivity.class);
            startActivity(intent);
        });

        categoriesButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainPageActivity.this, CategoriesActivity.class);
            startActivity(intent);
        });

        statisticsButton.setOnClickListener(v -> {
            // Acciones para el botón de Estadisticas de Reciclar
        });

        logoutButton.setOnClickListener(v -> finish());

        benefitsButton.setOnClickListener(v -> {
            // Acciones para el botón de Beneficios de Reciclar
        });
    }
}
