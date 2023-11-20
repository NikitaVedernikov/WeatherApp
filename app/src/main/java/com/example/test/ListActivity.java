package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.test.data.Main;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


    }

    public void card(int cardId){
        Intent intent = new Intent(this, AddActivity.class);
        intent.putExtra("id", cardId);
        startActivity(intent);
    }

    public void card1(View view){
        TextView cityView1 = findViewById(R.id.cityView1);
        if (cityView1.getText() == "Добавить +") {
            card(0);
        }
        else{
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("id", 0);
            startActivity(intent);
        }
    }
    public void card2(View view){
        TextView cityView2 = findViewById(R.id.cityView2);
        if (cityView2.getText() == "Добавить +") {
            card(1);
        }
        else{
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("id", 1);
            startActivity(intent);
        }
    }
    public void card3(View view){
        TextView cityView3 = findViewById(R.id.cityView3);
        if (cityView3.getText() == "Добавить +") {
            card(2);
        }
        else{
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("id", 2);
            startActivity(intent);
        }
    }
    public void card4(View view){
        TextView cityView4 = findViewById(R.id.cityView4);
        if (cityView4.getText() == "Добавить +") {
            card(3);
        }
        else{
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("id", 3);
            startActivity(intent);
        }
    }
    public void card5(View view){
        TextView cityView4 = findViewById(R.id.cityView5);
        if (cityView4.getText() == "Добавить +") {
            card(4);
        }
        else{
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("id", 4);
            startActivity(intent);
        }
    }

}