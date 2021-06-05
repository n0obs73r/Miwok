package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> family = new ArrayList<>();
        WordAdapter adapter = new WordAdapter(this, family);
        ListView listItemView = findViewById(R.id.list);
        listItemView.setAdapter(adapter);

        family.add(new Word("One", "एक"));
        family.add(new Word("Two", "दो"));
        family.add(new Word("Three", "तीन"));
        family.add(new Word("Four", "चार"));
        family.add(new Word("Five", "पांच"));
        family.add(new Word("Six", "छः"));
        family.add(new Word("Seven", "सात"));
        family.add(new Word("Eight", "आठ"));
        family.add(new Word("Nine", "नौ"));
        family.add(new Word("Ten", "दस"));
    }
}