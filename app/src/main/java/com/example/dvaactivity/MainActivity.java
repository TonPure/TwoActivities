package com.example.dvaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMain = findViewById(R.id.lvMain);
        String[] countries = getResources().getStringArray(R.array.txt);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, countries);

        lvMain.setAdapter(adapter);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        lvMain.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = countries[position];
            intent.putExtra("selectedItem", selectedItem);
            startActivity(intent);
        });
    }
    
}