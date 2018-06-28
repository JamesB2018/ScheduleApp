package com.example.james.schedule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;

public class WeekActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        setupUIView();
        initToolbar();
    }

    private void setupUIView(){
        toolbar = (Toolbar)findViewById(R.id.ToolbarWeek);
        listView = (ListView)findViewById(R.id.lvWeek);
    }

    private void initToolbar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Week");
    }

    private void setupListView(){
        String[] week = getResources().getStringArray(R.array.Week);
    }
}
