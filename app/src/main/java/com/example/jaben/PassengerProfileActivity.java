package com.example.jaben;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PassengerProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_profile);

        //set back bar in aActionbar:1
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //set back bar in aActionbar:1

        // set cutome title in actionbar
        ActionBar ab = getSupportActionBar();
        ab.setTitle("            View Profile");
        // set cutome title in actionbar
    }
}
