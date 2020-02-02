package com.aramos.thestepstories.ui.stories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aramos.thestepstories.R;

import java.util.ArrayList;

public class StoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StoryAdapter adapter;
    private ArrayList<Story> storyArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        recyclerView = findViewById(R.id.storiesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        storyArrayList = new ArrayList<>();
        adapter = new StoryAdapter(getApplicationContext(), storyArrayList);
        recyclerView.setAdapter(adapter);

        //recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        Story story1 = new Story(getString(R.string.story1), "Martha Hernandez", "(Mom, Daughter, 51)", getDrawable(R.drawable.martha));
        Story story2 = new Story(getString(R.string.story2), "Rachel McAdams", "(Mom, Sister, Grandmother, 67)", getDrawable(R.drawable.rachael));
        Story story3 = new Story(getString(R.string.story3), "Henry Ashford", "(Dad, Son, 49)", getDrawable(R.drawable.henry));
        Story story4 = new Story(getString(R.string.story4), "Adrian Martinez", "(Son, Student, 24)", getDrawable(R.drawable.adrian));
        storyArrayList.add(story1);
        storyArrayList.add(story2);
        storyArrayList.add(story3);
        storyArrayList.add(story4);

    }
}
