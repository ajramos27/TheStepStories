package com.aramos.thestepstories;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventHolder>  {

    private Context context;
    private ArrayList<Event> events;
    public EventAdapter(Context context, ArrayList<Event> planets) {
        this.context = context;
        this.events = planets;
    }

    @NonNull
    @Override
    public EventHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row, parent, false);
        return new EventHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventHolder eventHolder, int position) {
        Event event = events.get(position);
        eventHolder.setDetails(event);

    }



    @Override
    public int getItemCount() {
        return events.size();
    }

    public class EventHolder extends RecyclerView.ViewHolder {
        private TextView txtName;
        public EventHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);

        }

        public void setDetails(Event event) {
            txtName.setText(event.getName());
        }
    }

}


