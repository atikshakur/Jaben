package com.example.jaben;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class SendCodeAgainActivity extends AppCompatActivity {
    private Button btn_sms_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_code_again);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        btn_sms_again= findViewById(R.id.btn_send_sms_again);

        btn_sms_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SendCodeAgainActivity.this,VerifyingNumberActivity.class);
                startActivity(intent);
            }
        });




    }
}
