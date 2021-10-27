package com.Assesment.Nomor2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ShowroomJaya {
    private ArrayList<Mobil> arrMobil = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Tambah Mobil");
        System.out.println("2. Beli Mobil");
        System.out.println("3. Lihat Stok");
        System.out.print("Jawaban : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1 -> {
                System.out.println("\nTambah Mobil");
                System.out.print("Merk : ");
                String merk = input.next();
                System.out.print("Tahun : ");
                String tahun = input.next();
                System.out.print("Harga : ");
                double harga = input.nextDouble();
                System.out.print("Stok : ");
                int stok = input.nextInt();
                ShowroomJaya.tambahMobil(merk, harga, tahun, stok);
            }
            case 2 -> {
                System.out.println("\nBeli Mobil");
                System.out.print("Merk : ");
                String merk = input.next();
                System.out.print("Jumlah : ");
                int jumlah = input.nextInt();
                ShowroomJaya.beliMobil(merk, jumlah);
            }
            case 3 -> {
                System.out.println("\nLihat Stok");

            }
            default -> System.out.println("Data tidak tersedia");
        }
    }

    public static void tambahMobil(String nama, double harga, String tahun, int jumlahStok){
        Mobil mb1 = new Mobil(nama, tahun, harga, jumlahStok);
        Object tambah = mb1.displayInfo();
        System.out.println(tambah);
    }

    public static void beliMobil(String nama, int jumlah){
        ArrayList arrayList = new ArrayList<String>();
        Mobil pa = new Mobil("Avanza", "2018", 248300000.0, 5);
        Mobil pl = new Mobil("Avanza", "2018", 248300000.0, 5);
        arrayList.add(pa);
        arrayList.add(pl);
        String mb = arrayList.toString();
        if (nama == pa.getMerk() && jumlah == 1) {
            int disPercent = 0;
            double totalHarga = pa.getHarga() * jumlah;
            double totalDiskon = (disPercent*totalHarga)/100;
            System.out.println("\nINPUT" +
                    "\nMerk : " + nama +
                    "\nTahun Keluaran : " + pa.getTahunKeluaran() +
                    "\nJumlah : " + jumlah

            );
            System.out.println("\nOUTPUT" +
                    "\nMerk : " + pa.getMerk() +
                    "\nHarga : " + pa.getHarga() +
                    "\nTahun Keluaran : " + pa.getTahunKeluaran() +
                    "\nJumlah Beli : " + jumlah +
                    "\nTotal Harga : " + (pa.getHarga() * jumlah) +
                    "\nDiskon : " + (disPercent) + " persen" +
                    "\nTotal Diskon : " + ((disPercent*totalHarga)/100) +
                    "\nTotal Bayar : " +  (totalHarga-totalDiskon)
            );
        } else if (Objects.equals(mb, nama) && jumlah == 2) {
            int disPercent = 10;
            double totalHarga = pa.getHarga() * jumlah;
            double totalDiskon = (disPercent*totalHarga)/100;
            System.out.println("\nINPUT" +
                    "\nMerk : " + nama +
                    "\nTahun Keluaran : " + pa.getTahunKeluaran() +
                    "\nJumlah : " + jumlah

            );
            System.out.println("\nOUTPUT" +
                    "\nMerk : " + pa.getMerk() +
                    "\nHarga : " + pa.getHarga() +
                    "\nTahun Keluaran : " + pa.getTahunKeluaran() +
                    "\nJumlah Beli : " + jumlah +
                    "\nTotal Harga : " + (pa.getHarga() * jumlah) +
                    "\nDiskon : " + (disPercent) + " persen" +
                    "\nTotal Diskon : " + ((disPercent*totalHarga)/100) +
                    "\nTotal Bayar : " +  (totalHarga-totalDiskon)
            );
        } else if (Objects.equals(mb, nama) && jumlah > 2){
            int disPercent = 20;
            double totalHarga = pa.getHarga() * jumlah;
            double totalDiskon = (disPercent*totalHarga)/100;
            System.out.println("\nINPUT" +
                    "\nMerk : " + nama +
                    "\nTahun Keluaran : " + pa.getTahunKeluaran() +
                    "\nJumlah : " + jumlah

            );
            System.out.println("\nOUTPUT" +
                    "\nMerk : " + pa.getMerk() +
                    "\nHarga : " + pa.getHarga() +
                    "\nTahun Keluaran : " + pa.getTahunKeluaran() +
                    "\nJumlah Beli : " + jumlah +
                    "\nTotal Harga : " + (pa.getHarga() * jumlah) +
                    "\nDiskon : " + (disPercent) + " persen" +
                    "\nTotal Diskon : " + ((disPercent*totalHarga)/100) +
                    "\nTotal Bayar : " +  (totalHarga-totalDiskon)
            );
        }
        else {
            System.out.println("Maaf Mobil Tidak Tersedia");
        }
    }

    public void viewStock(){
        for (Mobil mobil : arrMobil){
            mobil.displayInfo();
        }
    }
}
