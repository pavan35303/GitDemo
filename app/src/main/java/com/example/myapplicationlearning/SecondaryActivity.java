package com.example.myapplicationlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondaryActivity extends AppCompatActivity {
    private Button register_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        register_button = (Button) findViewById(R.id.button_back);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
               onBackPressed();
            }
        });


    }
}
