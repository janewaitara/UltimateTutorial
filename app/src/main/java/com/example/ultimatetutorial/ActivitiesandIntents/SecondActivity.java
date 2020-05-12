package com.example.ultimatetutorial.ActivitiesandIntents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ultimatetutorial.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String intentExtraString = getIntent().getExtras().getString(Intent.EXTRA_TEXT);
        //getting the passed intent extra
        Toast.makeText(this, intentExtraString, Toast.LENGTH_SHORT).show();
    }
}
