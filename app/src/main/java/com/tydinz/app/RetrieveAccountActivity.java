package com.tydinz.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RetrieveAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve_account);
    }

    public void onClick(View v) {
        super.onBackPressed(); // or super.finish();
    }

    public void goCreateWord(View view) {
        startActivity(new Intent(getApplicationContext(), VerificationScreenActivity.class));
    }
}