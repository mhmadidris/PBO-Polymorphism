package com.Assesment.Nomor2;

public class Mobil {
    private String merk;
    private String tahunKeluaran;
    private double harga;
    private int stok;

    Mobil(String merk, String tahunKeluaran, double harga, int stok) {
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    String getMerk() {
        return merk;
    }
    String getTahunKeluaran() {
        return tahunKeluaran;
    }
    double getHarga() {
        return harga;
    }
    int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public Object displayInfo() {
        System.out.println("\nInformasi Mobil");
        return "Merk : " + getMerk() +
                "\nHarga : " + getHarga() +
                "\nTahun Keluaran : " + getTahunKeluaran() +
                "\nSisa Stok : " + getStok();
    }
}
