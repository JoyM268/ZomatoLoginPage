package com.joy.zomato;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import android.view.WindowManager;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loginIntent = new Intent(MainActivity.this, Login.class);
                startActivity(loginIntent);
                finish();
            }
        }, 2000);
    }
}