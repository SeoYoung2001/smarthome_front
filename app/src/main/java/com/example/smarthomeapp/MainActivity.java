package com.example.smarthomeapp;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.Context;
import android.widget.RadioButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
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

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button6;
    ImageButton button8;
    TextView textView;
    TextView textView2;
    SharedPreferences sharedPref;

    private static final String KEY_TEMPERATURE = "temperature";
    private static final String KEY_HUMIDITY = "humidity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.Temp_Btn);
        button2 = findViewById(R.id.Door_Btn);
        button3 = findViewById(R.id.Light_Btn);
        button4 = findViewById(R.id.Sensor_Btn);
        button6 = findViewById(R.id.Lcd_Btn);
        button8 = findViewById(R.id.wifiBtn);
        textView = findViewById(R.id.MainTemp_txt);
        textView2 = findViewById(R.id.MainHud_txt);

        if (savedInstanceState != null) {
            // Restore the temperature and humidity if available
            String savedTemperature = savedInstanceState.getString(KEY_TEMPERATURE);
            String savedHumidity = savedInstanceState.getString(KEY_HUMIDITY);
            if (savedTemperature != null) {
                textView.setText(savedTemperature);
            }
            if (savedHumidity != null) {
                textView2.setText(savedHumidity);
            }
        } else {
            // Get intent and retrieve data
            Intent i = getIntent();
            String temperature = i.getStringExtra("temperature");
            String humidity = i.getStringExtra("humidity");

            // Check for null values and set text
            if (temperature != null) {
                textView.setText(temperature);
            } else {
                textView.setText("온도");
            }

            if (humidity != null) {
                textView2.setText(humidity);
            } else {
                textView2.setText("습도");
            }
        }

        setupButtonListeners();

    }





    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_TEMPERATURE, textView.getText().toString());
        outState.putString(KEY_HUMIDITY, textView2.getText().toString());
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore the temperature and humidity if available
        String savedTemperature = savedInstanceState.getString(KEY_TEMPERATURE);
        String savedHumidity = savedInstanceState.getString(KEY_HUMIDITY);
        if (savedTemperature != null) {
            textView.setText(savedTemperature);
        }
        if (savedHumidity != null) {
            textView2.setText(savedHumidity);
        }
    }




    private void setupButtonListeners() {
        button1.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, TempActivity.class)));
        button2.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, DoorActivity.class)));
        button3.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, LightActivity.class)));
        button4.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, SensorActivity.class)));
        button6.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, LcdActivity.class)));
        button8.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, WifiActivity.class)));
    }







}