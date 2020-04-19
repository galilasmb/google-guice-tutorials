package com.mvpjava.guicetutorial.singleImpl;

import com.google.inject.multibindings.Multibinder;

public class DiscountGuiceModule  extends com.google.inject.AbstractModule{

    @Override
    protected void configure() {
//        bind(Discountable.class).to(NightOwlDiscount.class); //Just one class

//        Create MultiBinder to more one class
        Multibinder<Discountable> multiBinder = Multibinder.newSetBinder(binder(), Discountable.class);
        multiBinder.addBinding().to(NightOwlDiscount.class);
        multiBinder.addBinding().to(EarlyBirdDiscount.class);
        multiBinder.addBinding().to(MorningOwlDiscount.class);
    }
    
}
