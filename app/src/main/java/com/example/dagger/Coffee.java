package com.example.dagger;

import javax.inject.Inject;

public class Coffee {

    @Inject
     Farm farm;
    @Inject
     River river;

    @Inject
    public Coffee() {

    }

    public String getCoffeeCup(){
        return  farm.getBeans() + "+" + river.getWater();
    }

}
