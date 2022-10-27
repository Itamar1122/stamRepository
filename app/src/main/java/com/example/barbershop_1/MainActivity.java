package com.example.barbershop_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin,btnReg,forgetPassword;
    EditText etPassword,etUserName,etEmail;
    Dialog forgetPasswordDialog;
    String getMail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);
        btnReg = findViewById(R.id.btnReg);
        forgetPassword = findViewById(R.id.forgetPassword);
        etPassword = findViewById(R.id.etPassword);
        etUserName = findViewById(R.id.etUserName);
        btnLogin.setOnClickListener(this);
        btnReg.setOnClickListener(this);
        forgetPassword.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent it;
        if (view==btnReg)
        {
            it = new Intent(this,RegisterPage.class);
            startActivity(it);
        }
        else if (view==btnLogin)
        {
            it = new Intent(this,pageOne.class);
            startActivity(it);
        }
        else if (view==forgetPassword)
        {
            createDialog();
        }
        else if (view==forgetPasswordDialog.findViewById(R.id.btnForgetPassword)){

            if (etEmail.getText().toString().equals(""))
            {
                Toast.makeText(this, "תמלא את השדה בבקשה", Toast.LENGTH_SHORT).show();
            }
            else {
                getMail =  etEmail.getText().toString();
            }
        }
    }




    public void createDialog()
    {
        forgetPasswordDialog = new Dialog(this);
        forgetPasswordDialog.setContentView(R.layout.forget_password);
        forgetPasswordDialog.setTitle("שחזור סיסמה");

        etEmail = forgetPasswordDialog.findViewById(R.id.etEmail);

        forgetPasswordDialog.setCancelable(true);
        forgetPassword = forgetPasswordDialog.findViewById(R.id.forgetPassword);

        forgetPasswordDialog.show();
    }
}