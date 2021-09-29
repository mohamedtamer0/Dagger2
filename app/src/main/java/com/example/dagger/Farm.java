package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;


public class Farm {
    private static final String TAG = "Farm";

    @Inject
    public Farm() {
        Log.d(TAG, "Tamer Farm: ");
    }

    public String getBeans() {
        return "Beans";
    }

}
