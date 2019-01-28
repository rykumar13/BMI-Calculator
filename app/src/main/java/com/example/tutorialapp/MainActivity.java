package com.example.tutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.myfirstapp.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText_height = (EditText) findViewById(R.id.editText);
        String height = editText_height.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, height);

        EditText editText_weight = (EditText) findViewById(R.id.editText2);
        String weight = editText_weight.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, weight);

        startActivity(intent);
    }
}
