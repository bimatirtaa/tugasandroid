package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MyCustomActivity extends AppCompatActivity {
    private ListView lvCustom;
    private String[] players ={"Keylor Navas", "Pepe", "Sergio Ramos", "Cristiano Ronaldo",
                    "Kroos", "Benzema", "Bale", "Marcelo", "Casemiro", "Carvajal", "Modric"};
    private String[]  posisi ={"Gk", "CB", "CB", "LF", "LM", "CF", "RF", "LB", "DM", "RB", "RM"};
    private String[] number ={"1", "3", "4", "7", "8", "9", "11", "12", "14", "15", "19"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_custom);

        lvCustom = findViewById(R.id.list_view);
        ArrayAdapter adapter = ArrayAdapter (this, players, posisi, number);
        lvCustom.setAdapter(adapter);

    }
}
