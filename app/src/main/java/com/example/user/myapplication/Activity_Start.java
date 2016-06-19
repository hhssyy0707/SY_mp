package com.example.user.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity_Start extends AppCompatActivity{

    TextView main_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        main_text = (TextView)findViewById(R.id.main_text);
        Typeface myTypeface= Typeface.createFromAsset(getAssets(), "HU110.ttf");
        main_text.setTypeface(myTypeface);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Activity_Start.this, Activity_Main.class);
                startActivity(intent);
            }
        }, 2500);
    }
}
