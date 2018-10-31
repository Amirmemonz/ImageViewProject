package com.example.amir.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class NewOne extends AppCompatActivity {
    ImageView pass;
    Uri imageuri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_one);
        pass = (ImageView) findViewById(R.id.imageView2);
        Bundle bundle = getIntent().getExtras();
        if (getIntent().getExtras()!= null){
            imageuri = Uri.parse(getIntent().getStringExtra("resId"));
            pass.setImageURI(imageuri);
        }
    }
}
