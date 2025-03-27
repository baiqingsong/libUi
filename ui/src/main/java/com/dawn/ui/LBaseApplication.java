package com.dawn.ui;

import android.app.Application;
import android.content.Context;

public abstract class LBaseApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
    @SuppressWarnings("InfiniteRecursion")
    public static Context getAppContext(){
        return context;
    }
}
