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

public class Adaptersim extends RecyclerView.Adapter<holdersim> {
    Context contextsi;
    List<sim>list;

    public Adaptersim(Context contextsi, List<sim> list) {
        this.contextsi = contextsi;
        this.list = list;
    }

    @NonNull
    @Override
    public holdersim onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contextsi);
        View view = inflater.inflate(R.layout.itemsim, parent,false);
        return new holdersim(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holdersim holder, int position) {
        sim si = list.get(position);
        holder.imgsm.setImageResource(si.getImgs());
        holder.ns.setText(si.getNama());
        holder.ds.setText(si.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class holdersim extends RecyclerView.ViewHolder{
    ImageView imgsm;
    TextView ns, ds;

    public holdersim(@NonNull View itemView) {
        super(itemView);
        imgsm = itemView.findViewById(R.id.imgsi);
        ns = itemView.findViewById(R.id.nsi);
        ds = itemView.findViewById(R.id.dsi);
    }
}
