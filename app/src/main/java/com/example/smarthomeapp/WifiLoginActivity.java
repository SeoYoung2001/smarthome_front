package com.example.smarthomeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WifiLoginActivity extends AppCompatActivity {
    Button button;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifilogin);
        button=findViewById(R.id.wifips_btn);
        final EditText edittext=(EditText)findViewById(R.id.edit_wifips);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittext.getText().toString().equals("1111")){
                    Toast.makeText(WifiLoginActivity.this,"연결 성공",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(WifiLoginActivity.this,"연결 실패",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
