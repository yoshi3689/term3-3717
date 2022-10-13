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

        Button login = findViewById(R.id.login);
        login.setOnClickListener( view -> {
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivity(loginIntent);
        });

        Button signup = findViewById(R.id.signin);
        signup.setOnClickListener( view -> {
            Intent signupIntent = new Intent(this, SignupActivity.class);
            startActivity(signupIntent);
        });

    }
}