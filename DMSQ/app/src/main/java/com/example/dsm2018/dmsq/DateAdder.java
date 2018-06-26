package com.example.dsm2018.dmsq;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAdder {
    String stringDate=null;
    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();
    public void setTime(){ calendar.setTime(date); }

    public String Date(int i) {
        setTime();
        calendar.add(Calendar.DATE, i);
        stringDate = ymd.format(calendar.getTime());
        return stringDate;
    }


}
