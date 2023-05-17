package com.example.jadirider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterpln extends RecyclerView.Adapter<holderpln> {
    Context contextpln;
    List<platn>listpl;

    public Adapterpln(Context contextpln, List<platn> listpl) {
        this.contextpln = contextpln;
        this.listpl = listpl;
    }

    @NonNull
    @Override
    public holderpln onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contextpln);
        View view = inflater.inflate(R.layout.itempl, parent,false);
        return new holderpln(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holderpln holder, int position) {
        platn pn = listpl.get(position);
        holder.nl.setText(pn.getNama());
        holder.dl.setText(pn.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return listpl.size();
    }
}
class holderpln extends RecyclerView.ViewHolder{
    TextView nl, dl;

    public holderpln(@NonNull View itemView) {
        super(itemView);
        nl = itemView.findViewById(R.id.npl);
        dl = itemView.findViewById(R.id.dpl);
    }
}
