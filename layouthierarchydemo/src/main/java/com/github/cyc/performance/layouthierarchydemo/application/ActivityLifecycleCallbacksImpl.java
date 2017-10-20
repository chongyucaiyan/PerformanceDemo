package com.github.cyc.performance.layouthierarchydemo.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by cyc on 2017/10/20.
 */

public class ActivityLifecycleCallbacksImpl implements Application.ActivityLifecycleCallbacks {
    private Context mContext;

    public ActivityLifecycleCallbacksImpl(Context context) {
        mContext = context;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        ViewServer.get(mContext).addWindow(activity);
    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {
        ViewServer.get(mContext).setFocusedWindow(activity);
    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        ViewServer.get(mContext).removeWindow(activity);
    }
}
