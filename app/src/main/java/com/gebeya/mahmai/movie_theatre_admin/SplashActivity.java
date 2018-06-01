package com.gebeya.mahmai.movie_theatre_admin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openNextActivity();
    }

    public void openNextActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent intent = new Intent(SplashActivity.this, ScanQRActivity.class);
                    startActivity(intent);
                    finish();
            }
        }, 1000);

    }
}
