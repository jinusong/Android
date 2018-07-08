package com.example.dsm2018.secret;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


public class ThirdActivity extends AppCompatActivity{
    private ListView listview ;
    private ListViewAdapter adapter;
    private String[] Name = {"정다은","장소희","신은주", "윤석민", "손예섬",
    "손승용", "정경서", "김윤재"};
    private String[] Sub = {"난 짱이야","난 귀여워","난 예뻐","난 섹시해", "난 사랑스러워",
    "난 우주최강이야", "난 멋있어", "난 없어"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        adapter = new ListViewAdapter();

        listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);

        for(int i=0; i<Name.length;i++){
            adapter.add(Name[i],Sub[i]);
        }
    }
}
