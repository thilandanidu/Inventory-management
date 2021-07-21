package com.mobdev.releseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO : check
        //this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        btn = findViewById(R.id.button);
        btn1 = findViewById(R.id.btnUpdate);
        //To stocks
        btn.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this,Stocks.class);
            startActivity(i);
        });
        //To item update
        btn1.setOnClickListener(v -> {
            Intent i1 = new Intent(MainActivity.this,UpdateItem.class);
            startActivity(i1);
        });

    }
}
