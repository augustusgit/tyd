package com.tydinz.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RetrieveAccountActivity extends AppCompatActivity {

    EditText pin, checkword;
    Button retrvBtn;

    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve_account);

        pin = (EditText) findViewById(R.id.pin);
        checkword = (EditText) findViewById(R.id.checkword);
        retrvBtn = (Button) findViewById(R.id.retrvBtn);
        DB = new DBHelper(this);

        retrvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String userpin = pin.getText().toString();

               if (userpin.equals(""))
                   Toast.makeText(RetrieveAccountActivity.this, "Please enter your pin", Toast.LENGTH_SHORT).show();
                   else {
                       Boolean checkpin = DB.checkpin(userpin); //check if pin exist locally or remote database
                       if (!checkpin){
                           //create a new pin or navigate to the password page
                           Intent intent = new Intent(getApplicationContext(), VerificationScreenActivity.class);
                           intent.putExtra("pin", userpin);
                           startActivity(intent);
                       }else {
                           //validate your saved ewords
                           checkword.setVisibility( checkword.getVisibility() ==  View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                       }
               }
            }
        });

    }

    public void onClick(View v) {
        super.onBackPressed(); // or super.finish();
    }

    public void goCreateWord(View view) {
        startActivity(new Intent(getApplicationContext(), VerificationScreenActivity.class));
    }
}