package com.tydinz.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class CreateWordActivity extends AppCompatActivity {


    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_word);


    }


    public void onClick(View v) {
        super.onBackPressed(); // or super.finish();
    }

    public void aWordClick(View view) {
        final EditText aWordTxt = findViewById(R.id.awordbxt);
        aWordTxt.setVisibility( aWordTxt.getVisibility() ==  View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
    }

    public void bWordClick(View view) {
        final EditText bWordTxt = findViewById(R.id.bwordbxt);
        bWordTxt.setVisibility(bWordTxt.getVisibility() ==  View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
    }

    public void cWordClick(View view) {
        final EditText cWordTxt = findViewById(R.id.cwordbxt);
        cWordTxt.setVisibility(cWordTxt.getVisibility() ==  View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
    }

    public void dWordClick(View view) {
        final EditText dWordTxt = findViewById(R.id.dwordbxt);
        dWordTxt.setVisibility(dWordTxt.getVisibility() ==  View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
    }

    public void eWordClick(View view) {
        final EditText eWordTxt = findViewById(R.id.ewordbxt);
        eWordTxt.setVisibility(eWordTxt.getVisibility() ==  View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
    }
}