package com.aramos.thestepstories.ui.stories;

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

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryHolder>  {

    private Context context;
    private ArrayList<Story> stories;
    public StoryAdapter(Context context, ArrayList<Story> stories) {
        this.context = context;
        this.stories = stories;
    }

    @NonNull
    @Override
    public StoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row_story, parent, false);
        return new StoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryHolder storyHolder, int position) {
        Story story = stories.get(position);
        storyHolder.setDetails(story);

    }



    @Override
    public int getItemCount() {
        return stories.size();
    }

    public class StoryHolder extends RecyclerView.ViewHolder {
        private ImageView imgFace;
        private TextView txtStory;
        private TextView txtName;
        private TextView txtInfo;
        public StoryHolder(View itemView) {
            super(itemView);
            imgFace = itemView.findViewById(R.id.face);
            txtStory = itemView.findViewById(R.id.txtStory);
            txtName = itemView.findViewById(R.id.txtName);
            txtInfo = itemView.findViewById(R.id.txtInfo);

        }

        public void setDetails(Story story) {
            imgFace.setImageDrawable(story.getPic());
            txtStory.setText(story.getStory());
            txtName.setText(story.getName());
            txtInfo.setText(story.getInfo());
        }
    }

}
