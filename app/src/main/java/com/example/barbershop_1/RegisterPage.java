package com.example.barbershop_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class RegisterPage extends AppCompatActivity {

    Switch isBarber;
    EditText editTextTextPassword,editTextNumberPassword,etConfirmPass,etUserName,etMail,etPhone,etHaircutPrice;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
        isBarber= findViewById(R.id.isBarber);
        editTextNumberPassword = findViewById(R.id.editTextTextPassword);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        etConfirmPass = findViewById(R.id.etConfirmPass);
        int stamxxxx;

    }
}