package com.example.ca;


import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.support.v4.app.NavUtils;

import java.util.List;

public class CollapsingRecyclerViewDataAdapter extends RecyclerView.Adapter<CollapsingRecyclerViewHolder> {



    private Context context;
    private List<Coffee> viewItemList;

    public CollapsingRecyclerViewDataAdapter(List<Coffee> viewItemList,Context context) {
        this.viewItemList = viewItemList;
        this.context=context;
    }

    @NonNull
    @Override
    public CollapsingRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(context);
        view=inflater.inflate(R.layout.activity_order,viewGroup,false);
        final CollapsingRecyclerViewHolder viewHolder=new CollapsingRecyclerViewHolder(view);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, OrderActivity.class);
                i.putExtra("anime_name",viewItemList.get(viewHolder.getAdapterPosition()).getCoffeeImage());
            }
        });
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(CollapsingRecyclerViewHolder holder, int position) {




        if(viewItemList!=null) {
            // Get item dto in list.
            Coffee viewItem = viewItemList.get(position);

            if(viewItem != null) {
                // Set car image resource id.
                holder.getImageView().setImageResource(viewItem.getImageId());
            }
        }
    }


    @Override
    public int getItemCount() {
        int ret = 0;
        if(viewItemList!=null)
        {
            ret = viewItemList.size();
        }
        return ret;
    }
}