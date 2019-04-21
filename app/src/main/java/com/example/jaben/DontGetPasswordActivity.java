package com.example.jaben;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;

public class DontGetPasswordActivity extends AppCompatActivity {

    private TextView txt_varify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dont_get_password);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        txt_varify = findViewById(R.id.txt_verify_number);

        txt_varify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DontGetPasswordActivity.this,SendCodeAgainActivity.class);
                startActivity(intent);
            }
        });


    }
}
