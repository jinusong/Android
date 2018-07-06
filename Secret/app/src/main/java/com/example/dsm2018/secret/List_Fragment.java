package com.example.dsm2018.secret;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class List_Fragment extends ListFragment {
    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, LIST_MENU) ;

    ListView listview = (ListView) findViewById(R.id.listview1) ;
    listview.setAdapter(adapter) ;
}