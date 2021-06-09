package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mp;
    private final MediaPlayer.OnCompletionListener globalVariable = mp1 -> {
        releaseMediaPlayer();
    };

    private void releaseMediaPlayer() {
        if (mp != null) {
            mp.release();
            mp = null;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        final ArrayList<Word> words = new ArrayList<>();
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listItemView = findViewById(R.id.list);
        listItemView.setAdapter(adapter);

        listItemView.setOnItemClickListener((parent, view, position, id) -> {
            Word word = words.get(position);
            releaseMediaPlayer();
            mp = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceIdResourceId());
            mp.start();
            mp.setOnCompletionListener(globalVariable);
        });

        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow,
                R.raw.color_mustard_yellow));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow,
                R.raw.color_dusty_yellow));
        words.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));



    }
}