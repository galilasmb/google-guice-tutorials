package com.mvpjava.guicetutorial.singleImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;

//Code modified of the project: https://github.com/mvpjava/google-guice-tutorials.git

public class Main {

    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);

        service.start(100.00D);

    }
}
