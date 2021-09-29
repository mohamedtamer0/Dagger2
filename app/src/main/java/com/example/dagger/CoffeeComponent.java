package com.example.dagger;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        Builder appComponent(AppComponent appComponent);

        CoffeeComponent build();
    }

}
