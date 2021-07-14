package com.mobdev.possystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CashierCashBalanceReportActivity extends AppCompatActivity
{
//    RecyclerView recycler_view;
//    PaymentAdapter adapter;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashier_cash_balance_report);

//        recycler_view = findViewById(R.id.recycler_view);
//
////        setRecyclerView();
//    }
//
//
////    private void setRecyclerView() {
////        recycler_view.setHasFixedSize(true);
////        recycler_view.setLayoutManager(new LinearLayoutManager(this));
////        adapter = new PaymentAdapter(this, getList());
////        recycler_view.setAdapter(adapter);
////    }
////
////    private List<PaymentModel> getList() {
//////        List<PaymentModel> payment_list = new ArrayList<>();
//////        payment_list.add(new PaymentModel("1", "100000"));
//////        payment_list.add(new PaymentModel("2", "230000"));
//////        payment_list.add(new PaymentModel("3", "140000"));
//////        payment_list.add(new PaymentModel("3", "1090000"));
//////        payment_list.add(new PaymentModel("5", "90000"));
//////        return payment_list;
    }
}