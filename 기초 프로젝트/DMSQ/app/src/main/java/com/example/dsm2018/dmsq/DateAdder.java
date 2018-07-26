package com.example.dsm2018.dmsq;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAdder {
    String stringDate=null;
    String Year=null;                           //각 필드 초기화
    String Month_day=null;
    String Day=null;
    long now = System.currentTimeMillis();                  //지금 시간 가져오기
    Date date = new Date(now);
    SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");      //ymd 에 date 를 yyyy-MM-dd 형식으로 설정
    SimpleDateFormat year = new SimpleDateFormat("yyyy");            //year 에 date 를 yyyy 형식으로 설정
    SimpleDateFormat month_day = new SimpleDateFormat("MM월 dd일"); //month_day 에 date 를 MM월 dd일 형식으로 설정
    Calendar calendar = Calendar.getInstance();
    public void setTime() { calendar.setTime(date); }           //현재시간 set 하기

    public String Date(int i) {
        setTime();
        calendar.add(Calendar.DATE, +i);    //i만큼 DATE 더하기
        stringDate = ymd.format(calendar.getTime());  //값 String 타입으로 담음
        return stringDate;
    }
    public String Year() {
        setTime();
        Year = year.format(calendar.getTime());
        return Year;
    }
    public String Month_day(int i) {
        setTime();
        calendar.add(Calendar.DATE, +i);
        Month_day = month_day.format(calendar.getTime());
        return Month_day;
    }
    public String Week_of_Day(int i){
        setTime();
        calendar.add(Calendar.DATE, +i);
        int DayNum = calendar.get(Calendar.DAY_OF_WEEK);    //일주일 날짜 번호가져오기
        switch (DayNum) {
            case 1: Day = "일요일"; break;
            case 2: Day = "월요일"; break;
            case 3: Day = "화요일"; break;
            case 4: Day = "수요일"; break;                 //일주일 날짜 번호에 따라 각 값 리턴
            case 5: Day = "목요일"; break;
            case 6: Day = "금요일"; break;
            case 7: Day = "토요일"; break;
        }
        return Day;
    }
}
