package com.aramos.thestepstories.ui.quotes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aramos.thestepstories.R;
import com.aramos.thestepstories.ui.events.Event;

import java.util.ArrayList;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteHolder>{

    private Context context;
    private ArrayList<Quote> quotes;

    public QuoteAdapter(Context context, ArrayList<Quote> quotes) {
        this.context = context;
        this.quotes = quotes;
    }

    @NonNull
    @Override
    public QuoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row_quote, parent, false);
        return new QuoteHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteHolder quoteHolder, int i) {
        Quote quote = quotes.get(i);
        quoteHolder.setDetails(quote);

    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }

    public class QuoteHolder extends RecyclerView.ViewHolder {
        private TextView txtQuote;
        private TextView txtAuthor;
        public QuoteHolder(View itemView) {
            super(itemView);
            txtQuote = itemView.findViewById(R.id.txtQuote);
            txtAuthor = itemView.findViewById(R.id.txtAuthor);

        }

        public void setDetails(Quote quote) {
            txtQuote.setText(quote.getQuote());
            txtAuthor.setText(quote.getAuthor());
        }
    }
}
