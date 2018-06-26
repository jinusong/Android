package com.example.dsm2018.dmsq;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_meal3 extends android.support.v4.app.Fragment{

    String date;

    public Fragment_meal3() {
    }

    @SuppressLint("ValidFragment")
    public Fragment_meal3(String date) {
        this.date = date;
    }


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getValue();
        View view = (View) inflater.inflate(R.layout.fragment_meal3, container, false);
        TextView breakfasttextview = (TextView) view.findViewById(R.id.breakfast_meal_content);
        breakfasttextview.setText(Connector.getBreakfast());
        TextView lunchtextview = (TextView) view.findViewById(R.id.lunch_meal_content);
        lunchtextview.setText(Connector.getLunch());
        TextView dinnertextview = (TextView) view.findViewById(R.id.dinner_meal_content);
        dinnertextview.setText(Connector.getDinner());
        return view;

    }

    public void getValue() {
        Connector connector = new Connector();
        connector.init(date);
    }

}