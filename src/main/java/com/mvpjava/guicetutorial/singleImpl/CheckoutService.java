package com.mvpjava.guicetutorial.singleImpl;

import com.google.inject.Inject;

import java.util.Set;

public class CheckoutService {

    private Set<Discountable> discountables;

//    Doing the Inject with the classes
    @Inject
    public CheckoutService(Set<Discountable> discountables) {
        this.discountables = discountables;
    }

//    Starting
    public void start(double shoppingCartTotal){
        for (Discountable discountable: discountables) {
            checkout(discountable.getDiscount(), shoppingCartTotal);
        }
    }

//    Print the discountables
    public double checkout(double discountable, double shoppingCartTotal) {
        double totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discountable);
        System.out.printf("Shopping cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n",
                shoppingCartTotal, discountable * 100, totalAfterDiscount);
        return totalAfterDiscount;
    }
}
