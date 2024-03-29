package com.example.ca;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class CollapsingRecyclerViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView = null;

    public CollapsingRecyclerViewHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            imageView = (ImageView)itemView.findViewById(R.id.collapse_image_id);
        }
    }

    public ImageView getImageView() {
        return imageView;
    }
}