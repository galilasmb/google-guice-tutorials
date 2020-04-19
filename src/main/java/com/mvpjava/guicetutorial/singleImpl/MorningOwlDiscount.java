package com.mvpjava.guicetutorial.singleImpl;

public class MorningOwlDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.40;
    }
    
}
