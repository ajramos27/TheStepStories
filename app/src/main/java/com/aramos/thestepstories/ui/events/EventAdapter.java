package com.aramos.thestepstories.ui.events;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aramos.thestepstories.R;

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
        View view = LayoutInflater.from(context).inflate(R.layout.item_row_event, parent, false);
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
        private ImageView imageView;
        private TextView txtName;
        private TextView txtDate;
        private TextView txtTime;
        private TextView txtLocation;


        public EventHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgEvent);
            txtName = itemView.findViewById(R.id.txtName);
            txtDate = itemView.findViewById(R.id.txtDate);
            txtTime = itemView.findViewById(R.id.txtTime);
            txtLocation = itemView.findViewById(R.id.txtLocation);

        }

        public void setDetails(Event event) {
            imageView.setImageDrawable(event.getPic());
            txtName.setText(event.getName());
            txtDate.setText(event.getDate());
            txtTime.setText(event.getTime());
            txtLocation.setText(event.getLocation());
        }
    }

}


