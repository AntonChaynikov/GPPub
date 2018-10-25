package com.antonchaynikov.gppublish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Calculator mCalculator;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
        mCalculator = new Calculator();
        final EditText editText = findViewById(R.id.editText);
        findViewById(R.id.button).setOnClickListener( v -> {
            String input = editText.getText().toString();
            int a = input.isEmpty() ? 0 : Integer.parseInt(input);
            editText.setText(Integer.toString(mCalculator.square(a)));
        });
    }

}
