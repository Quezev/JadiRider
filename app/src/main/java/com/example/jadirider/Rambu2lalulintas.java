package com.example.jadirider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Rambu2lalulintas extends AppCompatActivity {

    RecyclerView recyclrl;

    List<rambul>lisrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rambu2lalulintas);
        inidummy();
        recyclrl = findViewById(R.id.recyrl);
        Adapterrl adapterr = new Adapterrl(this,lisrl);
        recyclrl.setAdapter(adapterr);
        recyclrl.setLayoutManager(new LinearLayoutManager(this));
    }

    private void inidummy() {
        lisrl =new ArrayList<>();
        lisrl.add(new rambul("A. Rambu Peringatan","Rambu Peringatan adalah rambu yang dibuat untuk memberikan peringatan kepada pengguna jalan. Biasanya isinya berupa peringatan tentang kondisi jalan atau kemungkinan bahaya yang akan ditemui di lintasan jalan tersebut. Bentuknya umumnya berupa plat berbentuk persegi. Rambu ini umumnya berwarna dasar kuning dengan tulisan atau gambar berwarna hitam",R.drawable.rambu));
        lisrl.add(new rambul("B. Rambu Larangan","Rambu Larangan adalah rambu-rambu lalu lintas yang berisi larangan bagi pengguna jalan yang melintasi jalan tersebut atau larangan melakukan aktivitas tertentu.",R.drawable.rambula));
        lisrl.add(new rambul("C. Rambu Perintah","Rambu Perintah adalah rambu-rambu lalu lintas yang berisi perintah untuk ditaati oleh pengguna jalan tempat rambu tersebut terpasang. Rambu perintah juga terbuat dari plat dengan bentuk lingkaran berwarna putih dan simbol larangan berwarna hitam dan merah",R.drawable.rambupe));
        lisrl.add(new rambul("D. Rambu Petunjuk","Rambu petunjuk adalah rambu-rambu lalu lintas yang berfungsi untuk memberikan petunjuk kepada pengguna jalan.Rambu petunjuk biasanya berbentuk persegi, dengan warna dasar berwarna hijau dengan gambar atau tulisan berwarna putih.",R.drawable.rambupet));
    }
}