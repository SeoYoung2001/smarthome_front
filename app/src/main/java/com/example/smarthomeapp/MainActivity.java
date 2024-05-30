package com.example.smarthomeapp;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

    private static final String KEY_TEMPERATURE = "temperature";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.Temp_Btn);
        button2 = findViewById(R.id.Door_Btn);
        button3 = findViewById(R.id.Light_Btn);
        button4 = findViewById(R.id.Sensor_Btn);
        button6 = findViewById(R.id.Lcd_Btn);
        button8=findViewById(R.id.wifiBtn);

        textView = findViewById(R.id.MainTemp_txt);
        if (savedInstanceState != null) {
            // Restore the temperature if available
            String savedTemperature = savedInstanceState.getString(KEY_TEMPERATURE);
            if (savedTemperature != null) {
                textView.setText(savedTemperature);
            }
        } else {
            // Get intent and retrieve data
            Intent i = getIntent();
            String temperature = i.getStringExtra("temperature");

            // Check for null values and set text
            if (temperature != null) {
                textView.setText(temperature);
            } else {
                textView.setText(" ");
            }
        }

        // Set up OnClickListeners using a common method
        setupButtonListeners();
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save the temperature
        outState.putString(KEY_TEMPERATURE, textView.getText().toString());
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