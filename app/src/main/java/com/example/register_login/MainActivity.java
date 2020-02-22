// Splash screen

package com.example.register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private static int splashTime = 3000; // Splash screen will run for 3000 ms (3s)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Allows splash activity to cover the full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Move from splash screen to home screen of app
                Intent splashIntent = new Intent (MainActivity.this, HomeActivity.class);

                // Start HomeActivity
                startActivity(splashIntent);

                // End splash screen
                finish();
            }
        }, splashTime);
    }
}