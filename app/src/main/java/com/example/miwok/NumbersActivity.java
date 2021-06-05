package com.example.miwok;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words= new ArrayList<>();
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);


        words.add(new Word("One", "एक"));
        words.add(new Word("Two", "दो"));
        words.add(new Word("Three", "तीन"));
        words.add(new Word("Four", "चार"));
        words.add(new Word("Five", "पांच"));
        words.add(new Word("Six", "छः"));
        words.add(new Word("Seven", "सात"));
        words.add(new Word("Eight", "आठ"));
        words.add(new Word("Nine", "नौ"));
        words.add(new Word("Ten", "दस"));
    }
}