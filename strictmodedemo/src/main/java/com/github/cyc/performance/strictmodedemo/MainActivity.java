package com.github.cyc.performance.strictmodedemo;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private static final String FILE_NAME = TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Debug模式下开启严格模式
        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .penaltyFlashScreen()
                    .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build());
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initContentView();
    }

    private void initContentView() {
        findViewById(R.id.btn_main_disk_reads).setOnClickListener(this);
        findViewById(R.id.btn_main_disk_writes).setOnClickListener(this);
        findViewById(R.id.btn_main_start_activity).setOnClickListener(this);
    }

    private String getFilePath() {
        return getExternalCacheDir() + File.separator + FILE_NAME;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main_disk_reads:
                String data = FileUtils.readFile(getFilePath());
                Log.i(TAG, "data = " + data);
                break;

            case R.id.btn_main_disk_writes:
                FileUtils.writeFile(getFilePath(), TAG);
                break;

            case R.id.btn_main_start_activity:
                SecondActivity.start(this);
                break;

            default:
                break;
        }
    }
}
