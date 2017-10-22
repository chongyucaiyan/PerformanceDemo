package com.github.cyc.performance.delayedloaddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean mLoadedView = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initContentView();
    }

    private void initContentView() {
        findViewById(R.id.btn_load_view).setOnClickListener(this);
    }

    private void loadView() {
        View vGreeting = ((ViewStub) findViewById(R.id.vs_greeting)).inflate();
        // 或者
//        findViewById(R.id.vs_greeting).setVisibility(View.VISIBLE);
        mLoadedView = true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_load_view:
                if (!mLoadedView) {
                    // 加载视图
                    loadView();
                }
                break;

            default:
                break;
        }
    }
}
