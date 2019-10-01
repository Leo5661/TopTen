package com.example.top10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ArrayList<String> list = new ArrayList<String>();
        ListView listView = findViewById(R.id.list_view);
        list.add("Twitter");
        list.add("Facebook");
        list.add("Instagram");
        list.add("Youtube");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
    }


}
