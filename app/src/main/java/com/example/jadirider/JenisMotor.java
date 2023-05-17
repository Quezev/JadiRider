package com.example.jadirider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class JenisMotor extends AppCompatActivity {

    RecyclerView recycle;
    List<jenism>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_motor);
        inidatadummy();
        recycle = findViewById(R.id.recyjm);
        Adapterjm adapterj = new Adapterjm(this,list);
        recycle.setAdapter(adapterj);
        recycle.setLayoutManager(new LinearLayoutManager(this));
    }

    private void inidatadummy() {
        list = new ArrayList<>();
        list.add(new jenism("1. Motor Bebek","Honda Supra X, Yamaha Jupiter MX, Yamaha Jupiter Z1, dan Yamaha Vega Force","Motor bebek adalah sepeda motor kecil yang dibangun di atas kerangka yang sebagian besar terdiri atas pipa berdiameter besar. Disebut motor bebek karena desain motor jika dilihat dari samping sama seperti lekukan bebek, yang paling terlihat dengan adanya fairing tipis kiri dan kanan yang menyerupai sayap bebek",R.drawable.motorbebek));
        list.add(new jenism("2. Motor Scooter","Honda Vario 125, Honda Vario 150, Yamaha NMAX,dan Yamaha Aerox","Motor Scooter adalah sepeda motor yang memiliki area lantai pijakan untuk pengendara",R.drawable.nx));
        list.add(new jenism("3. Motor Dual Sport","Kawasaki KLX, Yamaha WR155R, Honda XR, dan Yamaha Serow","Motor Dual Sport adalah sepeda motor didesain untuk keperluan on road (dijalanan Aspal) dan off road (dijalanan tanah)",R.drawable.wr));
        list.add(new jenism("4. Motor Naked","Yamaha Vixion, Yamaha MT-15, Yamaha MT-25, KTM Duke 390, dan Honda CB150R","Motor Naked adalah sepeda motor yang tidak ditutupi oleh bodi (fairing)",R.drawable.vx));
        list.add(new jenism("5. Motor Sport","Kawasaki Ninja H2, Kawasaki Ninja ZX25R, Kawasaki Ninja ZX10R, Yamaha R1, dan Yamaha R6","Motor Sport adalah sepeda motor yang berpenampilan seperti motor balap atau memiliki performa mesin diatas rata-rata sepeda motor jenis skuter dan bebek",R.drawable.r));
        list.add(new jenism("6. Motor Retro","Kawasaki W175, Yamaha XSR155, Kawasaki W250, Vespa LX 125, dan Royal Enfield Classic 350","Motor Retro adalah sepeda motor modern yang didesain dengan nuansa gaya klasik",R.drawable.x));
        list.add(new jenism("7. Motor Cruiser","Harley Davidson Iron 883 Standard, Harley Davidson Forty Eight Standard, Harley Davidson Street 500, dan Harley Davidson Street Bob","Motor Cruiser adalah sepeda motor yang menggunakan mesin yang berkapasitas besar dengan memiliki posisi mengemudi unik di mana possisi stang terletak lebih ke atas dari motor biasa, letak kursi yang rendah, dan peletakkan kaki yang sedikit memanjang",R.drawable.hds));
    }

}