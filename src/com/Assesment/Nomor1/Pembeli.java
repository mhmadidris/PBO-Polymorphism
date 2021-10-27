package com.Assesment.Nomor1;

public class Pembeli {
    private String NamaPembeli;
    private String AlamatPembeli;

    Pembeli(String NamaPembeli, String AlamatPembeli){
        this.NamaPembeli = NamaPembeli;
        this.AlamatPembeli = AlamatPembeli;
    }

    @Override
    public String toString() {
        return "Nama Pembeli : " + NamaPembeli + "\n" + "Alamat Pembeli : " +  AlamatPembeli;

    }

/*    String getNamaPembeli(){
        return NamaPembeli;
    }
    String getAlamatPembeli(){
        return AlamatPembeli;
    }*/

}
