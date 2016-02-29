package com.example.oscar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.listView);

        ArrayList<Actor> actingDudes = new ArrayList<Actor>();
        Actor danny = new Actor("Danny McBride", "1971", 1000);
        Actor tom = new Actor("Tom Cruise", "1975", 0);
        Actor ed = new Actor("Ed Begley Jr.","1967", 0);

        ActorListCustomAdapter actorListCustomAdapter = new ActorListCustomAdapter(MainActivity.this,actingDudes);

        mListView.setAdapter(actorListCustomAdapter);
    }
}
