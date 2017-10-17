package com.github.cyc.performance.overdrawdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initContentView();
    }

    private void initContentView() {
        String[] alphabet = getResources().getStringArray(R.array.alphabet);
        List<String> dataList = new ArrayList<>(Arrays.asList(alphabet));
        AlphabetAdapter adapter = new AlphabetAdapter(this, dataList);

        RecyclerView rvAlphabet = (RecyclerView) findViewById(R.id.rv_alphabet);
        rvAlphabet.setLayoutManager(new LinearLayoutManager(this));
        rvAlphabet.setAdapter(adapter);
    }
}
