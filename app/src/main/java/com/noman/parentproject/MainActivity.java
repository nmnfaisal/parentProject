package com.noman.parentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.noman.toaster.MyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyToast.showToast(this, "this Toast is in SDK");
    }
}