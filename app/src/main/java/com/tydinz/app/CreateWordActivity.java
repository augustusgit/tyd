package com.tydinz.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class CreateWordActivity extends AppCompatActivity {


    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_word);

        getImages();
    }

    private void getImages(){
        mImageUrls.add("https://www.googleapis.com/drive/v3/files/1L6GUHCfUIt6o1Boe2sUOKcGTI3Qgqejs?alt=media&key=AIzaSyAk_9xL_HyMFzKxMPfHIli0EQHhXuLmNls&v=.png");


        mImageUrls.add("https://www.googleapis.com/drive/v3/files/1INKQbgkWplSMygM2kWZYLgxwCxhCHl9L?alt=media&key=AIzaSyAk_9xL_HyMFzKxMPfHIli0EQHhXuLmNls&v=.png");

        mImageUrls.add("https://www.googleapis.com/drive/v3/files/1pf4cvqYBnXpod_z5WuODeHWvyaIVqY-2?alt=media&key=AIzaSyAk_9xL_HyMFzKxMPfHIli0EQHhXuLmNls&v=.png");


        mImageUrls.add("https://www.googleapis.com/drive/v3/files/1IK-ABGuWVUEGm8ziwbgSvMxemdvvcA3n?alt=media&key=AIzaSyAk_9xL_HyMFzKxMPfHIli0EQHhXuLmNls&v=.png");


        mImageUrls.add("https://www.googleapis.com/drive/v3/files/1Zky2YW---1oK_Ietu0x6MD1PhvHwDB0g?alt=media&key=AIzaSyAk_9xL_HyMFzKxMPfHIli0EQHhXuLmNls&v=.png");


        mImageUrls.add("https://www.googleapis.com/drive/v3/files/1SQaExKaHiBeNdf2um66tN4QDK7gp_HEc?alt=media&key=AIzaSyAk_9xL_HyMFzKxMPfHIli0EQHhXuLmNls&v=.png");


        mImageUrls.add("https://www.googleapis.com/drive/v3/files/1Cw93Ik7PG6Vsj-35oXhvPxciZIE5dSSu?alt=media&key=AIzaSyAk_9xL_HyMFzKxMPfHIli0EQHhXuLmNls&v=.png");

        mImageUrls.add("https://www.googleapis.com/drive/v3/files/1p-HYq9hkpRoWOw4pbRHHDN2rd5YfJ1UC?alt=media&key=AIzaSyAk_9xL_HyMFzKxMPfHIli0EQHhXuLmNls&v=.png");

        initRecyclerView();
    }

    private void initRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mImageUrls, this);
        recyclerView.setAdapter(adapter);
    }


    public void onClick(View v) {
        super.onBackPressed(); // or super.finish();
    }
}