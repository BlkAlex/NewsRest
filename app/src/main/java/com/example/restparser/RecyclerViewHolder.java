package com.example.restparser;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView itemDate;
    public TextView itemText;
    public RecyclerViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        itemDate = itemView.findViewById(R.id.date);
        itemText = itemView.findViewById(R.id.text);
    }
    @Override
    public void onClick(View view) {
    }
}