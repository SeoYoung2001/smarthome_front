package com.example.smarthomeapp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
public class TempActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        TextView textView =findViewById(R.id.tv1);
        SeekBar seekBar =findViewById(R.id.sb1);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar sb1, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar sb1) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar sb1) {

            }
        });
    }

}