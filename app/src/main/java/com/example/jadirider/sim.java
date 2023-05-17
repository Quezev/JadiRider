package com.example.jadirider;

public class sim {
    String nama,deskripsi;
    int imgs;

    public sim(String nama, String deskripsi, int imgs) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.imgs = imgs;
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

    public int getImgs() {
        return imgs;
    }

    public void setImgs(int imgs) {
        this.imgs = imgs;
    }
}
