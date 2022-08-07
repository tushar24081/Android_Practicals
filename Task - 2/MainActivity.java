package com.example.task_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1, c2, c3, c4;
    Button btn;
    TextView txt;
    int amount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.txt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked())
                    amount += 500;
                if(c2.isChecked())
                    amount += 500;
                if(c3.isChecked())
                    amount += 500;
                if(c4.isChecked())
                    amount += 500;
            }
             txt.setText(String.valueOf(amount));

        });


    }
}