package com.example.dsm2018.dmsq;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


@SuppressLint("ValidFragment")
public class Fragment_meal extends android.support.v4.app.Fragment {

    String date;
    String year;
    String month_day;
    String week_of_day;

    @SuppressLint("ValidFragment")
    public Fragment_meal(String date, String year, String month_day, String week_of_day) {
        this.date = date;
        this.year = year;                           //MainActivity 에서 전달하는 값 각 필드에 담기
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
        View view = inflater.inflate(R.layout.fragment_meal, container, false);     //전체 View
        TextView breakfasttextview = view.findViewById(R.id.breakfast_meal_content);
        breakfasttextview.setText(Connector.getBreakfast());                                //breakfast 에 아침밥 정보를 텍스트로 표현
        TextView lunchtextview =view.findViewById(R.id.lunch_meal_content);
        lunchtextview.setText(Connector.getLunch());                                        //lunch 에 점심밥 정보를 텍스트로 표현
        TextView dinnertextview = view.findViewById(R.id.dinner_meal_content);
        dinnertextview.setText(Connector.getDinner());                                      //dinner 에 저녁밥 정보를 텍스트로 표현
        TextView month_daytextview = view.findViewById(R.id.text_meal_content_date);
        month_daytextview.setText(month_day);                                           //몇월 몇일인지 텍스트로 표현
        TextView yeartextview =view.findViewById(R.id.text_meal_content_year);
        yeartextview.setText(year);                                                     //년도 표현
        TextView week_of_daytextview = view.findViewById(R.id.week_meal_content);
        week_of_daytextview.setText(week_of_day);                                       //요일 날짜 표현


        return view;        //변경한 view return
    }

    public void getValue() {
        Connector connector = new Connector();      //Connector 객체 생성
        connector.init(date);                   //init 에 date 전달
    }

}
