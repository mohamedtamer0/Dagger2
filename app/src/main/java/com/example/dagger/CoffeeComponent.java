package com.example.dagger;

import dagger.Component;

@Component
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

}
