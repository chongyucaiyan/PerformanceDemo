package com.github.cyc.performance.layouthierarchydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initContentView();
    }

    private void initContentView() {
        findViewById(R.id.btn_relative_layout_demo).setOnClickListener(this);
        findViewById(R.id.btn_merge_demo).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_relative_layout_demo:
                RelativeLayoutDemoActivity.start(this);
                break;

            case R.id.btn_merge_demo:
                MergeDemoActivity.start(this);
                break;

            default:
                break;
        }
    }
}
