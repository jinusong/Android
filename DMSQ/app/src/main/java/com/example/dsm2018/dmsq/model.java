package com.example.dsm2018.dmsq;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class model {
    @SerializedName("breakfast")
    List<String> breakfast = new ArrayList<String>();           // ``
    public List<String> getBreakfast() {return breakfast;} //아침 return

    @SerializedName("lunch")
    List<String> lunch = new ArrayList<String>();           //배열로 되어있는 값을 String 으로
    public List<String> getLunch() {return lunch;}         //점심 return

    @SerializedName("dinner")
    List<String> dinner = new ArrayList<String>();              // ``
    public List<String> getDinner() {return dinner;}       //저녁 return
}