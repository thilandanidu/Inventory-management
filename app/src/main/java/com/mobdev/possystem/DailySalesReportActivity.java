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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DailySalesReportActivity extends AppCompatActivity
{
    RecyclerView recycler_view;
    PaymentAdapter adapter;

    // calendar
    private DatePickerDialog datePickerDialog;
    private Button dateButton;
    private Button backButton, printButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        adapter = new PaymentAdapter(this, getList());
        recycler_view.setAdapter(adapter);
    }

    private List<PaymentModel> getList() {
        List<PaymentModel> payment_list = new ArrayList<>();
        payment_list.add(new PaymentModel("001","Wire","30","100000"));
        payment_list.add(new PaymentModel("200","Bulb","20","230000"));
        payment_list.add(new PaymentModel("563","Cement","60","140000"));
        payment_list.add(new PaymentModel("365","Sand","20","1090000"));
        payment_list.add(new PaymentModel("565","Hammer","70","90000"));
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