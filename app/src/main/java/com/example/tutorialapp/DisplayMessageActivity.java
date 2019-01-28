package com.example.tutorialapp;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string and convert into int
        Intent intent = getIntent();
        double height = Double.parseDouble(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
        double weight = Double.parseDouble(intent.getStringExtra(MainActivity.EXTRA_MESSAGE2));
        System.out.println("height: " + height);
        System.out.println("weight: " + weight);
        double bmi = weight / (height * height);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print(df.format(bmi));
        textView.setText("Your BMI is " + df.format(bmi));
    }
}
