package com.github.cyc.performance.layouthierarchydemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class RelativeLayoutDemoActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, RelativeLayoutDemoActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_demo);
    }
}
