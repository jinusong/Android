package com.example.dsm2018.dmsq;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class model {
    @SerializedName("lunch")
    List<String> lunch = new ArrayList<String>();
    public List<String> getLunch() {return lunch;}

    @SerializedName("dinner")
    List<String> dinner = new ArrayList<String>();
    public List<String> getDinner() {return dinner;}

    @SerializedName("breakfast")
    List<String> breakfast = new ArrayList<String>();
    public List<String> getBreakfast() {return breakfast;}
}