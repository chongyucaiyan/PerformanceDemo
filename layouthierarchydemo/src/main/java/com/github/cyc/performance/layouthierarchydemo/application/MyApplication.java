package com.github.cyc.performance.layouthierarchydemo.application;

import android.app.Application;

import com.github.cyc.performance.layouthierarchydemo.BuildConfig;

/**
 * Created by cyc on 2017/10/20.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 如果是Debug版本，那么才注册ActivityLifecycleCallbacks监听器
        if (BuildConfig.DEBUG) {
            registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksImpl(this));
        }
    }
}
