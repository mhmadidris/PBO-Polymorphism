package com.Assesment.Nomor1;

public class Penjual {
    private String NamaPenjual;
    private String AlamatPenjual;

    Penjual(){
        this.NamaPenjual = "Eiger";
        this.AlamatPenjual = "Bandung Kopo";
    }

    void setNamaPenjual(String NamaPenjual){
        this.NamaPenjual = NamaPenjual;
    }
    void setAlamatPenjual(String AlamatPenjual){
        this.AlamatPenjual = AlamatPenjual;
    }

    @Override
    public String toString() {
        return "Nama Pengirim : " + NamaPenjual + "\n" + "Alamat Pengirim : " +  AlamatPenjual;

    }
/*    String getNamaPenjual(){
        return NamaPenjual;
    }
    String getAlamatPenjual(){
        return AlamatPenjual;
    }*/
}
