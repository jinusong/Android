package com.example.dsm2018.secret;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    FirstFragment fragment_first = new FirstFragment();
    SecondFragment fragment_second = new SecondFragment();
    ThirdFragment fragment_third = new ThirdFragment();
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button LeftButton = (Button) findViewById(R.id.left_button);
        Button RightButton = (Button) findViewById(R.id.right_button);
        LeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentChanged(position-=1);
            }
        });
        RightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFragmentChanged(position+=1);
            }
        });
    }

    public void onFragmentChanged(int index) {
        position = index;
        if(position == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment_first).commit();
        } else if (position == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment_second).commit();
        } else if (position == 2) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragment_third).commit();
        }
    }
}
