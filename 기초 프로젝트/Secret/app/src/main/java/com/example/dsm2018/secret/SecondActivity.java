package com.example.dsm2018.secret;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    FirstFragment fragment_first = new FirstFragment();
    SecondFragment fragment_second = new SecondFragment();
    ThirdFragment fragment_third = new ThirdFragment();
    ViewPager vp;
    int Max_Page = 3;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button LeftButton = (Button) findViewById(R.id.left_button);
        Button RightButton = (Button) findViewById(R.id.right_button);
        vp=(ViewPager)findViewById(R.id.fragment1);
        vp.setAdapter(new adapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);
        LeftButton.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                 position = position - 1;
                if(position < 0){ position = 0; }
                vp.setCurrentItem(position);
            }
        });
        RightButton.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                position = position + 1;
                if(position > 2){ position = 2; }
                vp.setCurrentItem(position);
            }
        });
    }



    private class adapter extends FragmentPagerAdapter {
        public adapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            if(position<0 || Max_Page<=position)
                return null;
            switch (position){
                case 0: return fragment_first;
                case 1: return fragment_second;
                case 2: return fragment_third ;
            }
            return null;
        }
        @Override
        public int getCount() {
            return Max_Page;
        }
    }
}
