package com.noman.parentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tps.libraryeml.EMLHomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //        MyToast.showToast(this, "this Toast is in SDK");

                Intent intent = new Intent(MainActivity.this, EMLHomeActivity.class);
                startActivity(intent);
            }
        });



    }
}