package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void list(View view) {
        Intent intent = new Intent(MainActivity.this, MyListActivity.class);
        startActivity(intent);
    }


    public void custom(View view) {
        Intent intent = new Intent(MainActivity.this, MyCustomActivity.class);
        startActivity(intent);
    }
}
