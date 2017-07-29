package com.example.popescu.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.popescu.quizapp.R;

public class MainActivityForm extends AppCompatActivity {
    Button dtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);
        dtb = (Button)findViewById(R.id.dtb);
        dtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivityDB.class);
                startActivity(intent);
            }

        });
    }
}