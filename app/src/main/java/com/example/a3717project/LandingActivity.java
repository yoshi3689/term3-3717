package com.example.a3717project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        //getActionBar().hide();

        Button login = findViewById(R.id.login);
        login.setOnClickListener( view -> {
//            Intent loginIntent = new Intent(this, LoginActivity.class);
//            startActivity(loginIntent);
        });

        Button signin = findViewById(R.id.signin);
        signin.setOnClickListener( view -> {
//            Intent loginIntent = new Intent(this, SigninActivity.class);
//            startActivity(loginIntent);
        });

    }
}