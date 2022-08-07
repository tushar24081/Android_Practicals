package com.example.task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Age extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        txt = findViewById(R.id.textView2);
        Intent in = getIntent();
        String age = in.getStringExtra("age");
        txt.setText("Your age is " + age);

    }
}