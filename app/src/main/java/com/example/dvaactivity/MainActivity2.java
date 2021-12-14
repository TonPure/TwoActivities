package com.example.dvaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import  android.content.res.Resources;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv = findViewById(R.id.textView);
        Intent in = getIntent();
        String tex = in.getStringExtra("selectedItem");
        tv.setText(tex);
        Resources resources = getResources();
        switch(tex) {
            case "КАЖДЫЙ": {
                int texColor = resources.getColor(R.color.purple_200, null);
                tv.setTextColor(texColor);
                break;
            }
            case "ОХОТНИК": {
                int texColor = resources.getColor(R.color.purple_500, null);
                tv.setTextColor(texColor);
                break;
            }
            case "ЖЕЛАЕТ": {
                int texColor = resources.getColor(R.color.purple_700, null);
                tv.setTextColor(texColor);
                break;
            }
            case "ЗНАТЬ": {
                int texColor = resources.getColor(R.color.teal_200, null);
                tv.setTextColor(texColor);
                break;
            }
            case "ГДЕ": {
                int texColor = resources.getColor(R.color.teal_700, null);
                tv.setTextColor(texColor);
                break;
            }
            case "СИДИТ": {
                int texColor = resources.getColor(R.color.black, null);
                tv.setTextColor(texColor);
                break;
            }
            case "ФАЗАН": {
                int texColor = resources.getColor(R.color.white, null);
                int bgc = resources.getColor(R.color.black, null);
                tv.setBackgroundColor(bgc);
                tv.setTextColor(texColor);
                break;
            }

        }
    }
}