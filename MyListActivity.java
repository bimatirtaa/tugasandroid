package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListActivity extends AppCompatActivity {
    private ListView lvItems;
    private String[] players={"Keylor Navas", "Pepe", "Sergio Ramos", "Cristiano Ronaldo",
            "Kroos", "Benzema", "Bale", "Marcelo", "Casemiro", "Carvajal", "Modric"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        lvItems = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (MyListActivity.this, android.R.layout.activity_list_item, android.R.id.text1, players);

        lvItems.setAdapter(adapter);


    }
}
