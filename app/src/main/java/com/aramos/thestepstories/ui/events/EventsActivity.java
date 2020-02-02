package com.aramos.thestepstories.ui.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aramos.thestepstories.R;

import java.util.ArrayList;

import androidx.navigation.ui.AppBarConfiguration;

public class EventsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EventAdapter adapter;
    private ArrayList<Event> eventArrayList;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);


        recyclerView = findViewById(R.id.eventsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        eventArrayList = new ArrayList<>();
        adapter = new EventAdapter(getApplicationContext(), eventArrayList);
        recyclerView.setAdapter(adapter);

        //recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        Event event1 = new Event("Charlie and Chocolate Factory", "February 2, 2020", "06:00 PM", "Plaza Theatre Box Office", getDrawable(R.drawable.theater));
        Event event2 = new Event("Lone Star 1000", "February 8, 2020", "9:00 AM", "Franklin Mountains State Park", getDrawable(R.drawable.hike));
        Event event3 = new Event("Michelob Ultra El Paso Marathon", "February 16, 2020", "7:00 AM", "Downtown El Paso", getDrawable(R.drawable.run));
        eventArrayList.add(event1);
        eventArrayList.add(event2);
        eventArrayList.add(event3);


    }
}
