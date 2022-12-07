package model;
import java.util.Scanner;
import java.util.ArrayList;
import entity.*;

public class DataBukuModel {
    String nama;
    String JudulBuku;
    String karangan;
    String penulis;
    String penerbit;
    int tahunTerbit;
    int jumlah;
    int id;
    ArrayList <BukuEntity> bukuArrayList = new ArrayList<BukuEntity>();

    Scanner input = new Scanner(System.in);

    public void dataBuku(){
        PenerbitEntity terbit1 = new PenerbitEntity("Gramedia", 2000);
        PenerbitEntity terbit2 = new PenerbitEntity("Airlangga", 2001);

        BukuEntity buku1 = new BukuEntity("Tutorial Java", "Achmad", terbit1,0);
        BukuEntity buku2 = new BukuEntity("Tutorial Python", "Prasetya", terbit2, 12);
        bukuArrayList.add(buku1);
        bukuArrayList.add(buku2);
    }

    public void tambahBuku(){
        System.out.print("Masukkan Judul buku   = ");
        JudulBuku = input.nextLine();
        System.out.print("Masukkan Karangan     = ");
        karangan = input.nextLine();
        System.out.print("Masukkan Penerbit     = ");
        penerbit = input.nextLine();
        input.nextLine();
        System.out.print("Masukkan Tahun Terbit = ");
        tahunTerbit = input.nextInt();
        System.out.print("Masukkan Jumlah Buku  = ");
        jumlah =input.nextInt();
        input.nextLine();

        PenerbitEntity objekPenerbit = new PenerbitEntity(penerbit, tahunTerbit);
        BukuEntity objekBuku = new BukuEntity(JudulBuku, karangan, objekPenerbit, jumlah);
        bukuArrayList.add(objekBuku);
    }

    public void cariUser(){
        System.out.print("Cari nama ");
        nama = input.nextLine();
        BukuEntity dataCari = cariDataNama(nama);
        if(dataCari!=null){
            if(dataCari.getJumlah() == 0){
                System.out.println("buku Kosong");
            }
            else{
                System.out.println();
                System.out.println("=====================================================");
                System.out.println("Judul         = " + dataCari.getJudulBuku());
                System.out.println("karangan      = " + dataCari.getKarangan());
                System.out.println("penerbit      = " + dataCari.getTerbit().getPenerbit());
                System.out.println("Tahun Terbit  = " + dataCari.getTerbit().getTahunTerbit());
                System.out.println("Jumlah buku   = " + dataCari.getJumlah());
                System.out.println("=====================================================");
                System.out.println();
            }
            
        }
        else{
            System.out.println("tidak ada data");
        }
    }

    public BukuEntity cariDataNama (String nama){
        for (BukuEntity nama2 : bukuArrayList){
            if(nama2.getJudulBuku().equals(nama)){
                return nama2;
            }
        }
        return null;
    }

    public void viewBuku(){
        if(bukuArrayList.isEmpty()){
            System.out.println("Data Tidak ada");
        }
        
        else{
            for (BukuEntity buku : bukuArrayList) {
                if(buku.getJumlah() == 0){
                    System.out.println();
                    System.out.println("=====================================================");
                    System.out.println("Judul         = " + buku.getJudulBuku());
                    System.out.println("karangan      = " + buku.getKarangan());
                    System.out.println("penerbit      = " + buku.getTerbit().getPenerbit());
                    System.out.println("Tahun Terbit  = " + buku.getTerbit().getTahunTerbit());
                    System.out.println("Jumlah buku   = kosong");
                    System.out.println("=====================================================");
                    System.out.println();
                }
                
                else {
                    System.out.println();
                    System.out.println("=====================================================");
                    System.out.println("Judul         = " + buku.getJudulBuku());
                    System.out.println("karangan      = " + buku.getKarangan());
                    System.out.println("penerbit      = " + buku.getTerbit().getPenerbit());
                    System.out.println("Tahun Terbit  = " + buku.getTerbit().getTahunTerbit());
                    System.out.println("Jumlah buku   = " + buku.getJumlah());
                    System.out.println("=====================================================");
                    System.out.println();
                }
            }
        }
                
    }
    
}
