package com.example.task_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
    String[] locations = {"Noida", "Gurugaon", "Pune", "Ahmedabad"};
    String[] jobs = {"ASP", "PHP", "ML", "APP DEV."};
    String[] tourPlaces = {"Goa", "Mumbai", "New Delhi", "Kashmir", "Ujjain"};
    Spinner spinner, spinner2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        btn = findViewById(R.id.button2);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, locations);
        spinner.setAdapter(adapter);

        ArrayAdapter newAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, jobs);
        spinner2.setAdapter(newAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedJob = spinner2.getSelectedItem().toString();
                String selectedLocation = spinner.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, selectedJob + " " + selectedLocation, Toast.LENGTH_SHORT).show();
            }
        });
    }
}