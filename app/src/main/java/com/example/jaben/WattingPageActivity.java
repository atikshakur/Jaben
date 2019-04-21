package com.example.jaben;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WattingPageActivity extends AppCompatActivity {

    private int splashTimeout=2000;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watting_page);

        actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(WattingPageActivity.this,SelectAccountTypeActivity.class);
                startActivity(intent);
                finish();

            }
        },splashTimeout);
    }
}
