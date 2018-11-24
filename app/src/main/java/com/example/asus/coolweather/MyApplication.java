package com.example.asus.coolweather;

import android.app.Application;

import org.litepal.LitePal;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        LitePal.initialize(this);
        super.onCreate();
    }
}
