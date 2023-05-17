package com.example.jadirider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Perlengkapan extends AppCompatActivity {

    RecyclerView recyclep;

    List<perle>listper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perlengkapan);
        inidummyp();
        recyclep = findViewById(R.id.recyp);
        Adapterp adapterpe = new Adapterp(this,listper);
        recyclep.setAdapter(adapterpe);
        recyclep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void inidummyp() {
        listper = new ArrayList<>();
        listper.add(new perle("1. Helm Full Face atau Modular","Helm merupakan salah satu hal terpenting saat berkendara karena dapat melindungi kepala pengendara. Saat touring, disarankan untuk memakai helm full face atau modular yang memberikan perlindungan untuk seluruh kepala kamu dari semua sisi.",R.drawable.helmfullface));
        listper.add(new perle("2. Jaket Anti Air","Jaket Anti Air merupakan salah satu perlengkapan yang harus dibawa karena pada saat touring bisa saja cuacanya berubah-ubah, maka untuk mengantisipasi hal tersebut jaket anti air ini harus dibawa",R.drawable.jaket));
        listper.add(new perle("3. Kotak P3K","Kotak P3K merupakan salah satu perlengkapan terpenting saat touring karena apabila terjadi kecelakaan, atau merasa pusing, tidak enak badan, dan flu perlengkapan ini sangat membantu dalam melakukan pertolongan pertama.Kotak P3K biasanya berisikan obat-obatan pribadi, dan lotion anti nyamuk, salep pereda nyeri, plester luka, minyak kayu putih, obat merah antiseptik dan kapas.",R.drawable.kp));
        listper.add(new perle("4. Sarung Tangan","Sarung tangan bertujuan untuk kulit agar tidak terbakar sinar matahari secara langsung. Gunakan lah sarung tangan dengan berbahan yang tebal atau dari kulit. Dan juga pastikan, ukuran sarung tangan tidak terlalu sempit atau terlalu longgar.",R.drawable.sarungt));
        listper.add(new perle("6. Tool Kit","Tool Kit merupakan salahsatu perlengkapan yang terpenting karena apabila terjadi kerusakan minor pada kendaraan, tool kit ini bisa menjadi hal yang sangat membantu. Kotak peralatan ini biasanya berisikan obeng, tang, selotip, kabel, kunci inggris bahkan 3 kunci L",R.drawable.tool));

    }
}