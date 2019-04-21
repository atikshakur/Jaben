package com.example.jaben;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class DriverRegistrationActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Button btn_agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_registration);


        //set back bar in aActionbar:1

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //set back bar in aActionbar:1


        // set cutome title in actionbar

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("Sign Up for Bike");

        // set cutome title in actionbar


        //for set spinner

        Spinner spinner = findViewById(R.id.txt_spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayList<String> type = new ArrayList<String>();

        type.add("NID");
        type.add("Passport");

        ArrayAdapter<String> typead=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,type);
        spinner.setAdapter(typead);

        //for set spinner

        btn_agree =  findViewById(R.id.btn_agreeSignup);

        btn_agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverRegistrationActivity.this,DriverPaymentTypeActivity.class);
                startActivity(intent);
            }
        });

    }

    //for set spinner
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    //for set spinner


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
