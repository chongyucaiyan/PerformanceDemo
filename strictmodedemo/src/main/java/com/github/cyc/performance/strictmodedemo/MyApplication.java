package com.github.cyc.performance.strictmodedemo;

import android.app.Application;
import android.os.StrictMode;

import java.io.File;

/**
 * Created by cyc on 2017/12/7.
 */

public class MyApplication extends Application {
    private static final String TAG = "MyApplication";
    private static final String FILE_NAME = TAG;

    @Override
    public void onCreate() {
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
        super.onCreate();
        FileUtils.writeFile(getFilePath(), TAG);
    }

    private String getFilePath() {
        return getExternalCacheDir() + File.separator + FILE_NAME;
    }
}
