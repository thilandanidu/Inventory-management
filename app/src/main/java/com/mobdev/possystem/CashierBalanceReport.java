package com.mobdev.possystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CashierBalanceReport extends AppCompatActivity {

    RecyclerView recyclerView;
    BalanceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashier_balance_report);

        recyclerView = findViewById(R.id.recycler_view);

        setRecyclerView();
    }

    private void setRecyclerView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BalanceAdapter(this,getList());
        recyclerView.setAdapter(adapter);
    }

    private List<BalanceModel>getList(){
        List<BalanceModel> balance_list = new ArrayList<>();
        balance_list.add(new BalanceModel("000265","12500"));
        balance_list.add(new BalanceModel("000266","5400"));
        balance_list.add(new BalanceModel("000267","14000"));
        balance_list.add(new BalanceModel("000268","9840"));
        balance_list.add(new BalanceModel("000269","2350"));
        balance_list.add(new BalanceModel("000270","10850"));
        balance_list.add(new BalanceModel("000265","12500"));
        balance_list.add(new BalanceModel("000266","5400"));
        balance_list.add(new BalanceModel("000267","14000"));
        balance_list.add(new BalanceModel("000268","9840"));
        balance_list.add(new BalanceModel("000269","2350"));
        balance_list.add(new BalanceModel("000270","10850"));
        balance_list.add(new BalanceModel("000270","10850"));
        balance_list.add(new BalanceModel("000265","12500"));
        balance_list.add(new BalanceModel("000266","5400"));
        balance_list.add(new BalanceModel("000267","14000"));
        balance_list.add(new BalanceModel("000268","9840"));
        balance_list.add(new BalanceModel("000269","2350"));
        balance_list.add(new BalanceModel("000270","10850"));
        return balance_list;

    }
}