package com.example.jadirider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button jmotor, rambul, bmotor, platm, sim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jmotor = (Button) findViewById(R.id.jmotor);
        rambul = (Button) findViewById(R.id.rambul);
        bmotor = (Button) findViewById(R.id.bmotor);
        platm = (Button) findViewById(R.id.platm);
        sim = (Button) findViewById(R.id.sim);

        jmotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,JenisMotor.class);
                startActivity(i);
            }
        });

        rambul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r = new Intent(MainActivity.this,Rambu2lalulintas.class);
                startActivity(r);
            }
        });

        bmotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this,Perlengkapan.class);
                startActivity(b);
            }
        });

        platm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(MainActivity.this,Plat2motor.class);
                startActivity(p);
            }
        });

        sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(MainActivity.this,simkendaraan.class);
                startActivity(s);
            }
        });
    }
}