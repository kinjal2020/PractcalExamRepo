package com.example.practicalexam;

public class ToyCartModel {

    public String toyName;
    public  int qty;
    public int toyPrice;
    public String description;
    public int rate;

    public ToyCartModel(String toyName, String description, int toyPrice, int rate,int qty) {
        this.description = description;
        this.toyName = toyName;
        this.toyPrice = toyPrice;
        this.rate = rate;
        this.qty=qty;
    }

    public String getToyName(){
        return  toyName;
    }

    public double getRate() {
        return rate;
    }

    public double getToyPrice() {
        return toyPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getQty() {
        return qty;
    }
}
