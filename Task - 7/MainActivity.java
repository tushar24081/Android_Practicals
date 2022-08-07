package com.example.task_7;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ToggleButton tog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.info);
        tog = findViewById(R.id.togg);

        tog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tog.isChecked()){
                    btn.setEnabled(true);
                }
                else{
                    btn.setEnabled(false);
                }

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tog.isChecked()){
                    AlertDialog dig = new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Are you sure you want to join? ")
                            .setMessage("Click on yes, to move forward")
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent in = new Intent(MainActivity.this, info_activity.class);
                                    startActivity(in);
                                }
                            })
                            .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            }).create();

                    dig.show();
                }
            }
        });
    }
}