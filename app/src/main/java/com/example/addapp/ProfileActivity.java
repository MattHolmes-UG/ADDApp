package com.example.addapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setTitle("ABOUT ALC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView img = findViewById(R.id.profile_image);
        //int imageId = getResources().getIdentifier("@drawable/mypic.jpg", null, this.getPackageName());
        img.setImageResource(R.drawable.mypic);
    }
}
