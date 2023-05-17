package com.example.jadirider;

public class rambul {
    String nama, deskripsi;
    int imgrm;

    public rambul(String nama, String deskripsi, int imgrm) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.imgrm = imgrm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getImgrm() {
        return imgrm;
    }

    public void setImgrm(int imgrm) {
        this.imgrm = imgrm;
    }
}
