package com.example.smarthomeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WifiActivity extends AppCompatActivity {
    Button button;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        button=findViewById(R.id.myhomeBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WifiActivity.this, WifiLoginActivity.class));

            }
        });
    }
}
