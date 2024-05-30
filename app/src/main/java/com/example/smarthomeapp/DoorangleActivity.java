package com.example.smarthomeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DoorangleActivity extends AppCompatActivity {
    Button button1;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doorangle);
        final EditText edittext=(EditText)findViewById(R.id.angle_input);
        button1= findViewById(R.id.door_editBtn);
        final TextView textView=(TextView)findViewById(R.id.doortext);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(edittext.getText());
            }
        });


    }
}
