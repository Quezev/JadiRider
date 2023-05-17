package com.example.jadirider;

public class jenism {
    String nama,contoh,deskripsi;
    int imgjm;

    public jenism(String nama, String contoh, String deskripsi, int imgjm){
        this.nama = nama;
        this.contoh = contoh;
        this.deskripsi = deskripsi;
        this.imgjm = imgjm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getContoh() {
        return contoh;
    }

    public void setContoh(String contoh) {
        this.contoh = contoh;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getImgjm() {
        return imgjm;
    }

    public void setImgjm(int imgjm) {
        this.imgjm = imgjm;
    }
}
