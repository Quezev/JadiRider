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

public class Adapterp extends RecyclerView.Adapter<holderp> {
    Context contextp;
    List<perle>listp;

    public Adapterp(Context contextp, List<perle> listp) {
        this.contextp = contextp;
        this.listp = listp;
    }

    @NonNull
    @Override
    public holderp onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contextp);
        View view = inflater.inflate(R.layout.itemp, parent,false);
        return new holderp(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holderp holder, int position) {
        perle perleo = listp.get(position);
        holder.imgpn.setImageResource(perleo.getImgpr());
        holder.n.setText(perleo.getNama());
        holder.d.setText(perleo.getDeskripsi());

    }

    @Override
    public int getItemCount() {
        return listp.size();
    }
}
class holderp extends RecyclerView.ViewHolder{
    ImageView imgpn;
    TextView n,d;

    public holderp(@NonNull View itemView) {
        super(itemView);
        imgpn = itemView.findViewById(R.id.imgp);
        n = itemView.findViewById(R.id.np);
        d = itemView.findViewById(R.id.dp);
    }
}
