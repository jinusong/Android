package com.example.dsm2018.secret;

public class ListViewitem {
    private int type;
    private String NameStr;
    private String SubStr;
    public void setName(int type) { this.type = type; }
    public void setName(String title) { NameStr = title; }
    public void setSub(String desc) { SubStr = desc; }
    public int getType() { return this.type; }
    public String getName() { return this.NameStr; }
    public String getSub() { return this.SubStr; }
}
