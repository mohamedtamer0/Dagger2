package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAinActivity";

    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component = ((MainApplication) getApplication()).getAppComponent();
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder().milk(4)
                .sugar(4).appComponent(component).build();
        coffeeComponent.inject(this);
        Log.d(TAG, "Tamer onCreate: " +
                "\n coffee 1: " + coffee +
                "\n coffee 2: " + coffee2 +
                "\n river for coffee1: " + coffee.river
                + "\n river for coffee2: " + coffee2.river
        );

    }
}