package com.example.ultimatetutorial.ActivitiesandIntents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.ultimatetutorial.R;

public class FirstActivity extends AppCompatActivity {
    private static final String  TAG = FirstActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.d(TAG , "in onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG , "in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG , "in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG , "in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG , "in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG , "in onDestroy");
    }
}
