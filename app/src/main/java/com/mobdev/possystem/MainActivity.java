package com.mobdev.possystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button cTaskBtn, cCashBalanceBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize
        cTaskBtn = findViewById(R.id.cashier_btn);
        cCashBalanceBtn = findViewById(R.id.cashBalance_btn);

        //
        cTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, DailySalesReportActivity.class));
            }
        });

        cCashBalanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, CashierCashBalanceReportActivity.class));
            }
        });
    }
}