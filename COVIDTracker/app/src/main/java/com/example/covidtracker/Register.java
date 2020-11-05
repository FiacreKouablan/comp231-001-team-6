package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Register extends AppCompatActivity {
    boolean agreeToUseLocation = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        populateProvinceSpinner();
    }

    public void populateProvinceSpinner()
    {
        Spinner spinner = (Spinner) findViewById(R.id.spinnerProvince);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.provinces, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void agreeToUseLocation(View view)
    {
        agreeToUseLocation = true;
    }

    //event handler for register button
    public void onClick(View view){}
}