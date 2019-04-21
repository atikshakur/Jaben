package com.example.jaben;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SentCodeActivity extends AppCompatActivity {

    private Button btnContinue;
    private TextView txtCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sent_code);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        btnContinue = findViewById(R.id.btn_Continue);
        txtCode = findViewById(R.id.txt_dont_get_code);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SentCodeActivity.this,WattingPageActivity.class);
                startActivity(intent);
            }
        });

        txtCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SentCodeActivity.this,DontGetPasswordActivity.class);
                startActivity(intent);
            }
        });

    }
}
