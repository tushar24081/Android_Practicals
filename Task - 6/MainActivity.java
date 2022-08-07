package com.example.task_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] iceCream = {"Vanilla", "Chocolate", "Mango", "Afghani Dryfruit", "Rajbhog", "ButterScotch", "Anjeer", "Malai Kulfi", "Special IC", "ABC", "XYZ", "HBN", "YUH"};
    ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, iceCream);
        ls.setAdapter(adapter);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = adapter.getItem(i).toString();
            Toast.makeText(MainActivity.this, "You selected " + value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}