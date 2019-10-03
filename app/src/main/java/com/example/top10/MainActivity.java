package com.example.top10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final   ArrayList<main_class> list = new ArrayList<>();

        list.add(new main_class(R.drawable.twitter,"Twitter"));
        list.add(new main_class(R.drawable.facebook,"Facebook"));
        list.add(new main_class(R.drawable.ic_launcher_foreground,"Instagram"));
        list.add(new main_class(R.drawable.ic_launcher_foreground,"Youtube"));

        ListView listView = findViewById(R.id.list_view);
        main_adapter adapter = new main_adapter(list,this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),  list.get(position).getCompany(),Toast.LENGTH_SHORT).show();
                if(position==0)
                {
                    Intent TwitterIntent = new Intent(MainActivity.this,TwitterClass.class);
                    startActivity(TwitterIntent);
                }
                if(position==1)
                {
                    Intent FacebookIntent = new Intent(MainActivity.this,FacebookClass.class);
                    startActivity(FacebookIntent);
                }
            }
        });
    }


}
