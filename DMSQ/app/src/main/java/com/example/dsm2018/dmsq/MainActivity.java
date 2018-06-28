package com.example.dsm2018.dmsq;



import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;
    int Max_Page = 7;

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
            Fragment_meal fragment_meal = new Fragment_meal(date.Date(position), date.Year(), date.Month_day(position), date.Week_of_Day(position));
            Fragment_meal1 fragment_meal1 = new Fragment_meal1(date.Date(position), date.Year(), date.Month_day(position), date.Week_of_Day(position));
            Fragment_meal2 fragment_meal2 = new Fragment_meal2(date.Date(position), date.Year(), date.Month_day(position), date.Week_of_Day(position));
            Fragment_meal3 fragment_meal3 = new Fragment_meal3(date.Date(position), date.Year(), date.Month_day(position), date.Week_of_Day(position));
            Fragment_meal4 fragment_meal4 = new Fragment_meal4(date.Date(position), date.Year(), date.Month_day(position), date.Week_of_Day(position));
            Fragment_meal5 fragment_meal5 = new Fragment_meal5(date.Date(position), date.Year(), date.Month_day(position), date.Week_of_Day(position));
            Fragment_meal6 fragment_meal6 = new Fragment_meal6(date.Date(position), date.Year(), date.Month_day(position), date.Week_of_Day(position));
            if(position<0 || Max_Page<=position)
                return null;

            switch (position){
                case 0:
                    return fragment_meal;
                case 1:
                    return fragment_meal1;
                case 2:
                    return fragment_meal2;
                case 3:
                    return fragment_meal3;
                case 4:
                    return fragment_meal4;
                case 5:
                    return fragment_meal5;
                case 6:
                    return fragment_meal6;
            }
            return null;
        }
        @Override
        public int getCount() {
            return Max_Page;
        }
    }
}
