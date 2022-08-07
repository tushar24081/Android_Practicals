package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button con, count_dig, red, green, purple,blue;
    EditText name, surname;
    String fname, sname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        con = findViewById(R.id.concat);
        count_dig = findViewById(R.id.count_name);
        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        purple = findViewById(R.id.purple);
        name  = findViewById(R.id.editTextTextPersonName);
        surname  = findViewById(R.id.editTextTextPersonName2);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fname = name.getText().toString();
                sname = surname.getText().toString();
                String full_name = fname + " " + sname;
                Toast.makeText(MainActivity.this, full_name, Toast.LENGTH_SHORT).show();
            }
        });

        count_dig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fname = name.getText().toString();
                sname = surname.getText().toString();
             int fLength = fname.length();
             int sLength = sname.length();
            Toast.makeText(MainActivity.this, String.valueOf(fLength) + " First Name", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, String.valueOf(sLength) + " Surname", Toast.LENGTH_SHORT).show();
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setTextColor(Color.RED);
                surname.setTextColor(Color.RED);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setTextColor(Color.BLUE);
                surname.setTextColor(Color.BLUE);
            }
        });

        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setTextColor(Color.YELLOW);
                surname.setTextColor(Color.YELLOW);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setTextColor(Color.GREEN);
                surname.setTextColor(Color.GREEN);
            }
        });



    }
}