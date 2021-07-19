package com.mobdev.possystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CreateCashierAccount extends AppCompatActivity {
    ImageView btnBack;
    Button btnConfirm;
    EditText etName;
    EditText etUsername;
    EditText etPassword;
    EditText etConfirmPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_cashier_account);

        etName = findViewById(R.id.editTextName);
        etUsername = findViewById(R.id.editTextUsername);
        etPassword = findViewById(R.id.editTextPassword);
        etConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        btnBack = findViewById(R.id.imageViewBack);
        btnConfirm = findViewById(R.id.buttonConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString();
                String confirmPassword = etConfirmPassword.getText().toString();

                if (TextUtils.isEmpty(name)){
                    etName.setError("Name is Required");
                    return;
                }
                if (TextUtils.isEmpty(username)){
                    etUsername.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    etPassword.setError("Phone is Required ");
                    return;
                }
                if (TextUtils.isEmpty(confirmPassword)){
                    etConfirmPassword.setError("Type Password again");
                    return;
                }
                if (password.length() < 6){
                    etPassword.setError("Password  Must be >= 6 Characters");
                }
            }
        });



    }
}