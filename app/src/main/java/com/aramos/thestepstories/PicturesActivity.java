package com.aramos.thestepstories;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aramos.thestepstories.ui.stories.Story;
import com.aramos.thestepstories.ui.stories.StoryAdapter;

import java.util.ArrayList;

public class PicturesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PictureAdapter adapter;
    private ArrayList<Picture> pictureArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        recyclerView = findViewById(R.id.picturesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        pictureArrayList = new ArrayList<>();
        adapter = new PictureAdapter(getApplicationContext(), pictureArrayList);
        recyclerView.setAdapter(adapter);

        //recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        Picture picture1 = new Picture(getDrawable(R.drawable.elpasotx), "El Paso Texas", "Esmeralda Guzman");
        Picture picture2 = new Picture(getDrawable(R.drawable.sunset), "Sunset at El Paso", "Marquis Henderson");
        Picture picture3 = new Picture(getDrawable(R.drawable.greeting), "Greetings from El Paso Texas", "Adrian Martinez");
        Picture picture4 = new Picture(getDrawable(R.drawable.memorial), "El Paso Memorial", "Francisco Medina");

        pictureArrayList.add(picture1);
        pictureArrayList.add(picture2);
        pictureArrayList.add(picture3);
        pictureArrayList.add(picture4);
    }
}
