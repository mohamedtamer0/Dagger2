package com.example.dagger;

import javax.inject.Inject;

public class River {
    @Inject
    public River() {
    }

    public String getWater() {
        return "water";
    }
}
