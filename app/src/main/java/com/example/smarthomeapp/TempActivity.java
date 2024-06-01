package com.example.smarthomeapp;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.content.Context;
import android.content.SharedPreferences;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ImageButton;
import android.content.Intent;
import com.google.android.material.button.MaterialButton;
public class TempActivity extends AppCompatActivity {
    Button button1;
    public final String EXTRA_MESSAGE = "com.example.Application0103.MESSAGE";
    private static final String KEY_TEMPERATURE = "temperature";
    private static final String KEY_HUMIDITY = "humidity";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        final TextView textView =  findViewById(R.id.temp);
        final TextView textView2 = findViewById(R.id.humidity);
        SeekBar seekBar = findViewById(R.id.sb1);
        SeekBar seekBar2 = findViewById(R.id.sb2);
        button1=findViewById(R.id.temphudtxt_btn);




        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText(i + "°C");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView2.setText(i + "%");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temperature = textView.getText().toString(); // 온도 텍스트 가져오기
                String humidity = textView2.getText().toString(); // 습도 텍스트 가져오기
                Intent intent = new Intent(TempActivity.this,MainActivity.class);
                intent.putExtra("temperature", temperature);
                intent.putExtra("humidity", humidity);
                startActivity(intent);

            }
        });



    }


}