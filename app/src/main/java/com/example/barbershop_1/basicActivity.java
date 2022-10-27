package com.example.barbershop_1;

import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;

public class basicActivity extends AppCompatActivity {

    public boolean onCreateOptionMenu (Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }





}
