package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public void listGo(View view){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
    public void mapGo(View view){

        Intent intent1 = new Intent(this, MapsActivity.class);
        startActivity(intent1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ;
    }
}