package com.example.jaben;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DriverLoginActivity extends AppCompatActivity {

    private Button btnRegistration,btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        btnRegistration = (Button) findViewById(R.id.btn_register);
        btnLogin = (Button) findViewById(R.id.btn_log_in);

        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverLoginActivity.this, DriverRegistrationSelectCityActivity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DriverLoginActivity.this, MainDriverHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
