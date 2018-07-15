package com.example.dsm2018.recyclerview_practice;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private  ArrayList<Item> Item;
    private int itemLayout;
    public Adapter(ArrayList<Item> Items, int itemLayout)
    {
        Item = Items;
        this.itemLayout = itemLayout;
    }
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(itemLayout,viewGroup,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Item item = Item.get(i);
        viewHolder.Name.setText(item.getName());
        viewHolder.Information.setText(item.getInformation());
    }

    @Override
    public int getItemCount() {
        return Item.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView Name;
        public TextView Information;
        public ViewHolder(View item){
            super(item);
            Name = (TextView) itemView.findViewById(R.id.name);
            Information = (TextView) itemView.findViewById(R.id.information);
        }
    }
}
