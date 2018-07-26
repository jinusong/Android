package com.example.dsm2018.dmsq;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_meal9 extends android.support.v4.app.Fragment{

    String date;
    String year;
    String month_day;
    String week_of_day;

    public Fragment_meal9() {
    }

    @SuppressLint("ValidFragment")
    public Fragment_meal9(String date, String year, String month_day, String week_of_day) {
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
        View view = (View) inflater.inflate(R.layout.fragment_meal, container, false);
        TextView breakfasttextview = (TextView) view.findViewById(R.id.breakfast_meal_content);
        breakfasttextview.setText(Connector.getBreakfast());
        TextView lunchtextview = (TextView) view.findViewById(R.id.lunch_meal_content);
        lunchtextview.setText(Connector.getLunch());
        TextView dinnertextview = (TextView) view.findViewById(R.id.dinner_meal_content);
        dinnertextview.setText(Connector.getDinner());
        TextView month_daytextview = (TextView) view.findViewById(R.id.text_meal_content_date);
        month_daytextview.setText(month_day);
        TextView yeartextview = (TextView) view.findViewById(R.id.text_meal_content_year);
        yeartextview.setText(year);
        TextView week_of_daytextview = (TextView) view.findViewById(R.id.week_meal_content);
        week_of_daytextview.setText(week_of_day);;

        return view;
    }

    public void getValue() {
        Connector connector = new Connector();
        connector.init(date);
    }

}
