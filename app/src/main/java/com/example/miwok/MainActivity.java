/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.miwok;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers);
        TextView phrases = findViewById(R.id.phrases);
        TextView colors = findViewById(R.id.colors);
        TextView family = findViewById(R.id.family);



        numbers.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "Opening the list of Numbers", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, NumbersActivity.class);
            startActivity(i);
        });

        phrases.setOnClickListener(v -> {
            Toast.makeText(v.getContext(),"Opening the list of Phrases", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, PhrasesActivity.class);
            startActivity(i);
        });
        family.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "Opening the list of Family Members", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, FamilyActivity.class);
            startActivity(i);
        });

        colors.setOnClickListener(v -> {
            Toast.makeText(v.getContext(),"Opening the list of Colors", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, ColorsActivity.class);
            startActivity(i);
        });

    }

}
