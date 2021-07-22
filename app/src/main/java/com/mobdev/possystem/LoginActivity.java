package com.mobdev.possystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;
//import com.google.firebase.database.annotations.NotNull;

public class LoginActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;

    String userName = "";
    String userPassword = "";

    /* Class to hold credentials */
    class Credentials
    {
        String name = "Admin";
        String password = "123456";
    }

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Bind the XML views to Java Code Elements */
        eName = findViewById(R.id.editTextName);
        ePassword = findViewById(R.id.editTextTextPassword);
        eLogin = findViewById(R.id.buttonSignIn);


        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userName = eName.getText().toString();
                userPassword = ePassword.getText().toString();

                if(userName.isEmpty() || userPassword.isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "Please enter name and password!", Toast.LENGTH_LONG).show();

                }else {

                    isValid = validate(userName, userPassword);


                    if (!isValid) {
                            Toast.makeText(LoginActivity.this, "Incorrect credentials, please try again!", Toast.LENGTH_LONG).show();
                        }

                    else {
                        Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_LONG).show();
//                        startActivity(new Intent(LoginActivity.this, ShopOwnerHomeActivity.class));
                    }

                }
            }
        });
    }

    private boolean validate(String userName, String userPassword)
    {
        Credentials credentials = new Credentials();

        if(userName.equals(credentials.name) && userPassword.equals(credentials.password))
        {
            return true;
        }

        return false;
    }
}
