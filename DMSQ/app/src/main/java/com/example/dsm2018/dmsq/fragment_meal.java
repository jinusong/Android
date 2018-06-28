package com.example.dsm2018.dmsq;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;


@SuppressLint("ValidFragment")
public class Fragment_meal extends android.support.v4.app.Fragment {

    String date;
    String year;
    String month_day;
    String week_of_day;

    @SuppressLint("ValidFragment")
    public Fragment_meal(String date, String year, String month_day, String week_of_day) {
        this.date = date;
        this.year = year;
        this.month_day = month_day;
        this.week_of_day = week_of_day;
    }


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getValue();
        View view = inflater.inflate(R.layout.fragment_meal, container, false);
        TextView breakfasttextview = view.findViewById(R.id.breakfast_meal_content);
        breakfasttextview.setText(Connector.getBreakfast());
        TextView lunchtextview =view.findViewById(R.id.lunch_meal_content);
        lunchtextview.setText(Connector.getLunch());
        TextView dinnertextview = view.findViewById(R.id.dinner_meal_content);
        dinnertextview.setText(Connector.getDinner());
        TextView month_daytextview = view.findViewById(R.id.text_meal_content_date);
        month_daytextview.setText(month_day);
        TextView yeartextview =view.findViewById(R.id.text_meal_content_year);
        yeartextview.setText(year);
        TextView week_of_daytextview = view.findViewById(R.id.week_meal_content);
        week_of_daytextview.setText(week_of_day);


        return view;
    }

    public void getValue() {
        Connector connector = new Connector();
        connector.init(date);
    }

}
