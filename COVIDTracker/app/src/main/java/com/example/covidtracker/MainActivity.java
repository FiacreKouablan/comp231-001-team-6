package com.example.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            //button to open login page.
            case R.id.loginBtn:

                setContentView(R.layout.activity_login);
                Toast.makeText(this, "Welcome back to Covid Tracer", Toast.LENGTH_LONG).show();
                startActivity(new Intent(view.getContext(), Login.class));
                break;

            //Placeholder code for second button.
//            case R.id.signupBtn:
//
//                //setContentView(R.layout.activity_exercise1);
//                Toast.makeText(this, "Welcome to Covid Tracer", Toast.LENGTH_LONG).show();
//                startActivity(new Intent(view.getContext(), Register.class));
//                break;

            default: setContentView(R.layout.activity_main);
        }

    }
}