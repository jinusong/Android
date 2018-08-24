package com.example.dsm2018.recyclerview_practice;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CostomViewPager();

        CostomRecyclerView();
    }

    public void CostomViewPager(){
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
    }


    public void CostomRecyclerView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("송진우", "슈퍼 울트라 짱짱 맨"));
        itemList.add(new Item("김지혁", "공부안함"));
        itemList.add(new Item("이규준", "웹크롤링함"));
        itemList.add(new Item("김윤재", "서버왕"));

        Adapter adapter = new Adapter(itemList);
        recyclerView.setAdapter(adapter);

    }

    public class PagerAdapter extends FragmentStatePagerAdapter {

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return PageFragment.create(i);
        }

        @Override
        public int getCount() {
            return 5;
        }
    }

}
