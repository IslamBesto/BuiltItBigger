package com.example.androidjokes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private static final String JOKE_INTENT = "joke_intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        String joke = getIntent().getStringExtra(JOKE_INTENT);

        TextView textView = findViewById(R.id.joke_text_view);
        textView.setText(joke);
    }
}
