package com.example.android.pneuma;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import customfonts.MyTextView;

public class student extends AppCompatActivity {


    Typeface fonts1;
    CheckBox remember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);


        remember = (CheckBox) findViewById(R.id.remember);

        fonts1 = Typeface.createFromAsset(student.this.getAssets(),
                "fonts/Lato-Light.ttf");

        TextView t4 = (TextView) findViewById(R.id.remember);
        t4.setTypeface(fonts1);

        MyTextView tv = (MyTextView) findViewById(R.id.signin1);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check the auth details from the sharedPreferences file
                Intent i = new Intent(v.getContext(), NavActivity2.class);
                startActivity(i);
            }
        });

    }
}
