package com.example.dsm2018.dmsq;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAdder {
    String stringDate=null;
    String Year=null;
    String Month_day=null;
    String Day=null;
    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-DD");
    SimpleDateFormat year = new SimpleDateFormat("yyyy");
    SimpleDateFormat month_day = new SimpleDateFormat("MM월 dd일");
    Calendar calendar = Calendar.getInstance();
    public void setTime(){ calendar.setTime(date); }

    public String Date(int i) {
        setTime();
        calendar.add(Calendar.DATE, +i);
        stringDate = ymd.format(calendar.getTime());
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
        int DayNum = calendar.get(Calendar.DAY_OF_WEEK);
        switch (DayNum) {
            case 1: Day = "일요일"; break;
            case 2: Day = "월요일"; break;
            case 3: Day = "화요일"; break;
            case 4: Day = "수요일"; break;
            case 5: Day = "목요일"; break;
            case 6: Day = "금요일"; break;
            case 7: Day = "토요일"; break;
        }
        return Day;
    }
}
