package com.example.jaben;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class DriverRegistrationSelectCityActivity extends AppCompatActivity  {

    private LinearLayout layout_dhka,layout_ctg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_registration_select_city);

        //set back bar in aActionbar:1
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //set back bar in aActionbar:1

        // set cutome title in actionbar
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Sign Up");
        // set cutome title in actionbar

        layout_dhka =  findViewById(R.id.dhaka);
        layout_ctg =  findViewById(R.id.ctg);

        layout_dhka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverRegistrationSelectCityActivity.this,DriverRegistrationSelectVehicleActivity.class);
                startActivity(intent);
            }
        });

        layout_ctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverRegistrationSelectCityActivity.this,DriverRegistrationSelectVehicleActivity.class);
                startActivity(intent);
            }
        });

    }


    //set back bar in a Actionbar:2
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    //set back bar in a Actionbar:2
}
