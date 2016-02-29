package com.example.oscar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);

        ArrayList<Actor>theBunchOfActors = new ArrayList<>();
        Actor a = new Actor("LEO","70s",1);
        theBunchOfActors.add(a);
        ActorListCustomAdapter clca = new ActorListCustomAdapter(MainActivity.this,theBunchOfActors);

        listView.setAdapter(clca);

    }
}
