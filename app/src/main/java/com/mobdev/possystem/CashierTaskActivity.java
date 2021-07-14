package com.mobdev.possystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CashierTaskActivity extends AppCompatActivity
{
//    RecyclerView recycler_view;
//    PaymentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashier_task);

//        recycler_view = findViewById(R.id.recycler_view);
//
//        setRecyclerView();
//    }
//
//    private void setRecyclerView() {
//        recycler_view.setHasFixedSize(true);
//        recycler_view.setLayoutManager(new LinearLayoutManager(this));
//        adapter = new PaymentAdapter(this, getList());
//        recycler_view.setAdapter(adapter);
//    }
//
//    private List<PaymentModel> getList() {
//        List<PaymentModel> payment_list = new ArrayList<>();
//        payment_list.add(new PaymentModel("001","Wire","30","100000"));
//        payment_list.add(new PaymentModel("200","Bulb","20","230000"));
//        payment_list.add(new PaymentModel("563","Cement","60","140000"));
//        payment_list.add(new PaymentModel("365","Sand","20","1090000"));
//        payment_list.add(new PaymentModel("565","Hammer","70","90000"));
//        return payment_list;
   }
}