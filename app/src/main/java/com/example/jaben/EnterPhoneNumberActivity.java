package com.example.jaben;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnterPhoneNumberActivity extends AppCompatActivity {

    private Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone_number);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        btn_next = findViewById(R.id.btn_Next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterPhoneNumberActivity.this, SentCodeActivity.class);
                startActivity(intent);
            }
        });


    }
}
