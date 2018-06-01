package com.gebeya.mahmai.movie_theatre_admin.utils;


import android.app.Application;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatDelegate;

import org.jetbrains.annotations.NotNull;


import timber.log.Timber;

public class App extends Application {

    public static SharedPreferences preferences;
    public static final String KEY_LOGGED_IN = "LOGGED_IN";
    public static String SESSION_TOKEN;
    public static String USER_ID;

    @Override
    public void onCreate() {
        super.onCreate();

        preferences = getApplicationContext().getSharedPreferences("MOVIES", MODE_PRIVATE);
        SESSION_TOKEN = preferences.getString("token", null);
        USER_ID = preferences.getString("user_id", null);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        Timber.plant(new Timber.DebugTree() {

            @Override
            protected String createStackElementTag(@NotNull StackTraceElement element) {
                return super.createStackElementTag(element) + " : " + element.getLineNumber();
            }
        });
    }

}
