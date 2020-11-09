package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_location);
    }


    public void pastLocationBtn(View view) {
        setContentView(R.layout.activity_location_history);
        startActivity(new Intent(view.getContext(), LocationHistory.class));
    }

    public void profileBtn(View view) {
        setContentView(R.layout.activity_status);
        startActivity(new Intent(view.getContext(), Status.class));
    }
}