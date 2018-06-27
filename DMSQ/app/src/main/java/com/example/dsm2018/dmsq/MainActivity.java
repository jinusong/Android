package com.example.dsm2018.dmsq;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;

    DateAdder date = new DateAdder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=(ViewPager)findViewById(R.id.page_meal);
        vp.setAdapter(new adapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);
    }
    View.OnClickListener movePageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            int tag = (int) v.getTag();
            vp.setCurrentItem(tag);
        }
    };
    private class adapter extends FragmentPagerAdapter {
        public adapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Fragment_meal(date.Date(0), date.Year(), date.Month_day(0), date.Week_of_Day(0));
                case 1:
                    return new Fragment_meal1(date.Date(1), date.Year(), date.Month_day(1), date.Week_of_Day(1));
                case 2:
                    return new Fragment_meal2(date.Date(2), date.Year(), date.Month_day(2), date.Week_of_Day(2));
                case 3:
                    return new Fragment_meal3(date.Date(3), date.Year(), date.Month_day(3), date.Week_of_Day(3));
                case 4:
                    return new Fragment_meal4(date.Date(4), date.Year(), date.Month_day(4), date.Week_of_Day(4));
                case 5:
                    return new Fragment_meal5(date.Date(5), date.Year(), date.Month_day(5), date.Week_of_Day(5));
                case 6:
                    return new Fragment_meal6(date.Date(6), date.Year(), date.Month_day(6), date.Week_of_Day(6));
                case 7:
                    return new Fragment_meal7(date.Date(7), date.Year(), date.Month_day(7), date.Week_of_Day(7));
                case 8:
                    return new Fragment_meal8(date.Date(8), date.Year(), date.Month_day(8), date.Week_of_Day(8));
                case 9:
                    return new Fragment_meal9(date.Date(9), date.Year(), date.Month_day(9), date.Week_of_Day(9));
            }
            return null;
        }
        @Override
        public int getCount() {
            return 10;
        }
    }
}
