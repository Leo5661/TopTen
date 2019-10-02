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
         ArrayList<main_class> list = new ArrayList<>();

        list.add(new main_class(R.drawable.twitter,"Twitter"));
        list.add(new main_class(R.drawable.facebook,"Facebook"));
        list.add(new main_class(R.drawable.ic_launcher_foreground,"Instagram"));
        list.add(new main_class(R.drawable.ic_launcher_foreground,"Youtube"));

        ListView listView = findViewById(R.id.list_view);
        main_adapter adapter = new main_adapter(list,this);
        listView.setAdapter(adapter);
    }


}
