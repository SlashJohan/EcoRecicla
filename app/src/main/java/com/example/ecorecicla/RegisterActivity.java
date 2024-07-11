package com.example.ecorecicla;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText registerNameEditText;
    private EditText registerSurnameEditText;
    private EditText registerEmailEditText;
    private EditText registerContactEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerNameEditText = findViewById(R.id.registerNameEditText);
        registerSurnameEditText = findViewById(R.id.registerSurnameEditText);
        registerEmailEditText = findViewById(R.id.registerEmailEditText);
        registerContactEditText = findViewById(R.id.registerContactEditText);
        Button acceptRegisterButton = findViewById(R.id.acceptRegisterButton);

        acceptRegisterButton.setOnClickListener(v -> {
            String name = registerNameEditText.getText().toString();
            String surname = registerSurnameEditText.getText().toString();
            String email = registerEmailEditText.getText().toString();
            String contact = registerContactEditText.getText().toString();

            if (!name.isEmpty() && !surname.isEmpty() && !email.isEmpty() && !contact.isEmpty()) {
                // Aquí podrías añadir lógica de registro
                Toast.makeText(RegisterActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                finish();
            } else {
                Toast.makeText(RegisterActivity.this, "Por favor, ingrese todos los campos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
