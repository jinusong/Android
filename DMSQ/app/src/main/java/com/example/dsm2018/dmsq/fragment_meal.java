package com.example.dsm2018.dmsq;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Date;

public class Fragment_meal extends android.support.v4.app.Fragment {

    String date;


    public Fragment_meal() {
    }

    @SuppressLint("ValidFragment")
    public Fragment_meal(String date) {
        this.date = date;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getValue();
        View view = (View) inflater.inflate(R.layout.fragment_meal, container, false);
        return view;
    }

    public void getValue() {
        Connector connector = new Connector();
        connector.init(date);
        TextView printbreakfast;
        printbreakfast= (TextView) findViewById(R.id.breakfast_meal_content);
        printbreakfast.setText(getbreakfast.toString());
    }

}
