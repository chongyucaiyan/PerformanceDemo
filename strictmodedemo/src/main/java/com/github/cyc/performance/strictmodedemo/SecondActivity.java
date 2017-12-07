package com.github.cyc.performance.strictmodedemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.File;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "SecondActivity";
    private static final String FILE_NAME = TAG;

    public static void start(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initContentView();
    }

    private void initContentView() {
        findViewById(R.id.btn_second_disk_reads).setOnClickListener(this);
        findViewById(R.id.btn_second_disk_writes).setOnClickListener(this);
    }

    private String getFilePath() {
        return getExternalCacheDir() + File.separator + FILE_NAME;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_second_disk_reads:
                String data = FileUtils.readFile(getFilePath());
                Log.i(TAG, "data = " + data);
                break;

            case R.id.btn_second_disk_writes:
                FileUtils.writeFile(getFilePath(), TAG);
                break;

            default:
                break;
        }
    }
}
