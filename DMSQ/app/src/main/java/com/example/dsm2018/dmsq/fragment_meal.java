package com.example.dsm2018.dmsq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class fragment_meal extends android.support.v4.app.Fragment {
    public fragment_meal()
    {

    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = (View) inflater.inflate(R.layout.fragment_meal, container, false);
        return view;
    }
}

