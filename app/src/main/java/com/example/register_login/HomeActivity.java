package com.example.register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        login = (Button) findViewById(R.id.choiceLogin);
    }

    // Register button clicked --> go to registration page
    public void clickRegister (View view) {
        Intent registerIntent = new Intent (HomeActivity.this, RegisterActivity.class);

        startActivity(registerIntent);
    }

    // Login button clicked --> go to login page
    public void clickLogin (View view) {
        Intent loginIntent = new Intent(HomeActivity.this, LoginActivity.class);

        startActivity(loginIntent);
    }
}
