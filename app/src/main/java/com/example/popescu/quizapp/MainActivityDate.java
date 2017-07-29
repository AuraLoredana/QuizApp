package com.example.popescu.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivityDate extends AppCompatActivity {
    DatePicker simpleDatePicker;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_date);
        final DatePicker simpleDatePicker = (DatePicker) findViewById(R.id.simpleDatePicker);
        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                String confirmation = "You have successfully set the next exam on:" +"\r"+ simpleDatePicker.getDayOfMonth()+ "/"+ (simpleDatePicker.getMonth()+ 1)+"/"+  simpleDatePicker.getYear();

                Toast.makeText(getApplicationContext(),confirmation, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(v.getContext(), MainActivityForm.class);
                startActivity(intent);
            }
        });
        int day = simpleDatePicker.getDayOfMonth();
        int month = simpleDatePicker.getMonth();
        int year = simpleDatePicker.getYear();
        int firstDay = simpleDatePicker.getFirstDayOfWeek();

    }
}

