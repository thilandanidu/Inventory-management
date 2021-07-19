package com.mobdev.possystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.mobdev.possystem.AdapterClasses.DailySalesAdapter;
import com.mobdev.possystem.ModelClasses.DailySalesModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DailySalesReportActivity extends AppCompatActivity
{
    RecyclerView recycler_view;
    DailySalesAdapter adapter;

    // calendar
    private DatePickerDialog datePickerDialog;
    private Button dateButton;
    private Button backButton, printButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_sales_report);


        //// initialize
        backButton = findViewById(R.id.back_btn);
        printButton = findViewById(R.id.print_btn);

        // initialize RecycleView
        recycler_view = findViewById(R.id.recycler_view);
        setRecyclerView();

        // initialize date picker
        dateButton = findViewById(R.id.datepicker_btn);
        initDatePicker();
        // to show today's date by default
        dateButton.setText(getTodayDate());



        // backButton
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(DailySalesReportActivity.this, MainActivity.class));
            }
        });
    }



    ///// ****RecyclerView****
    private void setRecyclerView() {
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DailySalesAdapter(this, getList());
        recycler_view.setAdapter(adapter);
    }

    private List<DailySalesModel> getList() {
        List<DailySalesModel> payment_list = new ArrayList<>();
        payment_list.add(new DailySalesModel("0001","Nail 6inch box","02","100"));
        payment_list.add(new DailySalesModel("0200","Rhino roofing sheets","20","23000"));
        payment_list.add(new DailySalesModel("0563","Arpico Hybrid tank 1000L","60","14000"));
        payment_list.add(new DailySalesModel("0365","Philip srews","20","5930"));
        payment_list.add(new DailySalesModel("0565","Multibond Contact Hose","70","9070"));
        payment_list.add(new DailySalesModel("0001","Nail 6inch box","02","100"));
        payment_list.add(new DailySalesModel("0200","Rhino roofing sheets","20","23000"));
        payment_list.add(new DailySalesModel("0563","Arpico Hybrid tank 1000L","60","14000"));
        payment_list.add(new DailySalesModel("0365","Philip srews","20","5930"));
        payment_list.add(new DailySalesModel("0565","Multibond Contact Hose","70","9070"));
        payment_list.add(new DailySalesModel("0001","Nail 6inch box","02","100"));
        payment_list.add(new DailySalesModel("0200","Rhino roofing sheets","20","23000"));
        payment_list.add(new DailySalesModel("0563","Arpico Hybrid tank 1000L","60","14000"));
        payment_list.add(new DailySalesModel("0365","Philip srews","20","5930"));
        payment_list.add(new DailySalesModel("0565","Multibond Contact Hose","70","9070"));
        payment_list.add(new DailySalesModel("0001","Nail 6inch box","02","100"));
        payment_list.add(new DailySalesModel("0200","Rhino roofing sheets","20","23000"));
        payment_list.add(new DailySalesModel("0563","Arpico Hybrid tank 1000L","60","14000"));
        payment_list.add(new DailySalesModel("0365","Philip srews","20","5930"));
        payment_list.add(new DailySalesModel("0565","Multibond Contact Hose","70","9070"));
        payment_list.add(new DailySalesModel("0001","Nail 6inch box","02","100"));
        payment_list.add(new DailySalesModel("0200","Rhino roofing sheets","20","23000"));
        payment_list.add(new DailySalesModel("0563","Arpico Hybrid tank 1000L","60","14000"));
        payment_list.add(new DailySalesModel("0365","Philip srews","20","5930"));
        payment_list.add(new DailySalesModel("0565","Multibond Contact Hose","70","9070"));
        return payment_list;
    }


    private void initDatePicker()
    {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day)
            {
                month = month + 1;
                String date = makeDateString(day, month, year);
                dateButton.setText(date);

            }
        };

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        //
        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(this, style, dateSetListener, year, month, day);

        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis()); // give the system current time


    }
    private String makeDateString(int day, int month, int year)
    {
        return getMonthFormat(month) + " " + day + " " + year;
    }

    private String getMonthFormat(int month)
    {
        if ( month == 1)
            return "JAN";
        if ( month == 2)
            return "FEB";
        if ( month == 3)
            return "MAR";
        if ( month == 4)
            return "APR";
        if ( month == 5)
            return "MAY";
        if ( month == 6)
            return "JUN";
        if ( month == 7)
            return "JUL";
        if ( month == 8)
            return "AUG";
        if ( month == 9)
            return "SEP";
        if ( month == 10)
            return "OCT";
        if ( month == 11)
            return "NOV";
        if ( month == 12)
            return "DEC";
        // default should never happen
        return "JAN";
    }

    public void openDatePicker(View view)
    {
        datePickerDialog.show();
    }

    private String getTodayDate()
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month = month + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);
    }

}