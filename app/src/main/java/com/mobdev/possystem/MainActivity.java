package com.mobdev.possystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvSignIn, tvFollow, tvName, tvPassword;
    EditText etName, etTextPassword;
    Button btSignIn;
    ImageView ibBackLanding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        getSupportActionBar().hide();

        tvSignIn = findViewById(R.id.textViewSignIn);
        tvFollow = findViewById(R.id.textViewFollow);
        tvName = findViewById(R.id.textViewName);
        tvPassword = findViewById(R.id.textViewPassword);
        etName = findViewById(R.id.editTextName);
        etTextPassword = findViewById(R.id.editTextTextPassword);
        btSignIn = findViewById(R.id.buttonSignIn);
        ibBackLanding = findViewById(R.id.imageButtonBackLanding);

        btSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().equals("admin") &&
                etTextPassword.getText().toString().equals("password")){

                }
            }
        });
    }
}