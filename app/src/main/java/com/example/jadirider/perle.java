package com.example.jadirider;

public class perle {
    String nama, deskripsi;
    int imgpr;

    public perle(String nama, String deskripsi, int imgpr) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.imgpr = imgpr;
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

    public int getImgpr() {
        return imgpr;
    }

    public void setImgpr(int imgpr) {
        this.imgpr = imgpr;
    }
}
