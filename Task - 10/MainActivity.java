package com.example.task_10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioButton r1, r2,r3,r4;
    boolean ans = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans){
                    AlertDialog dig = new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Yes, you are correct!")
                            .setIcon(R.drawable.checlk)
                            .setMessage("Well Done!")
                            .create();
                    dig.show();
                }
                else{
                    AlertDialog dig = new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Oops, wrong ans!")
                            .setIcon(R.drawable.ic_baseline_clear_24)
                            .setMessage("Try Again")
                            .create();
                    dig.show();
                }
            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = true;
                btn.setEnabled(true);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = false;
                btn.setEnabled(true);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = false;
                btn.setEnabled(true);
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans = false;
                btn.setEnabled(true);
            }
        });
    }
}