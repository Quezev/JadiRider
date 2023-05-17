package com.example.jadirider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class simkendaraan extends AppCompatActivity {
    RecyclerView recy;

    List<sim>lissi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simkendaraan);
         inidummysi();
         recy = findViewById(R.id.recysi);
         Adaptersim adapters = new Adaptersim(this,lissi);
         recy.setAdapter(adapters);
         recy.setLayoutManager(new LinearLayoutManager(this));

    }

    private void inidummysi() {
        lissi = new ArrayList<>();
        lissi.add(new sim("1. SIM A","SIM A diperuntukan bagi para pengemudi mobil pribadi dengan total berat kendaraan tidak melebihi 3.500kg",R.drawable.sima));
        lissi.add(new sim("2. SIM B1","SIM B1 diperuntukan bagi para pengemudi mobil penumpang atau kendaraan barang dengan berat kendaraan di atas  3.500kg. SIM B1 terbagi menjadi dua, yaitu SIM B1 dan SIM B1 Umum.Perbedannya adalah kalau yang B1 bersifat kendaraan pribadi dan kalau B1 Umum kendaraan umum",R.drawable.simb));
        lissi.add(new sim("3. SIM B2","SIM B2 diperuntukan bagi pengemudi kendaraan penarik, alat berat, dan truk gandeng perseorangan dengan berat kendaraan lebih dari 1.000kg. SIM B2 terbagi menjadi dua, yaitu SIM B2 dan SIM B2 Umum. Perbedannya adalah kalau yang B1 bersifat kendaraan pribadi dan kalau B1 Umum kendaraan umum",R.drawable.bd));
        lissi.add(new sim("4. SIM C","SIM C diperuntukan bagi pengendara roda dua atau sepeda motor dengan tiga kapasitas silinder mesin. SIM C terbagi menjadi tiga jenis, yaitu SIM C(digunakan untuk cc nya dibawah 250), SIM C1 (digunakan untuk cc yang 250-500), dan SIM C2 ( digunakan untuk cc yang lebih dari 500).",R.drawable.simc));
        lissi.add(new sim("5. SIM D","SIM D dikhususkan untuk penyandang disabilitas",R.drawable.simd));
    }
}