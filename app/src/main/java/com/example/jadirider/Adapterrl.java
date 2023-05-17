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

public class Adapterrl extends RecyclerView.Adapter<holderrl> {
    Context contextrl;
    List<rambul>listrl;

    public Adapterrl(Context contextrl, List<rambul> listrl) {
        this.contextrl = contextrl;
        this.listrl = listrl;
    }

    @NonNull
    @Override
    public holderrl onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contextrl);
        View view = inflater.inflate(R.layout.itemrl, parent,false);
        return new holderrl(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holderrl holder, int position) {
        rambul rambulo = listrl.get(position);
        holder.imgr.setImageResource(rambulo.getImgrm());
        holder.nrli.setText(rambulo.getNama());
        holder.drli.setText(rambulo.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return listrl.size();
    }
}
class holderrl extends RecyclerView.ViewHolder{
    ImageView imgr;
    TextView nrli, drli;

    public holderrl(@NonNull View itemView) {
        super(itemView);
        imgr = itemView.findViewById(R.id.imgrl);
        nrli = itemView.findViewById(R.id.nrl);
        drli = itemView.findViewById(R.id.drl);
    }
}
