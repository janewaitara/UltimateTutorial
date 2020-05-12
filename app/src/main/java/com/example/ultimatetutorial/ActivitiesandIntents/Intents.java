package com.example.ultimatetutorial.ActivitiesandIntents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.ultimatetutorial.R;

public class Intents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

        Intent secondIntent = new Intent(Intents.this, SecondActivity.class);
        secondIntent.putExtra(Intent.EXTRA_TEXT, "This is from Intents Activity");
        startActivity(secondIntent);
    }
}
