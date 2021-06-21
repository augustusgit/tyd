package com.tydinz.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerificationScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_screen);
    }

    public void goCreateWord(View view) {
        startActivity(new Intent(getApplicationContext(), CreateWordActivity.class));
    }

    public void onClick(View v) {
        super.onBackPressed(); // or super.finish();
    }
}