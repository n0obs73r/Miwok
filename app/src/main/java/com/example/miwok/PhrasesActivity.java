package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> phrases = new ArrayList<>();
        WordAdapter adapter = new WordAdapter(this, phrases);
        ListView listItemView = findViewById(R.id.list);
        listItemView.setAdapter(adapter);

        phrases.add(new Word("One", "एक"));
        phrases.add(new Word("Two", "दो"));
        phrases.add(new Word("Three", "तीन"));
        phrases.add(new Word("Four", "चार"));
        phrases.add(new Word("Five", "पांच"));
        phrases.add(new Word("Six", "छः"));
        phrases.add(new Word("Seven", "सात"));
        phrases.add(new Word("Eight", "आठ"));
        phrases.add(new Word("Nine", "नौ"));
        phrases.add(new Word("Ten", "दस"));




    }
}