package com.example.dsm2018.recyclerview_practice;

public class Item {
    public String name;
    public String Information;

    public Item(String name, String Information) {
        this.name = name;
        this.Information = Information;
    }
    public String getName(){
        return name;
    }
    public String getInformation(){
        return Information;
    }
}
