package com.mobdev.releseone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mobdev.releseone.Controller.ItemAdapter;
import com.mobdev.releseone.Model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class Stocks extends AppCompatActivity {

    //TODO set notifyChanger
    ImageView imageView;
    Button updateBtn;
    Button printBtn;
    RecyclerView recycler_view_manage;

    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks);

        imageView = findViewById(R.id.backBtn);
        updateBtn = findViewById(R.id.updateBtn);
        printBtn = findViewById(R.id.printBtn);
        recycler_view_manage = findViewById(R.id.recycler_view_manage);

        //back_button
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Stocks.this,MainActivity.class);
                startActivity(i);
            }
        });

        // search and sorting functions
        //TODO : implement search view and sorting

        //update_button
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent();
                startActivity(i1);
            }
        });
        //print_button
        printBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent();
                startActivity(i2);
            }
        });
        //TODO : implement floating action button

        //recycler_view
        setRecyclerView();
    }

    private void setRecyclerView() {
        recycler_view_manage.setHasFixedSize(true);
        recycler_view_manage.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter = new ItemAdapter(this,getList());
        recycler_view_manage.setAdapter(itemAdapter);
    }

    private List<ItemModel> getList() {
        List<ItemModel> item_modelList = new ArrayList<>();
        item_modelList.add(new ItemModel("01586","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01568","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("47236","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01586","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01568","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("47236","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01586","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01568","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("47236","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01586","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01568","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("47236","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01586","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01568","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("47236","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01586","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01568","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("47236","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01586","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01568","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("47236","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01586","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01568","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("47236","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01586","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01568","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("47236","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("01586","Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("02486","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("00001","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("98238","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));
        item_modelList.add(new ItemModel("11111","Paint Robbialac 1 Liter","00970.00","01000.00","12.05.2020","48"));

        return item_modelList;
    }
}
