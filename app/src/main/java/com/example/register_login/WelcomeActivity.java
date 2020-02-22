package com.example.register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcome = (TextView) findViewById(R.id.welcomeMsg);

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int timeHour = calendar.get(Calendar.HOUR_OF_DAY);

        // Sets messages based upon time/hour of day
        if(timeHour>= 12 && timeHour < 17) {
            welcome.setText("Good afternoon & welcome!"); // good afternoon message for hours between 12-5 pm
        } else if(timeHour >= 17 && timeHour < 21) {
            welcome.setText("Good evening & welcome!"); // good evening message for hours between 5-9 pm
        } else if(timeHour >= 21 && timeHour < 24) {
            welcome.setText("Good night & welcome!"); // good night message for hours between 9 pm-12 am
        } else {
            welcome.setText("Good morning & welcome!"); // good morning message for hours between 12 am-12 pm
        }
    }
}
