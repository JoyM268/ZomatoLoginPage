package com.joy.zomato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoggedIn extends AppCompatActivity {

    MaterialButton logout;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        Intent loginIntent = getIntent();
        String phone = loginIntent.getStringExtra("phone");
        login = findViewById(R.id.login);
        login.setText("Welcome " + phone + "\nLogged In Successfully");
        logout = findViewById(R.id.logout);
        Intent home = new Intent(LoggedIn.this, Login.class);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Successfully Logged out", Toast.LENGTH_LONG).show();
                startActivity(home);
            }
        });
    }
}