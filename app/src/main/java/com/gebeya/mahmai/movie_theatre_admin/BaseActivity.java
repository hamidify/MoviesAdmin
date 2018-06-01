package com.gebeya.mahmai.movie_theatre_admin;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.google.zxing.multi.qrcode.QRCodeMultiReader;
import com.google.zxing.qrcode.QRCodeReader;

import timber.log.Timber;

/**
 * Base class for every other activity
 */

@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {
    public static final String TAG = "DEV-Movie-Theatre-APP";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d( getClass().getSimpleName() + " Cycle ", "< ------------------------------ onCreate() ------------------------------ >\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        d( getClass().getSimpleName() + " LifeCycle ", "< ------------------------------ onStart() ------------------------------ >\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        d(getClass().getSimpleName() + " LifeCycle ", "< ------------------------------ onResume() ------------------------------ >\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        d(getClass().getSimpleName() + " LifeCycle ", "< ------------------------------ onPause() ------------------------------ >\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        d(getClass().getSimpleName() + " LifeCycle ", "< ------------------------------ onStop() ------------------------------ >\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        d("\n" + getClass().getSimpleName() + " LifeCycle ", "< ------------------------------ onDestroy() ------------------------------ >\n");
    }

    /**
     * Show a toast message, with a default duration length of LENGTH_SHORT.
     */
    protected void toast(@NonNull String message) {
        toast(message, Toast.LENGTH_SHORT);
    }

    protected String fetchString(EditText editText) {
        return editText.getText().toString();
    }

    /**
     * Show a toast message, with a custom duration provided via int parameter
     */
    protected void toast(@NonNull String message, int duration) {
        Toast.makeText(this, message, duration).show();
    }

    /**
     * Show a debug message to the Android Logcat      *      * @param source  String source representing the object where the message is coming from.      * @param message the message to show to the log
     */
    public static void d(String source, String message) {
        log(source, message);
    }

    /**
     * Show a debug, or error message to the Android Logcat
     * @param source  String representing the source of the message.
     * @param message Message String to show on the log
     */
    private static void log(String source, String message) {
        String output = source + " - " + message;
        Timber.d(output);
    }
}

