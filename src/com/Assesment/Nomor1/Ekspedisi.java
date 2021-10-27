package com.Assesment.Nomor1;

public class Ekspedisi {
    private double OngkosKirim;
    private String NamaEkspedisi;
    private String NomorResi;

    Ekspedisi(String NamaEkspedisi, double OngkosKirim, String NomorResi) {
        this.NamaEkspedisi = NamaEkspedisi;
        this.OngkosKirim = OngkosKirim;
        this.NomorResi = NomorResi;
    }

    @Override
    public String toString() {
        return "Nomor Resi : " + NomorResi
                + "\nNama Ekspedisi : " + NamaEkspedisi
                + "\nOngkos Kirim : " +  OngkosKirim;

    }
/*    String getNamaEkspedisi(){
        return NamaEkspedisi;
    }
    String getOngkosKirim(){
        return OngkosKirim;
    }
    String getNomorResi(){
        return NomorResi;
    }*/
}
