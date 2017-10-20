package com.github.cyc.performance.layouthierarchydemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MergeDemoActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, MergeDemoActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merge_demo);
    }
}
