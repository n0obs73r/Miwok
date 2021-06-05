package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> colors = new ArrayList<>();
        WordAdapter adapter = new WordAdapter(this, colors);
        ListView listItemView = findViewById(R.id.list);
        listItemView.setAdapter(adapter);

        colors.add(new Word("One", "एक"));
        colors.add(new Word("Two", "दो"));
        colors.add(new Word("Three", "तीन"));
        colors.add(new Word("Four", "चार"));
        colors.add(new Word("Five", "पांच"));
        colors.add(new Word("Six", "छः"));
        colors.add(new Word("Seven", "सात"));
        colors.add(new Word("Eight", "आठ"));
        colors.add(new Word("Nine", "नौ"));
        colors.add(new Word("Ten", "दस"));


    }
}