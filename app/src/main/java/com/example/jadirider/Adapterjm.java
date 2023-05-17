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

public class Adapterjm extends RecyclerView.Adapter<holder> {
    Context context;
    List<jenism>listjm;

    public Adapterjm(Context context, List<jenism> listjm) {
        this.context = context;
        this.listjm = listjm;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.itemjm, parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        jenism jenismo = listjm.get(position);
        holder.img.setImageResource(jenismo.getImgjm());
        holder.njmi.setText(jenismo.getNama());
        holder.cjmi.setText(jenismo.getContoh());
        holder.djmi.setText(jenismo.getDeskripsi());

    }

    @Override
    public int getItemCount() {
        return listjm.size();
    }
}
class holder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView njmi,cjmi,djmi;

    public holder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.imgjm);
        njmi = itemView.findViewById(R.id.njm);
        cjmi = itemView.findViewById(R.id.cjm);
        djmi = itemView.findViewById(R.id.djm);
    }
}
