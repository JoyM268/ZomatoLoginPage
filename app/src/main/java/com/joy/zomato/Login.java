package com.joy.zomato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {

    MaterialButton login;
    EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.login);
        phone = findViewById(R.id.phone);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNo = phone.getText().toString();
                if(phoneNo.length() != 10 ){
                    Toast.makeText(v.getContext(), "Phone number should be of 10 digits", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(v.getContext(), "Login Successful", Toast.LENGTH_LONG).show();
                    Intent loggedInIntent = new Intent(Login.this, LoggedIn.class);
                    loggedInIntent.putExtra("phone", phoneNo);
                    startActivity(loggedInIntent);
                }
            }
        });
    }
}