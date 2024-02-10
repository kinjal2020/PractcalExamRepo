package com.example.practicalexam;

public class ToyModelClass {

    public String toyName;
    public double toyPrice;
    public String description;
    public double rate;

    public ToyModelClass(String toyName, String description, double toyPrice, double rate) {
        this.description = description;
        this.toyName = toyName;
        this.toyPrice = toyPrice;
        this.rate = rate;
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
}
