package com.tydinz.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VerificationScreenActivity extends AppCompatActivity {

    TextView inAs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_screen);

        inAs = (TextView) findViewById(R.id.inAs);

        String pin = getIntent().getStringExtra("pin");
        String kmValue = "You will be signed in as " + pin + ". Not\\n your account?";
        inAs.setText(kmValue);

    }

    public void goCreateWord(View view) {
        startActivity(new Intent(getApplicationContext(), CreateWordActivity.class));
    }

    public void onClick(View v) {
        super.onBackPressed(); // or super.finish();
    }
}