package com.tydinz.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class VerificationScreenActivity extends AppCompatActivity {

    EditText digit1, digit2, digit3, digit4;
    TextView inAs, logId, secret_i;
    String password;
    DBHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_screen);
        inAs = (TextView) findViewById(R.id.inAs);
        logId = (TextView) findViewById(R.id.logId);
        secret_i = (TextView) findViewById(R.id.secret_i);

        final String pin = getIntent().getStringExtra("pin");
        final boolean exist = getIntent().getBooleanExtra("exist", true);
        if (!exist) {
            String kmValue = "A new account will be created with " + pin + ". You\\n already have an old account?";
            inAs.setText(kmValue);
            logId.setText(R.string.choose_pin);
            secret_i.setText(R.string.enter_pin);
        }

        digit1 = (EditText) findViewById(R.id.digit1);
        digit2 = (EditText) findViewById(R.id.digit2);
        digit3 = (EditText) findViewById(R.id.digit3);
        digit4 = (EditText) findViewById(R.id.digit4);



        digit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                digit1.requestFocus();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(digit1.getText().toString().length() == 1){
                    digit2.requestFocus();
                }
            }
        });

        digit2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(digit2.getText().toString().length() == 1){
                    digit3.requestFocus();
                }
            }
        });

        digit3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(digit3.getText().toString().length() == 1){
                    digit4.requestFocus();
                }
            }
        });

        digit4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String pin1 = digit1.getText().toString();
                String pin2 = digit2.getText().toString();
                String pin3 = digit3.getText().toString();
                String pin4 = digit4.getText().toString();

                password = pin1 + pin2 + pin3 + pin4;

//                Toast.makeText(VerificationScreenActivity.this, "Pin Created " + pin +"Password Created " + password, Toast.LENGTH_SHORT).show();
                saveUser(pin);
            }
        });



    }

    public void goCreateWord(View view) {
        startActivity(new Intent(getApplicationContext(), CreateWordActivity.class));
    }

    public void onClick(View v) {
        super.onBackPressed(); // or super.finish();
    }

    public void saveUser(String pin)
    {
        DB.insertData(pin, password);
        Boolean insert = DB.insertData(pin, password);
        if ( insert != null && insert){
            Toast.makeText(VerificationScreenActivity.this, "Registered successfully", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(VerificationScreenActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
        }
    }
}