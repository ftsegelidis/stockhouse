package com.androidcss.searchexample;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class startScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("IP", "192.168.1.4");
        editor.commit();
    }

    public void startSearchActivity(View v) {
        Intent intent = new Intent(startScreen.this, SearchActivity.class);
        startActivity(intent);
    }

    public void startAddActivity(View v) {
        Intent intent = new Intent(startScreen.this, addScreen.class);
        startActivity(intent);
    }


    public void startUpdateActivity(View v) {
        Intent intent = new Intent(startScreen.this, updateScreen.class);
        startActivity(intent);
    }








}
