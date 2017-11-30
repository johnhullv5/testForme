package com.example.a300858525.testforme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PlotActivity extends AppCompatActivity {
    String s = "";//getIntent().getStringExtra("EXTRA_SESSION_ID");
    List<String> symbols =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot);
        s = getIntent().getStringExtra("EXTRA_SESSION_ID");
        symbols = new ArrayList<String>();
        for(String stock : s.split(","))
        {
            symbols.add(stock);
        }
    }
}
