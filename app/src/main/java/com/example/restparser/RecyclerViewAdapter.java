package com.example.restparser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.restparser.pojo_model.Payload;
import com.example.restparser.test1.Payload_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private List<Payload_> itemList;
    private Context context;
    public RecyclerViewAdapter(Context context, List<Payload_> itemList) {
        this.itemList = itemList;
        this.context = context;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_scheme, null);
        RecyclerViewHolder rcv = new RecyclerViewHolder(layoutView);
        return rcv;
    }
    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.itemText.setText(itemList.get(position).getText());
        holder.itemDate.setText(
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(
                        new Date(
                                itemList.get(position).getPublicationDate().getMilliseconds())));
    }
    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
