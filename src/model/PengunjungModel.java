package model;
import entity.PengunjungEntity;
import java.util.ArrayList;
import java.util.Scanner;
import view.PengunjungView;

public class PengunjungModel extends DataBukuModel{
    String username;
    String password;
    String alamat;
    String pekerjaan;
    String gender;
    String nama;
    String buku;

    Scanner input = new Scanner(System.in);

    ArrayList<PengunjungEntity> arrayListPengunjung = new ArrayList<>();

    public void tambahAkunUser(){
        System.out.print("Masukkan Username     = ");
        username = input.nextLine();
        System.out.print("Masukkan Password     = ");
        password = input.nextLine();
        System.out.print("Masukkan Nama         = ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat       = ");
        alamat = input.nextLine();
        System.out.print("Masukkan Pekerjaan    = ");
        pekerjaan = input.nextLine();
        System.out.print("Masukkan Gender       = ");
        gender = input.nextLine();

        PengunjungEntity objekPengunjung = new PengunjungEntity(username, password, nama, alamat, pekerjaan, gender);
        arrayListPengunjung.add(objekPengunjung);
    }

    public void pinjam(){
        System.out.print("Masukkan buku yang dipinjam   = ");
        buku = input.nextLine();
        // PengunjungEntity objekPengunjung = new PengunjungEntity(objekPengunjung.setBuku(JudulBuku));
        // objekPengunjung.setBuku(JudulBuku);
        // arrayListPengunjung.add(objekPengunjung);
    }

    public void pinjamView(){
        System.out.println("View");
        String in = input.nextLine();
        cariPengunjung();
    }

    public void cariPengunjung(){
        PengunjungEntity objekPengunjung = cariData(username,password);
        if(objekPengunjung!=null){
            System.out.println();
            System.out.println("Nama       = " + objekPengunjung.getNama());   
            System.out.println("Alamat     = " + objekPengunjung.getAlamat());   
            System.out.println("Pekerjaan  = " + objekPengunjung.getPekerjaan());   
            System.out.println("Gender     = " + objekPengunjung.getGender());
            System.out.println("Buku Yang dipinjam = " + objekPengunjung.getBuku());
            System.out.println();  
        }
        else{
            System.out.println("tidak ada data");
        }
    }

    public void loginPengunjung(){
        System.out.print("Masukkan Username = ");
        username = input.nextLine();
        System.out.print("Masukkan Password = ");
        password = input.nextLine();
        PengunjungEntity objekPengunjung = cariData(username, password);
        cariPengunjung();
        if(objekPengunjung!=null){
            PengunjungView view = new PengunjungView();
            view.pengunjungMenu(); 
        }
        else{
            System.out.println("salah");
        }
    }

    public PengunjungEntity cariData (String username,String password){
        for (PengunjungEntity objekPengunjung : arrayListPengunjung){
            if(objekPengunjung.getUsername().equals(username)&&objekPengunjung.getPassword().equals(password)){
                return objekPengunjung;
            }
        }
        return null;
    }
}
