package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";

    //For view
    public River() {
        Log.d(TAG, "Tamer River: ");
    }

    public String getWater() {
        return "water";
    }
}
