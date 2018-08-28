package com.example.dsm2018.weekend;

public class GetterSetter {
    public String price;
    public String item;
    public String item_count;

    public String getPrice(){
        return price;
    }

    public String getItem() {
        return item;
    }

    public String getItem_count() {
        return item_count;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public void setItem(String item){
        this.item = item;
    }

    public void setItem_count(String item_count) {
        this.item_count = item_count;
    }
}
