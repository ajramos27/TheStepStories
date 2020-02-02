package com.aramos.thestepstories.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProviders;

import com.aramos.thestepstories.PicturesActivity;
import com.aramos.thestepstories.ui.quotes.QuotesActivity;
import com.aramos.thestepstories.ui.stories.StoriesActivity;
import com.aramos.thestepstories.ui.events.EventsActivity;
import com.aramos.thestepstories.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    private CardView cardQuotes;
    private CardView cardStories;
    private CardView cardEvents;
    private CardView cardPictures;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);



        cardQuotes = root.findViewById(R.id.cardQuotes);
        cardStories = root.findViewById(R.id.cardStories);
        cardEvents = root.findViewById(R.id.cardEvents);
        cardPictures = root.findViewById(R.id.cardPictures);

        cardQuotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quotes = new Intent(getContext(), QuotesActivity.class);
                startActivity(quotes);
            }
        });

        cardStories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stories = new Intent(getContext(), StoriesActivity.class);
                startActivity(stories);
            }
        });

        cardEvents = root.findViewById(R.id.cardEvents);
        cardEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent events = new Intent(getContext(), EventsActivity.class);
                startActivity(events);
            }
        });

        cardPictures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pictures = new Intent(getContext(), PicturesActivity.class);
                startActivity(pictures);
            }
        });



        return root;
    }
}