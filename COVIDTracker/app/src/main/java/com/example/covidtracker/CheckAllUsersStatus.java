package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.ArrayList;

//admin page for checking the status of all users who entered a certain location
public class CheckAllUsersStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_all_users_status);
        loadDataView();
    }

    private void loadDataView()
    {
        //grid view will be populated with user status info
        GridView gridView = (GridView)findViewById(R.id.allUsers);
        //gridView.setAdapter((ListAdapter) columns);
    }
}