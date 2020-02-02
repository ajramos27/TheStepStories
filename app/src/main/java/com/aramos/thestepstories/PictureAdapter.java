package com.aramos.thestepstories;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aramos.thestepstories.ui.stories.Story;
import com.aramos.thestepstories.ui.stories.StoryAdapter;

import java.util.ArrayList;

public class PictureAdapter extends RecyclerView.Adapter<PictureAdapter.PictureHolder> {

    private Context context;
    private ArrayList<Picture> pictures;

    public PictureAdapter(Context context, ArrayList<Picture> pictures) {
        this.context = context;
        this.pictures = pictures;
    }

    @NonNull
    @Override
    public PictureHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row_picture, viewGroup, false);
        return new PictureAdapter.PictureHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PictureHolder pictureHolder, int i) {
        Picture picture = pictures.get(i);
        pictureHolder.setDetails(picture);
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView txtCaption;
        private TextView txtName;

        public PictureHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtCaption = itemView.findViewById(R.id.txtCaption);
            image = itemView.findViewById(R.id.pic);
        }

        public void setDetails(Picture picture) {
            txtName.setText(picture.getName());
            txtCaption.setText(picture.getCaption());
            image.setImageDrawable(picture.getPic());
        }
    }
}
