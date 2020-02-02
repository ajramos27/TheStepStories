package com.aramos.thestepstories.ui.quotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.aramos.thestepstories.R;
import com.aramos.thestepstories.ui.events.Event;
import com.aramos.thestepstories.ui.events.EventAdapter;

import java.util.ArrayList;

public class QuotesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private QuoteAdapter adapter;
    private ArrayList<Quote> quoteArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        recyclerView = findViewById(R.id.quotesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        quoteArrayList = new ArrayList<>();
        adapter = new QuoteAdapter(getApplicationContext(), quoteArrayList);
        recyclerView.setAdapter(adapter);

        //recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        Quote quote1 = new Quote("\"Everything is beautiful, all that matters is to able to interpret\"", "Alfredo Martinez");
        quoteArrayList.add(quote1);
        Quote quote2 = new Quote("\"Be yourself; everyone else is already taken\"", "Oscar Wilde");
        quoteArrayList.add(quote2);
        Quote quote3 = new Quote("\"Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.\"", "Bernard Baruch");
        quoteArrayList.add(quote3);
        Quote quote4 = new Quote("\"To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment\"", "Ralph Emerson");
        quoteArrayList.add(quote3);

    }
}
