package com.example.dsm2018.recyclerview_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private String[] name = {"아아", "아아으", "우우ㅜㅇ", "안아ㅣㄴ", "언어ㅏ너", "니아니어"};
    private String[] information = {"1", "2", "3", "4", "5", "6"};

    private ArrayList<Item> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();
        initData();

    }

    private void initLayout(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
    }

    private void initData(){
        List<Item> ItemList = new ArrayList<Item>();

        for(int i = 0; i < 20; i++){
            Item item = new Item(name[i], information[i]);
            item.getName();
            item.getInformation();
            ItemList.add(item);
        }
        recyclerView.setAdapter(new Adapter(items,R.layout.recyclerview_item));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }


}
