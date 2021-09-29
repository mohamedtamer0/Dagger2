package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {

    private static final String TAG = "Coffee";

    @Inject
     Farm farm;


     River river;
     int sugar;
    int milk;

    @Inject
    public Coffee(River river, @Sugar int sugar,@Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }
    

    @Inject
    public void connectEle(){
        Log.d(TAG, "Tamer connectEle: connection...");
    }
    
    public String getCoffeeCup(){
        return  farm.getBeans() + "+" + river.getWater() + "sugar: " + sugar+ "Milk: " + milk;
    }

}
