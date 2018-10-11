package com.example.sharna.krishokerpase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class projukti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projukti);
    }
    public void new1(View v) {
        Intent ip= new Intent(projukti.this,projuktidetail.class);
        startActivity(ip);
    }

}
