package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LocationHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_history);
    }

    public void searchPageNav(View view) {
            setContentView(R.layout.activity_search_location);
            startActivity(new Intent(view.getContext(), SearchLocation.class));
    }
}