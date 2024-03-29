package com.example.jaben;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInWithPhoneNumberActivity extends AppCompatActivity {

    private Button btn_log_with_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_with_phone_number);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();


        btn_log_with_number = findViewById(R.id.btn_log_with_phone_number);

        btn_log_with_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogInWithPhoneNumberActivity.this,EnterPhoneNumberActivity.class);
                startActivity(intent);
            }
        });
    }
}
