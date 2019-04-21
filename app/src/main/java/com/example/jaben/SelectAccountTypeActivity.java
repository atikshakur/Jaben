package com.example.jaben;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectAccountTypeActivity extends AppCompatActivity {

    private Button btn_passenger,btn_driver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_account_type);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        btn_passenger = findViewById(R.id.btn_passenger_lets_go);
        btn_driver = findViewById(R.id.btn_driver_lets_go);

        btn_passenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectAccountTypeActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

        btn_driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectAccountTypeActivity.this, DriverRegistrationActivity.class);
               startActivity(intent);
           }
       });

    }
}
