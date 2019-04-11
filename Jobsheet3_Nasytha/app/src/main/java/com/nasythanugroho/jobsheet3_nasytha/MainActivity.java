package com.nasythanugroho.jobsheet3_nasytha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private WordListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> wordList=new ArrayList<>();
        wordList.add("Pemrograman Mobile");
        wordList.add("Proyek 1");
        wordList.add("E-Bussiness");
        recyclerView = findViewById(R.id.RecyclerView);
        adapter=new WordListAdapter(this, wordList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}