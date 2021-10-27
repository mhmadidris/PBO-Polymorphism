package com.Assesment.Nomor1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Penjual penjual1 = new Penjual();
        penjual1.setNamaPenjual("Dropship1");
        penjual1.setAlamatPenjual("Surabaya");
        Penjual penjual2 = new Penjual();
        Penjual penjual3 = new Penjual();
        Penjual penjual4 = new Penjual();
        penjual4.setNamaPenjual("Dropship2");
        penjual4.setAlamatPenjual("Pontianak");


        Pembeli pembeli1 = new Pembeli("Bejo", "DayeuhKolot");
        Pembeli pembeli2 = new Pembeli("Tini", "DayeuhKolot");
        Pembeli pembeli3 = new Pembeli("Bambang", "DayeuhKolot");
        Pembeli pembeli4 = new Pembeli("Joko", "DayeuhKolot");

        Ekspedisi ekspedisi1 = new Ekspedisi("JNE", 21000, "N0001");
        Ekspedisi ekspedisi2 = new Ekspedisi("J&T", 16000, "N0003");
        Ekspedisi ekspedisi3 = new Ekspedisi("Pos Indonesia", 23000, "N0004");
        Ekspedisi ekspedisi4 = new Ekspedisi("siCepat", 24000, "N0002");


        ArrayList pengiriman1 = new ArrayList();
        pengiriman1.add(ekspedisi1);
        pengiriman1.add(penjual1);
        pengiriman1.add(pembeli1);
        for (Object ap : pengiriman1){
            System.out.println(ap);
        }
    }
}
