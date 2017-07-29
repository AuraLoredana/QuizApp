package com.example.popescu.quizapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivityPhoto extends AppCompatActivity {
    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_photo);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
        Timer tm = new Timer();
        tm.scheduleAtFixedRate(new MyTimer(),2000,2000);
    }
public class MyTimer extends TimerTask {
    @Override
    public void run(){
        MainActivityPhoto.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(viewPager.getCurrentItem()==0){
                    viewPager.setCurrentItem(1);
                }
                else if(viewPager.getCurrentItem()==1) {
                    viewPager.setCurrentItem(2);
                }
                else if(viewPager.getCurrentItem()==2) {
                    viewPager.setCurrentItem(3);
                }
                else if(viewPager.getCurrentItem()==3){
                        viewPager.setCurrentItem(4);
                }else
                {
                    viewPager.setCurrentItem(0);
                }
            }

        });
    }
}
}
