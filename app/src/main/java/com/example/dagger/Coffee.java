package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";

    @Inject
     Farm farm;


     River river;

    @Inject
    public Coffee(River river) {
        this.river = river;
    }
    

    @Inject
    public void connectEle(){
        Log.d(TAG, "Tamer connectEle: connection...");
    }
    
    public String getCoffeeCup(){
        return  farm.getBeans() + "+" + river.getWater();
    }

}
