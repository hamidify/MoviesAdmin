package com.gebeya.mahmai.movie_theatre_admin;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;

public class ScanQRActivity extends AppCompatActivity {
    CodeScanner mCodeScanner;
    String ticketId = null;
    private boolean backPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.CAMERA}, 1);
        } else {
            doDecoding();
        }
    }

    private void doDecoding() {
        CodeScannerView scannerView = findViewById(R.id.scanner_view);
        mCodeScanner = new CodeScanner(this, scannerView);
        scannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCodeScanner.startPreview();
                Toast.makeText(ScanQRActivity.this, "Scanning QR ...", Toast.LENGTH_SHORT).show();
            }
        });
        mCodeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull final Result result) {
                ScanQRActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(ScanQRActivity.this, result.getText(), Toast.LENGTH_SHORT).show();
                        ticketId = result.getText();
                    }
                });
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1:
                if ((grantResults.length > 0) && (grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    doDecoding();
                } else {
                    Toast.makeText(this, "Please allow user permissions.", Toast.LENGTH_SHORT).show();

                }
                break;
            default:
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        backPressedOnce = false;
        if (mCodeScanner != null)
            mCodeScanner.startPreview();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mCodeScanner != null)
            mCodeScanner.releaseResources();
    }

    @Override
    public void onBackPressed() {
        if (backPressedOnce) {
            super.onBackPressed();
            return;
        }

        backPressedOnce = true;
        Toast.makeText(this, R.string.press_back_twice, Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                backPressedOnce = false;
            }
        }, 2000);
    }
}
